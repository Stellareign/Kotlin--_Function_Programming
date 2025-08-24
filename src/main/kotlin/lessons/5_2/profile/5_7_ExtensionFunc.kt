package org.example.lessons.`5_2`.profile

import org.example.lessons.extensionFunctions.filterList
import org.example.lessons.extensionFunctions.transformElement

fun main() {
    val list = ProfileRepository.profiles
    list.filterList{it.gender == Gender.MALE}
        .filterList{it.firstName.startsWith("M")}
        .filterList{it.age > 40}
        .transformElement { it.copy(age = it.age+1) }
        .forEach{println(it)}

}


fun <T> List<Person>.transformList(operation: (Person) -> T): List<T> { // дженерики
    val result = mutableListOf<T>()
    for (person in this) {
        result.add(operation(person))
    }
    return result
}

fun List<Person>.filter(isSuitable: (Person) -> Boolean): List<Person> {
    val filterList = mutableListOf<Person>()
    for (person in this) {
        if (isSuitable(person)) {
            filterList.add(person)
        }
    }
    return filterList
}