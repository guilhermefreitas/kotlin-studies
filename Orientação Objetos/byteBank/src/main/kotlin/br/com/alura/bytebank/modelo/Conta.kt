package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.br.com.alura.bytebank.exception.SaldoInsuficienteException


abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var totalContasCriadas = 0
            private set
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha = senha)
    }

    abstract fun sacar(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor)
            throw SaldoInsuficienteException()

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.depositar(valor)
    }

    init {
        totalContasCriadas++
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        if (this.saldo >= valor)
            this.saldo -= valor

    }

}