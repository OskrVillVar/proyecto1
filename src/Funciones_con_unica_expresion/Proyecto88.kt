package Funciones_con_unica_expresion

fun promedio(v1: Int, v2: Int, v3: Int) = (v1 + v2 + v3) / 3

fun main() {
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val valor3 = readln().toInt()
    println("El promedio es ${promedio(valor1, valor2, valor3)}")
}