package br.com.restkotlinapi.utils

fun notIsNumeric(value: String?) = !isNumeric(value)

fun isNumeric(value: String?): Boolean {
    if (value.isNullOrBlank()) return false

    val number = value.replace(",".toRegex(), ".")
    return number.matches("""[-+]?[0-9]*\.?[0-9]""".toRegex())
}

fun convertToDouble(value: String?): Double {
    if (value.isNullOrBlank()) return 0.0

    val number = value.replace(",".toRegex(), ".")
    return if (isNumeric(value)) number.toDouble() else 0.0
}