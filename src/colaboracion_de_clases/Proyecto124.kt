package colaboracion_de_clases

class ola {
    private var valores: IntArray = IntArray(5)

    init {
        vals()
    }

    private fun vals() {
        for (i in valores.indices) {
            valores[i] = (Math.random() * 11).toInt()
        }
    }

    fun mo() {
        print("Valores del arreglo: ")
        for (i in valores.indices) {
            print(valores[i])
            if (i < valores.size - 1) {
            }
        }
        println()

    }

        fun mayor() {
            val mayo = valores.maxOrNull()
            println("El mayor valor del arreglo es: $mayo")
        }

        fun menor() {
            val meno = valores.minOrNull()
            println("El menor valor del arreglo es: $meno")
        }
    }

    fun main() {
        val arreglo = ola()
        arreglo.mo()
        arreglo.mayor()
        arreglo.menor()
    }
