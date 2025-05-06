package org.example
import kotlin.math.sqrt

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

    println("\nCalculo de las raíces:")
    calcularRaices(a.toDouble(), b.toDouble(), c.toDouble())
}

fun calcularFuncion(a: Int, b: Int, c: Int, x: Int): Int {
    return a * x * x + b * x + c
}

fun calcularRaices(a: Double, b: Double, c: Double) {
    val discriminante = b * b - 4 * a * c
    println("Discriminante (D) = %.2f".format(discriminante))

    when {
        discriminante > 0 -> {
            val x1 = (-b + sqrt(discriminante)) / (2 * a)
            val x2 = (-b - sqrt(discriminante)) / (2 * a)
            println("Dos raíces reales diferentes:")
            println("x₁ = %.2f".format(x1))
            println("x₂ = %.2f".format(x2))
        }
        discriminante == 0.0 -> {
            val x = -b / (2 * a)
            println("Una raíz real doble:")
            println("x = %.2f".format(x))
        }
        else -> {
            println("No tiene raíces reales.")
        }
    }
}