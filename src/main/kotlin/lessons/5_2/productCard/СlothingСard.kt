package org.example.lessons.`5_2`.productCard

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.lessons.`5_2`.productCard.enums.ClothingCategory
import org.example.lessons.`5_2`.productCard.enums.ClothingSize
import org.example.lessons.`5_2`.productCard.enums.Color
import org.example.lessons.`5_2`.productCard.enums.Material

@Serializable
data class ClothingCard(
    @SerialName("product_id") val id: String,
    @SerialName("product_brand") val brand: String,
    @SerialName("product_category") val category: ClothingCategory,
    @SerialName("product_price") val price: Int,
    @SerialName("product_description") val description: String,
    @SerialName("product_color") val color: Color,
    @SerialName("product_size") val size: ClothingSize,
    @SerialName("product_material") val material: Material

) {
}