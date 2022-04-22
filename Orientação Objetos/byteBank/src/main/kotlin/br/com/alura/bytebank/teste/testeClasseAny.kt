package br.com.alura.bytebank.br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco


 fun testeClasseAny() {
    val endereco = Endereco(
        logradouro = "Rua dos pinheiros",
        cidade = "São Paulo",
        cep = "12345-678"
    )

    val enderecoNovo = Endereco(
        logradouro = "Rua dos bobos",
        cidade = "Rio de Janeiro",
        cep = "12345-678"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())
}

