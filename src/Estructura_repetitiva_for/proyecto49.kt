package Estructura_repetitiva_for
fun main(){
    var aprobados = 0
    var reprobados = 0
    for (index in 1..10){
        print("Ingrese la nota del estdudiante #$index: ")
        val nota = readln().toDouble()
        if (nota >= 7)
            aprobados++
        else
            reprobados++
    }
    println("Hay $reprobados alumnos reprobados.")
    println("Hay $aprobados alumnos aprobados.")
}
