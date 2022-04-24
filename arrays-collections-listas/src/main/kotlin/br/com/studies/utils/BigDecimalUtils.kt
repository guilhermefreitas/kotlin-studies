package br.com.studies.utils

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria(): BigDecimal {
    //return this.reduce(BigDecimal::add)
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}