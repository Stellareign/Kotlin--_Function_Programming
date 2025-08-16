package org.example.lessons.`5_2`.profile

fun main() {
//
    val list = ProfileRepository.profiles
//    list.forEach { println(it) }
//    var filter = filter(list, ConditionOlderThan25())
//    filter = filter(list, ConditionNameSartWithA())
//    filter = filter(list, ConditionGenderFemale())
    val filterRus =filter(list, ConditionRussian())
    filterRus.forEach { println(it) }

}

fun filter(list: List<Person>, condition: Condition): List<Person> { // единственный метод, работающий через анонимный класс; остальные методы теперь не нужны
    val filterList = mutableListOf<Person>()
    for (person in list) {
        if (condition.isSuitable(person)) {
            filterList.add(person)
        }
    }
    return filterList
}

fun filterPersonOldestThan25(list: List<Person>): List<Person> {
    val filterList = mutableListOf<Person>()
    for (person in list) {
        if (person.age > 25) {
            filterList.add(person)
        }
    }
    return filterList
}

fun filterPersonNameSartWithA(list: List<Person>): List<Person> {
    val filterList = mutableListOf<Person>()
    for (person in list) {
        if (person.firstName.startsWith("A")) {
            filterList.add(person)
        }
    }
    return filterList
}

fun filterPersonFemale(list: List<Person>): List<Person> {
    val filterList = mutableListOf<Person>()
    for (person in list) {
        if (person.gender == Gender.FEMALE) {
            filterList.add(person)
        }
    }
    return filterList
}
