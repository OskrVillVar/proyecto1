package Estructura_repetitiva_when

fun main (){
    print("Ingrese la primer nota: ")
    val nota1 = readln().toInt()
    print("Ingrese el valor de la segunda nota: ")
    val nota2 = readln().toInt()
    print("Ingrese el valor de la tercera nota: ")
    val nota3 = readln().toInt()
    val promedio = (nota1+nota2+nota3)/3
    when{
        promedio > 7 -> print("Promocionado")
        promedio < 4 -> print("Regular")
        else -> print ("Libre")
    }
}