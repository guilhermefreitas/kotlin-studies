package br.com.studies.arrays.testes

import br.com.studies.utils.average
import br.com.studies.utils.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testeArrayObjetos() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "3000.00", "4000.00", "10000")

    println("salarios antes do aumento: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios.map { salario ->
        calcularAumento(salario, aumento)
    }.toTypedArray()

    println("salarios com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.somatoria();
    println("total de salarios sem aumento: ${salarios.somatoria()}")
    println("total de salarios com aumento: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salarios.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("gasto total: $gastoTotal")

    val mediaMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .average()

    println("media dos 3 maiores salarios: $mediaMaioresSalarios")


}

private fun calcularAumento(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal())
        salario + "500".toBigDecimal()
    else
        (salario * aumento).setScale(2, RoundingMode.UP)

private fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    val array = Array<BigDecimal>(values.size) { i ->
        values[i].toBigDecimal()
    }
    return array
}

