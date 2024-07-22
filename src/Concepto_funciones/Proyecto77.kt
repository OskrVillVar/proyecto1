package Concepto_funciones

fun Claves(cl1: String, cl2: String) {
    if (cl1 == cl2) {
        println("Las claves ingresadas son iguales.")
    } else {
        println("Error: Las claves ingresadas son distintas.")
    }
}

fun main(parametro: Array<String>) {
    print("Ingrese la primera clave: ")
    val cl1 = readln()
    print("Ingrese la segunda clave: ")
    val cl2 = readln()

    Claves(cl1, cl2)
}