package arreglos

fun main(){
    val vals: IntArray
    vals = IntArray(8)
    for(i in 0..7){
        print("Ingrese un valor entero: ")
        vals[i] = readln().toInt()
    }
    var suma = 0
    for(i in 0..7){
        suma += vals[i]
    }
    var acum36 = 0
    var acum50 = 0
    for(i in 0..7){
        if(vals[i] > 36){
            acum36++
        }
        if(vals[i] > 50){
            acum50++
        }
    }
    println("El valor acumulado de los valores es: $suma")
    println("Hay $acum36 valores enteros mayores a 36.")
    println("Hay $acum50 valores enteros mayores a 50.")
}