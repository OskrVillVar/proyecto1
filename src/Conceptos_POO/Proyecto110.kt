package Conceptos_POO

class triangulo {
    var lado1: Int = 0
    var lado2: Int = 0
    var lado3: Int = 0
    fun inicializar() {
        print("Ingrese lado1: ")
        lado1 = readln().toInt()
        print("Ingrese lado2: ")
        lado2 = readln().toInt()
        print("Ingrese lado3: ")
        lado3 = readln().toInt()
    }

    fun ladomayor() {
        print("Lado mayor: ")
        when {
            lado1 > lado2 && lado1 > lado3 -> println("lado1")
            lado2 > lado1 && lado2 > lado3 -> println("lado2")
            else -> println("lado3")
        }
    }
    fun esequilatero(){
        if(lado1 == lado2 && lado1 == lado3)
            println("Es un triangulo equilatero")
        else
            println("No es un triangulo equilatero")

    }
}