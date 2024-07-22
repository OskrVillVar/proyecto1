package Concepto_funciones
//Problema propuesto 1
fun cuadrado(){
    print ("Ingrese un número: ")
    val n = readln().toInt()
    val cuadrado = n * n
    println("El cuadrado de $n es $cuadrado")
}
fun producto(){
    print("Ingrese el primer valor: ")
    val v1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val v2 = readln().toInt()
    val p1 = v1 * v1
    val p2 = v2 * v2
    print("El producto de $v1 es $p1 y el de $v2 es $p2")
}
fun main() {
    cuadrado()
    producto()
}
