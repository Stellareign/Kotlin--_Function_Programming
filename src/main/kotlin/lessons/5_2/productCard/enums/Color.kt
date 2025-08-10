package org.example.lessons.`5_2`.productCard.enums

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Color(val title: String) {
    @SerialName("red")
    RED("красный"),

    @SerialName("blue")
    BLUE("синий"),

    @SerialName("green")
    GREEN("зелёный"),

    @SerialName("black")
    BLACK("чёрный"),

    @SerialName("white")
    WHITE("белый")
}