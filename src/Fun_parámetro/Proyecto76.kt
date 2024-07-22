package Fun_parámetro

fun mostrarPerimetro(lado: Int) {
    val perimetro = lado * 4
    println("El perímetro es $perimetro")
}
fun mostrarSuperficie(lado: Int) {
    val superficie = lado * lado
    println("La superficie es $superficie")
}
fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado de un cuadrado: ")
    val la = readln().toInt()
    print("Quiere calcular el perimetro o la superficie?: ")
    val respuesta = readln()
    when (respuesta){
        "perimetro" -> mostrarPerimetro(la)
        "superficie" -> mostrarSuperficie(la)
    } }