package br.com.collections.tests


fun testaSet() {
    val cursaramAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    val cursaramKotlin = mutableSetOf("Alex", "Fran", "Maria")
    val cursaramIOS = listOf("Alex", "Gui", "Maria")

    val assistiramAmbos = cursaramAndroid + cursaramIOS + cursaramKotlin

    println(assistiramAmbos)
}
