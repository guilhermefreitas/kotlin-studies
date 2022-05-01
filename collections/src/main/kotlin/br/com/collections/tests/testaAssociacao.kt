package br.com.collections.tests

fun testeAssociacoes() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 50.0)
    )

    println(pedidos)

    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)

    println()

    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor >= 50 }
    println(pedidosFreteGratis)

    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50 }
    println(mapa)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido -> pedido.valor > 50 }
    println(pedidosFreteGratisAgrupados)
}

data class Pedido(val numero: Int, val valor: Double)