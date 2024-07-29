package Funciones_con_unica_expresion

fun Caracteres(contar: String) = contar.length

fun main() {
    print("Ingrese el primer nombre: ")
    val nombre1 = readln()
    print("Ingrese el segundo nombre: ")
    val nombre2 = readln()

    val N1 = Caracteres(nombre1)
    val N2 = Caracteres(nombre2)

    println("El primer nombre tiene $N1 caracteres")
    println("El segundo nombre tiene $N2 caracteres")
    when{
        Caracteres(nombre1) > Caracteres(nombre2) -> println("El primer nombre tiene más caracteres")
        Caracteres(nombre1) < Caracteres(nombre2) -> println("El segundo nombre tiene más caracteres")
        else -> println("Ambos nombres poseen los mismos caracteres")
    }
}