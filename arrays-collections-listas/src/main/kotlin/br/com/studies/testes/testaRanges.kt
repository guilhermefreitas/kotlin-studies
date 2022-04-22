package br.com.studies.testes

fun testeRange() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        println("$s")
    }

    val numerosPares = 0..100 step 2
    for (n in numerosPares) {
        print("$n ")
    }
    println()

    val numerosParesDescendo = 100 downTo 0 step 2
    for (n in numerosParesDescendo) {
        print("$n ")
    }

    println()

    val intervalo = 1500.0..5000.0
    val salario = 4000.0

    if (salario in intervalo) {
        println("Salário está no intervalo")
    } else {
        println("Salário não está no intervalo")
    }


    val alfabeto = 'a'..'z'
    val letra = 'd'
    println(letra in alfabeto)
}

