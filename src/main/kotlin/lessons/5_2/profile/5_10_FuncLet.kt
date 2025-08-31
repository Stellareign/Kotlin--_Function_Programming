package org.example.lessons.`5_2`.profile

import org.example.lessons.extensionFunctions.filterList

fun main() {
showEmail()
}

fun showEmail() {
    print("Enter id: ")
    val id = readln().toInt()
    ProfileRepository.profiles
        .find { it.id == id }?.let { println(it.email) } ?: println("No such profile")
}

fun filterCollection() {
    ProfileRepository.profiles
        .filterList { it.gender == Gender.MALE }
//        .filterList { it.firstName.startsWith("M") }
        .filterList { it.age > 40 }
        .map { it.copy(age = it.age + 1) } // можно трансформ заменить на строенный метод map()
        .sortedBy { it.firstName }
        .myForEach { println(it) }
}
