import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "modelo.Gerente",
        cpf = "123.456.789-00",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "modelo.Diretor",
        cpf = "123.456.789-00",
        salario = 1000.0,
        senha = 1000,
        plr = 1000.0
    )

    val cliente = Cliente(
        nome = "modelo.Cliente",
        cpf = "123.456.789-00",
        senha = 1000
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 1000)
    sistema.entra(cliente, 1000)

}
