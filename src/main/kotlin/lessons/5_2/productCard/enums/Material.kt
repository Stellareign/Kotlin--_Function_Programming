package org.example.lessons.`5_2`.productCard.enums

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Material(val title: String) {
    @SerialName("cotton")
    COTTON("хлопок"),
    @SerialName("polyester")
    POLYESTER("полиэстер"),
    @SerialName("silk")
    SILK("шёлк"),
    @SerialName("wool")
    WOOL("шерсть")
}