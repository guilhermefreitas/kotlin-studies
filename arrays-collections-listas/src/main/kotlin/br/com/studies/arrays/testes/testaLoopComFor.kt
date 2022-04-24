package br.com.studies.arrays.testes

fun testeForComAtribuicao() {
    val salarios = doubleArrayOf(1400.50, 2000.00, 3000.00, 4000.00, 5000.00)

    val percentualAumento = 1.1

    for (salario in salarios) {
        println("Salário antes do aumento: $salario")
        println("Salário com aumento: ${salario * percentualAumento}")
    }

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * percentualAumento
    }

    println(salarios.contentToString())

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * percentualAumento
    }

    println(salarios.contentToString())
}