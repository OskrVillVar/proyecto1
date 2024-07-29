package funciones_retorno

fun superficiecua(la1: Int, la2: Int): Int {
    val superficie = la1 * la2
    return superficie
}

fun main() {
    println("Ingrese la cantidad del largo del primer rectangulo: ")
    val lado1 = readln().toInt()
    println("Ingrese la cantidad del ancho del primer rectangulo: ")
    val lado2 = readln().toInt()
    println("La superficie del rectangulo es: ${superficiecua(lado1, lado2)}")
    println("Ingrese la cantidad del largo del segundo rectangulo: ")
    val lado3 = readln().toInt()
    println("Ingrese la cantidad del ancho del segundo rectangulo: ")
    val lado4 = readln().toInt()
    println("La superficie del rectangulo es: ${superficiecua(lado3, lado4)}")
    when {
        superficiecua(lado1, lado2) > superficiecua(
            lado3,
            lado4
        ) -> println("El rectangulo con superficie mayor es ${superficiecua(lado1, lado2)}")

        superficiecua(lado1, lado2) < superficiecua(
            lado3,
            lado4
        ) -> println("El rectangulo con superficie mayor es ${superficiecua(lado3, lado4)}")

        else -> println("Los rectangulos tienen superficie igual")
    }
}