import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {

    val fulano = Analista(
        nome = "modelo.Funcionario",
        cpf = "123.456.789-10",
        salario = 1000.0
    )

    println("nome: ${fulano.nome}")
    println("cpf: ${fulano.cpf}")
    println("salario: ${fulano.salario}")
    println("bonificacao: ${fulano.bonificacao}")


    println(" ")
    val ciclano = Gerente(
        nome = "gerente",
        cpf = "123.456.789-10",
        salario = 10000.0,
        senha = 1
    )

    println("nome: ${ciclano.nome}")
    println("cpf: ${ciclano.cpf}")
    println("salario: ${ciclano.salario}")
    println("bonificacao: ${ciclano.bonificacao}")

    if (ciclano.autentica(1)) {
        println("Autenticado")
    } else {
        println("Não autenticado")
    }
    println(" ")

    val beltrano = Diretor(
        nome = "modelo.Diretor",
        cpf = "123.456.789-10",
        salario = 10000.0,
        senha = 1,
        plr = 1000.0
    )

    println("nome: ${beltrano.nome}")
    println("cpf: ${beltrano.cpf}")
    println("salario: ${beltrano.salario}")
    println("bonificacao: ${beltrano.bonificacao}")

    println(" ")

    println(" ")

    val analista = Analista(
        nome = "modelo.Analista",
        cpf = "123.456.789-10",
        salario = 1500.0
    )

    println("nome: ${analista.nome}")
    println("cpf: ${analista.cpf}")
    println("salario: ${analista.salario}")
    println("bonificacao: ${analista.bonificacao}")

    println(" ")


    val calculadora = CalculadoraBonificacao()
    calculadora.registrar(fulano)
    calculadora.registrar(ciclano)
    calculadora.registrar(beltrano)
    calculadora.registrar(analista)

    println("Total de bonificacoes: ${calculadora.total}")
}