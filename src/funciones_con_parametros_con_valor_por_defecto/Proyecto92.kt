package funciones_con_parametros_con_valor_por_defecto

fun tituloSubrayado(titulo: String, caracter: String = "*") {
    println(titulo)
    for (i in 1..titulo.length)
        print(caracter)
    println()
}
fun main(parametro: Array<String>) {
    tituloSubrayado("Sistema de Administracion")
    tituloSubrayado("Ventas", "-")
}