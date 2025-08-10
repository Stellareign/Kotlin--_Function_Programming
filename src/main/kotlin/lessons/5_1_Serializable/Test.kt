package org.example.lessons.test

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val file = File("items.json")
//    writeFile(file)
    val list = readFile(file)
    list.forEach { println(it) }
}

fun readFile(file: File): List<Item> {
    val content = file.readText().trim()
    val itemJson = Json.decodeFromString<List<Item>>(content)
    return itemJson
}

fun writeFile(file: File) {
    val items = mutableListOf<Item>()
    while (true) {
        println("Enter id or 0 to Exit: ")
        val id: Int = readln().toInt()
        if (id == 0) break
        println("Enter name: ")
        val name = readln()
        val item = Item(id, name)
        items.add(item)
    }
    val itemString = Json.encodeToString(items)
    file.writeText(itemString)
}
