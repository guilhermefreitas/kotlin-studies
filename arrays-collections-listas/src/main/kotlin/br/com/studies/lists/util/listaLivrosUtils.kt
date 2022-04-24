package br.com.studies.lists.util

import br.com.studies.lists.model.Livro

fun List<Livro?>.imprimeComMarcadores() {
    val livrosFormatados = this.filterNotNull()
        .joinToString(separator = "\n") { livro ->
            " - ${livro.titulo} de ${livro.autor} da editora ${livro.editora}"
        }
    println(" ##### Lista de Livros ##### \n $livrosFormatados")
}
