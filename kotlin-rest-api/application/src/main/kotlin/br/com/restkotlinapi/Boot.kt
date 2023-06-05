package br.com.restkotlinapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestKotlinApiApplication

fun main(args: Array<String>) {
	runApplication<RestKotlinApiApplication>(*args)
}
