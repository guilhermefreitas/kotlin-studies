package br.com.collections.tests


 fun testeCopia() {
    val bancoNomes = BancoDeNomes()
    val nomesSalvos: Collection<String> = bancoNomes.nomes
    bancoNomes.salva("João")


    println(bancoNomes.nomes)
    println(nomesSalvos)
}

class BancoDeNomes() {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testeCollections() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome alex? ${nomes.contains("Alex")}")
    println("Tamanho da lista: ${nomes.size}")
}