package org.example.lessons.`5_2`.productCard.enums

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ClothingCategory(val title: String) {
    @SerialName("shoes")
    SHOES("Обувь"),

    @SerialName("trousers")
    TROUSERS("Брюки"),

    @SerialName("shirt")
    SHIRT("Рубашка"),

    @SerialName("suit")
    SUIT("Костюм")
}