package Constructores

class v constructor(val x: Int, val y: Int) {

    fun cuadrante(): String {
        return when {
            x > 0 && y > 0 -> "1er Cuadrante"
            x < 0 && y > 0 -> "2do Cuadrante"
            x < 0 && y < 0 -> "3er Cuadrante"
            x > 0 && y < 0 -> "4to Cuadrante"
            x == 0 && y == 0 -> "El punto está en el origen"
            x == 0 -> "El punto está sobre el eje Y"
            y == 0 -> "El punto está sobre el eje X"
            else -> "Coordenadas no válidas"
        }
    }
}

fun main() {
    val punto1 = v(5, -2)
    val punto2 = v(-8, 1)
    val punto3 = v(0, 3)
    val punto4 = v(6, 9)
    val punto5 = v(-4, -7)
    println("Punto 1: ${punto1.cuadrante()}")
    println("Punto 2: ${punto2.cuadrante()}")
    println("Punto 3: ${punto3.cuadrante()}")
    println("Punto 4: ${punto4.cuadrante()}")
    println("Punto 5: ${punto5.cuadrante()}")
}