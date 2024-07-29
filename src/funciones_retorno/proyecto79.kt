package funciones_retorno

fun RetornarSuperficie(ladop: Int): Int {
    val sup = ladop * ladop
    return sup
}
fun main (){
    print("Ingrese el valor del lado del cuadrado: ")
    val lado = readln().toInt()
    val superficie = RetornarSuperficie(lado)
    println("El valor de la superficie del cuadrado es: $superficie")

}