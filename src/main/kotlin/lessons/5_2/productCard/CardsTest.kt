package org.example.lessons.`5_2`.productCard

import org.example.lessons.`5_2`.productCard.Condition
import org.example.lessons.`5_2`.productCard.enums.ClothingCategory
import org.example.lessons.`5_2`.productCard.enums.ClothingSize
import org.example.lessons.`5_2`.productCard.enums.Color
import org.example.lessons.`5_2`.profile.Person

fun main() {
    val clothingCards = ProductRepository.clothingCards
//    clothingCards.forEach { println(it) }
    var filterCards = filter(clothingCards, object : Condition {
        override fun isSuitable(productCard: ClothingCard): Boolean { //вызов метода через анонимный класс позволяет не плодить классы под каждое требование
            return productCard.color == Color.RED
        }
    })
    filterCards = filter(filterCards, object: Condition {
        override fun isSuitable(productCard: ClothingCard): Boolean {
            return productCard.size == ClothingSize.SMALL
        }
    })
    filterCards = filter(filterCards, object: Condition {
        override fun isSuitable(productCard: ClothingCard): Boolean {
            return productCard.category == ClothingCategory.SHOES
        }
    })

    filterCards.forEach { println(it) }

}

fun filter(list: List<ClothingCard>, condition: Condition): List<ClothingCard> {
    val filterList = mutableListOf<ClothingCard>()
    for (card in list) {
        if (condition.isSuitable(card)) {
            filterList.add(card)
        }
    }
    return filterList
}