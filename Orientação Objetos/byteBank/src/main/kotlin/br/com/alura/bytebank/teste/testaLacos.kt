fun testaLacos() {
    for (i in 5 downTo 1) {

        val titular: String = "Joseph $i"
        val numeroConta: Int = 1000 + i;
        val saldo: Double = i + 10.0

        println("titular: $titular")
        println("numero da conta: $numeroConta")
        println("saldo da conta: $saldo")

    }
}

