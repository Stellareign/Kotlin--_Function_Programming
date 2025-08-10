package org.example.lessons.`5_2`.profile

import kotlinx.serialization.json.Json
import java.io.File

object ProfileRepository {
    private val personFile = File("persons.json")

    private val _profiles = loadProfiles()
    val profiles: List<Person>
        get() = _profiles.toList()


    private fun loadProfiles(): List<Person> {
        return Json.decodeFromString<List<Person>>(personFile.readText().trim())
    }
}