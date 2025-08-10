package org.example.lessons.`5_2`.productCard.enums

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ClothingSize(val title: String) {
    @SerialName("small")
    SMALL("S"),
    @SerialName("medium")
    MEDIUM("M"),
    @SerialName("large")
    LARGE("L"),
    @SerialName("extra_large")
    EXTRA_LARGE("XL")
}