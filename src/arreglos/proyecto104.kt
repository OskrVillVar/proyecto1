package arreglos

import kotlin.random.Random

/*
fun main() {
    val arr1 = IntArray(4)
    val arr2 = IntArray(4)
    val sum = IntArray(4)

    println("Ingrese los elementos del primer arreglo:")
    for (i in 0..3) {
        print("Elemento: ")
        arr1[i] = readln().toInt()
    }

    println("Ingrese los elementos del segundo arreglo:")
    for (i in 0..3) {
        print("Elemento: ")
        arr2[i] = readln().toInt()
    }

    for (i in 0..3) {
        sum[i] = arr1[i] + arr2[i]
    }

    println("El arreglo resultante de la suma es:")
    for (i in 0..3) {
        println("$i: ${sum[i]}")
    }
}
*/
//segunda opcion
fun main(){
    val arreglo1: IntArray
    arreglo1 = IntArray(4)
    var arreglo2: IntArray
    arreglo2 = IntArray(4)
    var arreglosuma: IntArray
    arreglosuma = IntArray(4)

    var verarreglo1 = "Arreglo1: "
    var verarreglo2 = "Arreglo2: "
    var verarreglosuma = "ArregloSumado: "
    for (i in 0..arreglo1.size -1){
        arreglo1[i] = Random.nextInt(0, 10)
        arreglo2[i] = Random.nextInt(0, 10)
        arreglosuma[i] = arreglo1[i] + arreglo2[i]
        verarreglo1 += if(i == arreglo1.lastIndex)
            arreglo1 else arreglo1[i].toString()
        verarreglo2 += if (i == arreglo2.lastIndex)
            arreglo2 else arreglo2[i].toString()

    }
println(verarreglo1)
    println(verarreglo2)
    println(verarreglosuma)
}