package org.example.lessons.`5_2`.productCard

import org.example.lessons.`5_2`.productCard.enums.ClothingSize
import org.example.lessons.`5_2`.productCard.enums.Color
import org.example.lessons.extensionFunctions.filterList
import org.example.lessons.extensionFunctions.transformElement

fun main() {

    val clothingCards = ProductRepository.clothingCards
    val newList = clothingCards.filterList { it.size == ClothingSize.SMALL }
        .filterList { it.color == Color.BLUE }
        .transformElement { "${it.id} - ${it.category} - ${it.size} - ${it.color}\n" }
    newList.forEach { println(it) }
}

