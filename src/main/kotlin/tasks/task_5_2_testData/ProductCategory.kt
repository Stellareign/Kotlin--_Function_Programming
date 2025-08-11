package tasks.task_5_2_testData

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class ProductCategory {
    @SerialName("Home Goods")
    HOME_GOODS,
    @SerialName("Electronics")
    ELECTRONICS,
    @SerialName("Sports")
    SPORTS,
    @SerialName("Clothing")
    CLOTHING,
    @SerialName("Beauty")
    BEAUTY
}