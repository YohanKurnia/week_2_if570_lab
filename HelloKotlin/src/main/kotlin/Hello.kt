package main.kotlin

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

    // Will assign kotlin.Unit
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK"}."
    println(message)
}