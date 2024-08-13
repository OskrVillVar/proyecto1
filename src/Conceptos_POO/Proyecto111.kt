package Conceptos_POO

class alumno {
    var nombre: String = ""
    var nota: Int = 0

    fun v(){
        print("Ingrese el nombre del estudiante: ")
        nombre = readln()
        print("Ingrese la nota del estudiante: ")
        nota = readln().toInt()
    }
    fun j(){
        println("Nombre: $nombre y tiene una nota de $nota.")
    }
    fun ch(){
        if(nota>=4)
            println("regular.")
        else
            println("no regular.")
    }
}
fun main(){
    val est1 = alumno()
    est1.v()
    est1.j()
    est1.ch()
    println("=================================================")
    val est2 = alumno()
    est2.v()
    est2.j()
    est2.ch()
}