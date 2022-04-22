package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registrar(funcionario: Funcionario) {
        total += funcionario.bonificacao
    }
}