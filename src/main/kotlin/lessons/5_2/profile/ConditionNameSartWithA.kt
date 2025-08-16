package org.example.lessons.`5_2`.profile

class ConditionNameSartWithA : Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.firstName.startsWith("A")
    }

}