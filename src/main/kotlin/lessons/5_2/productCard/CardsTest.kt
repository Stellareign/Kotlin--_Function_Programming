package org.example.lessons.`5_2`.productCard

import org.example.lessons.`5_2`.productCard.Condition
import org.example.lessons.`5_2`.productCard.enums.ClothingCategory
import org.example.lessons.`5_2`.productCard.enums.ClothingSize
import org.example.lessons.`5_2`.productCard.enums.Color
import org.example.lessons.`5_2`.profile.Person

fun main() {
    val clothingCards = ProductRepository.clothingCards
//    clothingCards.forEach { println(it) }
//    var filterCards = filter1(clothingCards, object : Condition {
//        override fun isSuitable(productCard: ClothingCard): Boolean { //вызов метода через анонимный класс позволяет не плодить классы под каждое требование
//            return productCard.color == Color.RED
//        }
//    })
//   var filtercards2 = filter(clothingCards){it.size == ClothingSize.SMALL }
//    filtercards2 = filter(clothingCards){it.color == Color.RED}
//    filtercards2 = filter(clothingCards){it.category == ClothingCategory.TROUSERS }
//
////    filterCards.forEach { println(it) }
//   filtercards2.forEach { println(it) }
    val filtercards3 = filter(clothingCards){it.category == ClothingCategory.TROUSERS }

    val cardList = transformCard(filtercards3){it.copy(price = it.price*2)}
    val cardList2= transformCard(cardList){"${it.id} - ${it.brand} - ${it.price}\n"}
   cardList2.forEach { print(it) }
}
fun <R> transformCard (cardsList: List <ClothingCard>, operation: (ClothingCard) -> R): List<R>{
    val result = mutableListOf<R>()
    for (card in cardsList){
        result.add(operation(card))
    }
    return result
}

fun filter(list: List<ClothingCard>, isSuitable: (ClothingCard) -> Boolean) : List<ClothingCard> {
    val filterList = mutableListOf<ClothingCard>()
    for (card in list) {
        if (isSuitable(card)) {
            filterList.add(card)
        }
    }
    return filterList
}

fun filter1(list: List<ClothingCard>, condition: Condition): List<ClothingCard> {
    val filterList = mutableListOf<ClothingCard>()
    for (card in list) {
        if (condition.isSuitable(card)) {
            filterList.add(card)
        }
    }
    return filterList
}