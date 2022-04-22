fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Saldo zerado")
    } else {
        println("Saldo negativo")
    }

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Saldo zerado")
        else -> println("Saldo negativo")
    }

}