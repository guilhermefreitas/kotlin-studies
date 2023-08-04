package br.com.restkotlinapi.dto.v1

import br.com.restkotlinapi.domain.Person

data class PersonDto(
    var id: Long = 0,
    var firstName: String = "",
    var lastName: String = "",
    var address: String = "",
    var gender: String = ""
)

fun Person.toDtoV1() = PersonDto(
    id = this.id,
    firstName = this.firstName,
    lastName = this.lastName,
    address = this.address,
    gender = this.gender
)

