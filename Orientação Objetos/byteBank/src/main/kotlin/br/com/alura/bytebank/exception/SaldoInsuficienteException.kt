package br.com.alura.bytebank.br.com.alura.bytebank.exception

class SaldoInsuficienteException(
    message : String = "O Saldo é insuficiente"
) : Exception(message) {
}