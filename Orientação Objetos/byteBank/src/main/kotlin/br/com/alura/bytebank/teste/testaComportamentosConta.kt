import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val alex = Cliente(nome = "alex seu ze ruela", cpf = "123.456.789-10", senha = 1)
    val contaAlex = ContaCorrente(alex, 2)
    //contaAlex.titular = "alex seu ze ruela"
    println(contaAlex.titular)

    println(contaAlex.saldo)
    contaAlex.depositar(100.0)
    println(contaAlex.saldo)

    val fran = Cliente(nome = "fran", cpf = "123.456.789-10", senha = 1)
    val contaFran = ContaPoupanca(fran, 2)
    //contaFran.titular = "fran"
    println(contaFran.titular)

    println(contaFran.saldo)
    println(contaAlex.saldo)

    println("fazendo transferencia de ${contaAlex.titular} para ${contaFran.titular}")
    contaAlex.transfere(50.0, contaFran, 1)

    println(contaFran.saldo)
    println(contaAlex.saldo)

    println("---------")
    println(contaAlex.numero)
    println(contaFran.numero)
}