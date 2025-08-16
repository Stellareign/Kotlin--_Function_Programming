package org.example.lessons.`5_2`.profile

class ConditionGenderFemale : Condition {
    override fun isSuitable(person: Person): Boolean {
        return person.gender == Gender.FEMALE
    }
}