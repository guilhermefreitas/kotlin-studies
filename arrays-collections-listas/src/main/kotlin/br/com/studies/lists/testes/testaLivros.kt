package br.com.studies.lists.testes

import br.com.studies.lists.model.Livro
import br.com.studies.lists.util.imprimeComMarcadores

fun testeLivros() {

    val livros: MutableList<Livro> = listaLivros


    println("Lista de livros: $livros")

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = livros.sorted()

    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoTitulo = livros.sortedBy { it.titulo }
    ordenadoTitulo.imprimeComMarcadores()


    livros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()

    livros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }.forEach(::println)

    println("\n")

    livros.groupBy { it.editora ?: "Editora Desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}

