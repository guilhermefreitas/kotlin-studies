package br.com.restkotlinapi.controller

import br.com.restkotlinapi.domain.SimpleMath
import br.com.restkotlinapi.exception.ResourceNotFoundException
import br.com.restkotlinapi.utils.convertToDouble
import br.com.restkotlinapi.utils.notIsNumeric
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculator")
class MathController {

    private val simpleMath = SimpleMath()


    @RequestMapping(value = ["sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?,
    ): Double {
        if (notIsNumeric(numberOne) || notIsNumeric(numberTwo))
            throw ResourceNotFoundException("Please set a numeric value")
        return simpleMath.sum(convertToDouble(numberOne), convertToDouble(numberTwo))

    }

    @RequestMapping(value = ["subtract/{numberOne}/{numberTwo}"])
    fun subtraction(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?,
    ): Double {
        if (notIsNumeric(numberOne) || notIsNumeric(numberTwo))
            throw ResourceNotFoundException("Please set a numeric value")
        return simpleMath.subtraction(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["plus/{numberOne}/{numberTwo}"])
    fun plus(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?,
    ): Double {
        if (notIsNumeric(numberOne) || notIsNumeric(numberTwo))
            throw ResourceNotFoundException("Please set a numeric value")
        return simpleMath.plus(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["divide/{numberOne}/{numberTwo}"])
    fun divide(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?,
    ): Double {
        if (notIsNumeric(numberOne) || notIsNumeric(numberTwo))
            throw ResourceNotFoundException("Please set a numeric value")
        return simpleMath.divide(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["median/{numberOne}/{numberTwo}"])
    fun median(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?,
    ): Double {
        if (notIsNumeric(numberOne) || notIsNumeric(numberTwo))
            throw ResourceNotFoundException("Please set a numeric value")
        return simpleMath.median(convertToDouble(numberOne), convertToDouble(numberTwo))
    }

    @RequestMapping(value = ["squareRoot/{number}"])
    fun squareRoot(
        @PathVariable(value = "number") number: String?
    ): Double {
        if (notIsNumeric(number))
            throw ResourceNotFoundException("Please set a numeric value")
        return simpleMath.squareRoot(convertToDouble(number))
    }

}