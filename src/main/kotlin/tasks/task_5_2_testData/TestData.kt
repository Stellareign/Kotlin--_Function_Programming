package org.example.tasks.task_5_2_testData

import kotlinx.serialization.json.Json
import tasks.task_5_2_testData.Product
import java.io.File

// TODO: Создайте enum-класс ProductCategory с фиксированными значениями, соответствующими категориям из JSON.
// Значения перечислений определите, ознакомившись с данными в прикрепленном файле products.txt.
// Используйте аннотации @Serializable и @SerialName для всех полей, чтобы обеспечить точное сопоставление с ключами JSON.

// TODO: Создайте data class Product для описания объекта продукта.
// Используйте аннотации @Serializable и @SerialName для всех полей, чтобы обеспечить точное сопоставление с ключами JSON.

// TODO: Реализуйте функцию loadProducts, которая:
// - Принимает строку JSON.
// - Преобразует её в коллекцию объектов Product.


fun loadProducts(jsonContent: String): List<Product> {
    // Замените Any на класс Product
    return Json.decodeFromString<List<Product>>(jsonContent)

}
fun main() {
    val jsonContent = File("products_5_2.json").readText().trim()
   val s = loadProducts(jsonContent = jsonContent)
    s.forEach { println(it) }
}