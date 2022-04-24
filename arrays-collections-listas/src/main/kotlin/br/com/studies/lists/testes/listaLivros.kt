package br.com.studies.lists.testes

import br.com.studies.lists.model.Livro

val listaLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "O Senhor dos Anéis",
        autor = "J. R. R. Tolkien",
        anoPublicacao = 1954
    ),
    Livro(
        titulo = "O Hobbit",
        autor = "J. R. R. Tolkien",
        anoPublicacao = 1937
    ),
    Livro(
        titulo = "O Senhor dos Anéis - A Sociedade do Anel",
        autor = "J. R. R. Tolkien",
        anoPublicacao = 1954
    ),
    Livro(
        titulo = "O Hobbit - A Sociedade do Anel",
        autor = "J. R. R. Tolkien",
        anoPublicacao = 1937,
        editora = "Panini"
    ),
    Livro(
        titulo = "Harry Potter e a Ordem da Fênix",
        autor = "J. K. Rowling",
        anoPublicacao = 1997
    ),
    Livro(
        titulo = "A volta dos que não foram",
        autor = "Dito Popular",
        anoPublicacao = 2004
    )
)