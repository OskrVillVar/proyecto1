package Funciones_con_argumentos_nombrados

fun Tabla(valor: Int, termino: Int = 10) {
    for (v in 1..termino) {
        println("$valor x $v = ${valor * v}")
    }
}

fun main() {
   Tabla(valor = 7)
    Tabla(valor = 8, termino = 15)
    Tabla(valor = 9, termino = 12)
}