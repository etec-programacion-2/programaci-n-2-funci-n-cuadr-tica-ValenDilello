
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

    println("\nTabla de valores:")
    println("x\tf(x)")
     for (x in -5..5) {
        val fx = calcularFuncion(a, b, c, x)
        println("$x\t$fx")
    }
}

fun calcularFuncion(a: Int, b: Int, c: Int, x: Int): Int {
    return a * x * x + b * x + c
}