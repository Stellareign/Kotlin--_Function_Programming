package org.example.lessons.`5_2`.profile

class ConditionRussian : Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.country == "Russia"
    }
}