package colaboracion_de_clases

class Socio(val nombre: String, val antiguedad: Int)


class Club(val socio1: Socio, private val socio2: Socio, private val socio3: Socio) {

    fun mayorAntiguedad() {
        val socios = listOf(socio1, socio2, socio3)
        val mayorAntiguedad = socios.maxByOrNull { it.antiguedad }

        if (mayorAntiguedad != null) {
            println("El socio con mayor antigüedad es ${mayorAntiguedad.nombre} con ${mayorAntiguedad.antiguedad} años.")
        } else {
            println("No hay socios en el club.")
        }
    }
}
fun main() {
    val socio1 = Socio("Juan", 5)
    val socio2 = Socio("Ana", 8)
    val socio3 = Socio("Pedro", 3)

    val club = Club(socio1, socio2, socio3)
    club.mayorAntiguedad()
}