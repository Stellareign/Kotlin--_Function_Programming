package org.example.lessons.`5_2`.profile

import org.example.lessons.extensionFunctions.filterList
import org.example.lessons.extensionFunctions.transformElement

fun main() {
    ProfileRepository.profiles
        .filterList { it.gender == Gender.MALE }
//        .filterList { it.firstName.startsWith("M") }
        .filterList { it.age > 40 }
        .map { it.copy(age = it.age + 1) } // можно трансформ заменить на строенный метод map()
        .sortedBy { it.firstName }
        .myForEach {println(it)}
}

inline fun <T> Iterable<T>.myForEach(myIterable: (T) -> Unit) { // собственный аналог цикла форич
    for (it in this) {
        myIterable(it)
    }
}


