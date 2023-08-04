package br.com.restkotlinapi.service

import br.com.restkotlinapi.domain.toEntity
import br.com.restkotlinapi.dto.v1.PersonDto
import br.com.restkotlinapi.dto.v1.toDtoV1
import br.com.restkotlinapi.exception.ResourceNotFoundException
import br.com.restkotlinapi.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class PersonService {

    @Autowired
    private lateinit var personRepository: PersonRepository

    private val logger = Logger.getLogger(this::class.java.name)

    fun findAll(): List<PersonDto> {
        logger.info("Finding all people person.")
        return personRepository.findAll().map { it.toDtoV1() }.toList()
    }

    fun findById(id: Long): PersonDto {
        logger.info("Finding one person.")
        return personRepository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }
            .toDtoV1()
    }

    fun createPerson(person: PersonDto) = personRepository.save(person.toEntity()).toDtoV1()

    fun update(person: PersonDto): PersonDto {

        logger.info("Update one person. $person")

        val entity = personRepository.findById(person.id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        person.gender = person.gender

        return personRepository.save(entity).toDtoV1()
    }

    fun delete(id: Long) {
        val entity = personRepository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }

        personRepository.delete(entity)
    }
}