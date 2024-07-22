package Concepto_funciones

fun lista(v1: Int, v2: Int, v3: Int) {
    var menor: Int
    var medio: Int
    var mayor: Int

    if (v1 <= v2 && v1 <= v3) {
        menor = v1
        if (v2 <= v3) {
            medio = v2
            mayor = v3
        } else {
            medio = v3
            mayor = v2
        }
    } else if (v2 <= v1 && v2 <= v3) {
        menor = v2
        if (v1 <= v3) {
            medio = v1
            mayor = v3
        } else {
            medio = v3
            mayor = v1
        }
    } else {
        menor = v3
        if (v1 <= v2) {
            medio = v1
            mayor = v2
        } else {
            medio = v2
            mayor = v1
        }
    }

    print("Ingrese el primer valor: ")
    println("Lista de números ordenados de mayor a menor: $menor, $medio, $mayor")
}

fun main() {
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val valor3 = readln().toInt()

    lista(valor1, valor2, valor3)
}