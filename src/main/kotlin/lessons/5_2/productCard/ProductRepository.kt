package org.example.lessons.`5_2`.productCard

import kotlinx.serialization.json.Json
import java.io.File

object ProductRepository {
    private val clothingCardsFile = File("clothing_cards.json")
    private val _clothingList = loadClothingCards()

    val clothingCards
        get() = _clothingList.toList()

    private fun loadClothingCards(): MutableList<ClothingCard> {
        return Json.decodeFromString(clothingCardsFile.readText().trim())
    }
}