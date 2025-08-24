package org.example.lessons.`5_2`.productCard

import org.example.lessons.`5_2`.productCard.enums.ClothingSize
import org.example.lessons.`5_2`.productCard.enums.Color

fun main() {

    val clothingCards = ProductRepository.clothingCards
    val newList = clothingCards.filterList { it.size == ClothingSize.SMALL }
        .filterList { it.color == Color.BLUE }
        .transformElement { "${it.id} - ${it.category} - ${it.size} - ${it.color}\n" }
    newList.forEach { println(it) }
}

fun <T, R> List<T>.transformElement(operation: (T) -> R): List<R> {
    val result = mutableListOf<R>()
    for (element in this) {
        result.add(operation(element))
    }
    return result
}

fun <T> List<T>.filterList(isSuitable: (T) -> Boolean): List<T> {
    val filterList = mutableListOf<T>()
    for (element in this) {
        if (isSuitable(element)) {
            filterList.add(element)
        }
    }
    return filterList
}