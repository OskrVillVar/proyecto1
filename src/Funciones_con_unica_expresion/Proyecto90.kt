package Funciones_con_unica_expresion

fun Superficie(lado1: Int, lado2: Int) = lado1 * lado2

fun main() {
    print("Ingrese el largo del primer rectangulo: ")
    val largo1 = readln().toInt()
    print("Ingrese el ancho del segundo rectangulo: ")
    val ancho1 = readln().toInt()
    println("La superficie del primer rectangulo: ${Superficie(largo1, ancho1)}")
    print("Ingrese el largo del segundo rectangulo: ")
    val largo2 = readln().toInt()
    print("Ingrese el ancho del segundo rectangulo: ")
    val ancho2 = readln().toInt()
    println("La superficie del primer rectangulo: ${Superficie(largo2, ancho2)}")
    when{
        Superficie(largo1, ancho1) > Superficie(largo2, ancho2) -> print("El rectangulo con mayor superficie es ${Superficie(largo1, ancho1)}")
        Superficie(largo1, ancho1) < Superficie(largo2, ancho2) -> print("El rectangulo con mayor superficie es ${Superficie(largo2, ancho2)}")
        else -> print("Los rectangulos tienen la misma superficie")
    }
}