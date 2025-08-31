package org.example.lessons.`5_2`.profile

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Person(
    @SerialName("id") val id: Int,
    @SerialName("first_name") val firstName: String,
    @SerialName("last_name") val lastName: String,
    @SerialName("gender") val gender: Gender,
    @SerialName("age") val age: Int,
    @SerialName("email") val email: String,
    @SerialName("address") val address: String,
    @SerialName("city") val city: String,
    @SerialName("country") val country: String
) {
}