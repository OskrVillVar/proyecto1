package funciones_tipo_arreglo
val arre = IntArray(5)
fun cargar(arreglo: IntArray) {
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}
    fun imprimir(arreglo: IntArray) {
        for (elemento in arreglo){
            println(elemento)

    }
}

    fun main(parametro: Array<String>) {
        val arre = IntArray(5)
        cargar(arre)
        imprimir(arre)
        fun cargar(arreglo: IntArray) {
        }
    }

