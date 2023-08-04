package br.com.restkotlinapi.domain

import br.com.restkotlinapi.dto.v1.PersonDto
import jakarta.persistence.*

@Entity
@Table(name = "person")
data class Person (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @Column(name = "first_name", nullable = false, length = 80)
    var firstName: String = "",

    @Column(name = "last_name", nullable = false, length = 80)
    var lastName: String = "",

    @Column(nullable = false, length = 100)
    var address: String = "",

    @Column( nullable = false, length = 20)
    var gender: String = ""

)


fun PersonDto.toEntity() = Person(
    id = this.id,
    firstName = this.firstName,
    lastName = this.lastName,
    address = this.address,
    gender = this.gender
)