package Estructura_repetitiva_when

fun main (){
    print("Ingrese la coordenada x del punto: ")
    val x = readln().toInt()
    print("Ingrese la coordenada y del punto: ")
    val y = readln().toInt()
    when{
        x > 0 && y > 0 -> println("Primer cuadrante.")
        x < 0 && y > 0 -> println("Segundo cuadrante.")
        x < 0 && y < 0 -> println("Tercer cuadrante.")
        x > 0 && y < 0 -> println("Cuarto cuadrante.")
        else -> print("El punto se encuentra en un eje.")

    }
}