package funciones_retorno

fun RetornarValor(v1: Int, v2: Int): Int {
    if (v1 > v2)
        return v1
    else
        return v2
}
fun Main(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    println("El mayor entre $valor1 y $valor2 es ${RetornarValor(valor1, valor2)}")
}