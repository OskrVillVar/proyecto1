package Funciones_con_unica_expresion

fun retornarPerimetro(lado: Int) =  lado * lado * lado * lado

fun main() {
    print("Ingrese el valor del lado del cuadrado: ")
    val la = readln().toInt()
    println("El perímetro del cuadrado con lado 5 es ${retornarPerimetro(la)}")
}