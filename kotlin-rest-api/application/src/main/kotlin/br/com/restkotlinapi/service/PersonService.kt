package br.com.restkotlinapi.service

import br.com.restkotlinapi.domain.Person
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

    fun findAll(): List<Person> {
        logger.info("Finding all people person.")
        return personRepository.findAll()
    }

    fun findById(id: Long): Person {
        logger.info("Finding one person.")
        return personRepository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }
    }

    fun createPerson(person: Person) = personRepository.save(person)

    fun update(person: Person): Person {

        logger.info("Update one person. $person")

        val entity = personRepository.findById(person.id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }

        entity.firstName = person.firstName
        entity.lastName = person.lastName
        entity.address = person.address
        person.gender = person.gender

        return personRepository.save(entity)
    }


    fun delete(id: Long) {
        val entity = personRepository.findById(id)
            .orElseThrow { ResourceNotFoundException("No records found for this ID") }

        personRepository.delete(entity)
    }
}