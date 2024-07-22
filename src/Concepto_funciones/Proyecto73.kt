package Concepto_funciones

fun menor(){
    print("Ingrese el primer valor: ")
    val v1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val v2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val v3 = readln().toInt()
    when {
        v1 < v2 && v1 < v3 -> println("El número menor es $v1")
        v2 < v1 && v2 < v3 -> println("El número menor es $v2")
        v3 < v1 && v3 < v2 -> println("El número menor es $v3")
        else -> println("Error: Hay 2 valores iguales")
    }
}
fun main(){
    for (v in 1..2)
        menor()
}