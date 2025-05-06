package org.example
import kotlin.math.sqrt

fun main() {
    val a = 5
    val b = 3
    val c = 8

    // aseguramos que 'a' no sea 0
    if (a == 0) {
        println("El coeficiente 'a' no puede ser 0 en una función cuadrática.")
        return
    }

    // print a la ecuación cuadrática
    val mostrarFuncion = buildString {
        append("${a}x²")
        append(if (b >= 0) " + ${b}x" else " - ${-b}x")
        append(if (c >= 0) " + $c" else " - ${-c}")
    }
    println("Paso 1: ")
    println("La función cuadrática es: f(x) = $mostrarFuncion")

    // mostrar tabla de valores de la función en el rango de -5 a 5
    println("Paso 2: ")
    println("\nTabla de valores de f(x):")
    println(String.format("%5s %10s", "x", "f(x)"))
    for (x in -5..5) {
        val fx = calcularFuncion(a, b, c, x)
        println(String.format("%5d %10d", x, fx))
    }

    // cálculo de las raíces de la ecuación cuadrática
    println("Paso 3: ")
    println("\nCálculo de las raíces:")
    calcularRaices(a.toDouble(), b.toDouble(), c.toDouble())
}

// funcion que calcula los valores de la función cuadrática
fun calcularFuncion(a: Int, b: Int, c: Int, x: Int): Int {
    return a * x * x + b * x + c
}

// función que calcula las raíces de la ecuación cuadrática utilizando el discriminante
fun calcularRaices(a: Double, b: Double, c: Double) {
    val discriminante = b * b - 4 * a * c
    println("Discriminante (D) = %.2f".format(discriminante))

    when {
        // si el discriminante es mayor que 0, hay dos raíces reales diferentes
        discriminante > 0 -> {
            val x1 = (-b + sqrt(discriminante)) / (2 * a)
            val x2 = (-b - sqrt(discriminante)) / (2 * a)
            println("La ecuación tiene dos raíces reales diferentes:")
            println("x₁ = %.2f".format(x1))
            println("x₂ = %.2f".format(x2))
        }
        // si el discriminante es igual a 0, hay una raíz real doble
        discriminante == 0.0 -> {
            val x = -b / (2 * a)
            println("La ecuación tiene una raíz real doble:")
            println("x = %.2f".format(x))
        }
        // si el discriminante es menor que 0, no hay raíces reales
        else -> {
            println("La ecuación no tiene raíces reales.")
        }
    }
}
// coded by: valentino dilello :)