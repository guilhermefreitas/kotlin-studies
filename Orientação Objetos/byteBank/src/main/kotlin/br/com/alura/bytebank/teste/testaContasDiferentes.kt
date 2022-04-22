import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente: Conta = ContaCorrente(
        titular = Cliente(nome = "Titular conta corrente", cpf = "123.456.789-10", senha = 1),
        numero = 1000
    )


    val contaPoupanca: Conta = ContaPoupanca(
        titular = Cliente(nome = "Titular conta poupança", cpf = "123.456.789-10", senha = 1),
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo da conta corrente: ${contaCorrente.saldo}")
    println("Saldo da conta poupanca: ${contaPoupanca.saldo}")


    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo da conta corrente: ${contaCorrente.saldo}")
    println("Saldo da conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1)

    println("Saldo da conta corrente pos transf: ${contaCorrente.saldo}")
    println("Saldo da conta poupanca pos transf: ${contaPoupanca.saldo}")
}
