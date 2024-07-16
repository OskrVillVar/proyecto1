package Estructura_repetitiva_when

fun main (){
 //Problema propuesto 1
    /*
    print("Ingrese el número: ")
    val n = readln().toInt()
    when{
        n > 0 -> print("El número es positivo")
        n < 0 -> print("El número es negativo")
        else -> print("El número es nulo")
    }
    */
    //Problema propuesto 2
    /*
    var m = 0
    for (v in 1..5){
        print("Ingrese el primer valor: ")
        val n1 = readln().toInt()
        print("Ingrese el segundo valor: ")
        val n2 = readln().toInt()
        print("Ingrese el tercer valor: ")
        val n3 = readln().toInt()
        m += when {
            n1 > n2 && n1 > n3 -> n1
            n2 > n1 && n2 > n3 -> n2
            else -> n3
        }
       println("El valor acumulado de números mayores es de $m")
    }
    */
    //Problema propuesto 3
    /*
    var equ = 0
    var iso = 0
    var esc = 0
    print("Con cuántos triángulos va a trabajar?: ")
    val tri = readln().toInt()
    for (i in 1..tri) {
       print("Ingrese la medida del primer lado: ")
        val a = readln().toInt()
        print("Ingrese la medida del segundo lado: ")
        val b = readln().toInt()
        print("Ingrese la medida del tercer lado: ")
        val c = readln().toInt()

        when {
            a == b && b == c -> {
                println("El triángulo es Equilátero")
                equ++
            }
            a == b || b == c || a == c -> {
                println("El triángulo es Isósceles")
                iso++
            }
            else -> {
                println("El triángulo es Escaleno")
                esc++
            }
        }

    }

    println("Cantidad de triángulos equiláteros: $equ")
    println("Cantidad de triángulos isósceles: $iso")
    println("Cantidad de triángulos escalenos: $esc")
     */
}