package br.com.studies.lists.testes

import br.com.studies.lists.model.Prateleira
import br.com.studies.lists.util.imprimeComMarcadores

fun testePrateleira() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaLivros)

    val organizarPorAutor = prateleira.organizarPorAutor()

    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizarPorAutor.imprimeComMarcadores()
    organizarPorAnoPublicacao.imprimeComMarcadores()

}