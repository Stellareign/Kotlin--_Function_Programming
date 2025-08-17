package org.example.lessons.`5_2`.profile

fun main() {
//
    val list = ProfileRepository.profiles
//    list.forEach { println(it) }
//    var filter = filter(list, ConditionOlderThan25())
//    filter = filter(list, ConditionNameSartWithA())
//    filter = filter(list, ConditionGenderFemale())
//    val filterRus =filter(list, ConditionRussian())

//через анонимный класс
//    val filter = filter(list, object : Condition {
//        override fun isSuitable(person: Person): Boolean {
//            return person.country == "Russia"
//        }
//    })
//    val filterAge44: (Person) -> Boolean = { person: Person -> person.age == 44 }
//    var filter = filter(list, filterAge44)

// запись лямбды в методе:
    var filter = filter(list) { it.age == 43 }
    filter = filter(filter) { it.firstName.startsWith("A") }
    filter = filter(filter) { it.country == "Russia" }

    filter.forEach { println(it) }

}

fun filter(list: List<Person>, isSuitable: (Person) -> Boolean): List<Person> {
    val filterList = mutableListOf<Person>()
    for (person in list) {
        if (isSuitable(person)) {
            filterList.add(person)
        }
    }
    return filterList
}


//fun filter(list: List<Person>, condition: Condition): List<Person> { // единственный метод, работающий через анонимный класс; остальные методы теперь не нужны
//    val filterList = mutableListOf<Person>()
//    for (person in list) {
//        if (condition.isSuitable(person)) {
//            filterList.add(person)
//        }
//    }
//    return filterList
//}

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
