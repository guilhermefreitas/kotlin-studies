package br.com.studies.testes

fun testeIdades() {
    //    val idades = IntArray(4)

//    idades[0] = 25
//    idades[1] = 19
//    idades[2] = 33
//    idades[3] = 21

    val idades = intArrayOf(25, 19, 33, 21, 32, 44, 24)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("maior idade é $maiorIdade")

    idades.forEach { idade ->
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("maior idade é $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println("menor idade é $menorIdade")
}