package br.com.restkotlinapi.domain

class SimpleMath {

    fun sum(numberOne: Double, numberTwo: Double) = numberOne + numberTwo
    fun subtraction(numberOne: Double, numberTwo: Double) = numberOne - numberTwo
    fun plus(numberOne: Double, numberTwo: Double) = numberOne * numberTwo
    fun divide(numberOne: Double, numberTwo: Double) = numberOne / numberTwo
    fun median(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo) / 2
    fun squareRoot(number: Double) = Math.sqrt(number)
}