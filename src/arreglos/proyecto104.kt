package arreglos

fun main() {
    val arr1 = IntArray(4)
    val arr2 = IntArray(4)
    val sum = IntArray(4)

    println("Ingrese los elementos del primer arreglo:")
    for (i in 0..3) {
        print("Elemento $i: ")
        arr1[i] = readLine()?.toInt() ?: 0
    }

    println("Ingrese los elementos del segundo arreglo:")
    for (i in 0..3) {
        print("Elemento $i: ")
        arr2[i] = readLine()?.toInt() ?: 0
    }

    for (i in 0..3) {
        sum[i] = arr1[i] + arr2[i]
    }

    println("El arreglo resultante de la suma es:")
    for (i in 0..3) {
        println("Elemento $i: ${sum[i]}")
    }
}