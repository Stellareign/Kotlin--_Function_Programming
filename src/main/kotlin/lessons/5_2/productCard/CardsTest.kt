package org.example.lessons.`5_2`.productCard

fun main() {
    val clothingCards = ProductRepository.clothingCards
    clothingCards.forEach { println(it)}
}