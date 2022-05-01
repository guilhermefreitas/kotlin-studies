package br.com.collections.tests


fun testeMap() {

    val pedidos = mutableMapOf<Int, Double>(
        1 to 240.0,
        2 to 203.0,
        3 to 650.0,
        4 to 150.0,
        5 to 200.0,
        6 to 310.0,
    )
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $pedido")
    }

    for (p in pedidos) {
        println("Pedido: ${p.key} - Valor: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 50.0)
    println(pedidos)

    pedidos[1] = 10.0

    println(pedidos)

    pedidos.putIfAbsent(6, 60.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 70.0)
    println(pedidos)

    //val valorPedido = pedidos.getValue(0)
    //println(valorPedido)

    println(pedidos.getOrElse(0) {
        2.0
    })

    println(pedidos.getOrDefault(0, -1.0))

    pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50
    }.let { it ->
        println(it)
    }

    println(pedidos + mapOf(7 to 90.0, 8 to 80.0))

    println(pedidos - 6)
    pedidos.putAll(mapOf(1 to 90.0, 2 to 80.0))
    println(pedidos)
}
