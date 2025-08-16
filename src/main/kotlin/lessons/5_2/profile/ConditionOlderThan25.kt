package org.example.lessons.`5_2`.profile

class ConditionOlderThan25 : Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.age > 25
    }

}