package poo_llamada_metodos

class Hijos {
    var edades = IntArray(5)

    fun v() {
        for (i in 0.. edades.size) {
            print("Ingrese la edad de la persona: ")
            edades[i] = readln().toInt()
        }
        edadmayor()
        promedad()
    }

    fun edadmayor() {
        val mayor = edades.max()
        println("La mayor edad es: $mayor")
    }

    fun promedad() {
        val promedio = edades.average()
        println("El promedio de edades es: $promedio")
    }
}

fun main() {
    val hijos = Hijos()
    hijos.v()
}