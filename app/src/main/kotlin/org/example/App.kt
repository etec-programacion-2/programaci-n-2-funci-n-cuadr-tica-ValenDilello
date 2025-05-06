
package org.example

fun main() {
    val a = 5
    val b = 3
    val c = 8

    if (a == 0) {
        println("a no puede ser 0")
        return
    }

    val mostrarFuncion = buildString {
        append("${a}x²")
        append(if (b >= 0) " + ${b}x" else " - ${-b}x")
        append(if (c >= 0) " + $c" else " - ${-c}")
    }

    println("La función es: f(x) = $mostrarFuncion")
}
