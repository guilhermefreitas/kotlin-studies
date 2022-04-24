package br.com.studies.arrays.testes

fun testeFuncoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val mediaIdades = idades.average()
    println("Média de idades: $mediaIdades")

    val todosMaioresIdade = idades.all { it >= 18 }
    println("Todos maiores de idade: $todosMaioresIdade")

    val existeMaiorIdade = idades.any() { it >= 18 }
    println("Existe alguma idade maior que 18?  $existeMaiorIdade")

    val maioresDezoito = idades.filter { it >= 18 }
    println("Maiores dezoito: $maioresDezoito")

    val igualDezoito = idades.find { it == 18 }
    println("Igual dezoito: $igualDezoito")
}