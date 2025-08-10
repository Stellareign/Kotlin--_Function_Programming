package org.example.lessons.test

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val booksFile = File("books.json")
    writeBooksFile(booksFile)
    val books = reaBooksFile(booksFile)
    books.forEach { println(it) }

}

fun reaBooksFile(file: File): List<Book> {
    return Json.decodeFromString<List<Book>>(File("books.json").readText().trim())
}

fun writeBooksFile(file: File) {
    if (!file.exists()) {
        file.createNewFile()
    }
    val books = reaBooksFile(file).toMutableList()
    while (true) {
        println("Writing 0 to exit or writing book's name")
        val bookName = readln()
        if (bookName == "0") break

        println("Writing book's author")
        val bookAuthor = readln()

        println("Writing book's year")
        val bookYear = readln().toInt()

        val book = Book(bookName, bookAuthor, bookYear)
        books.add(book)
    }
    val booksString = Json.encodeToString(books)
    file.writeText(booksString)
}