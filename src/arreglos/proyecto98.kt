package arreglos

fun main(){
    val sueldos: IntArray
    sueldos = IntArray(5)
    for(i in 0..4){
        print("Ingrese el sueldo")
        sueldos[i] = readln().toInt()
    }
    for(i in 0..4){
        println(sueldos[i])
    }
}