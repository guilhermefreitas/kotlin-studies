package br.com.alura.bytebank.br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco


fun testeExceptions() {

    val entrada: String = "1,9"
    try {
        val valor: Double = entrada.toDouble();
        println("valor recebido $valor")
    } catch (e: NumberFormatException) {
        println("Problema na conversão de String para Double")
    }

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão de String para Double2")
        null
    }

    println(valorRecebido)




    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()
            endereco as Endereco
        }
    } catch (e: ClassCastException) {
        println(" Erro de conversao. ClassCastException")
    }

}