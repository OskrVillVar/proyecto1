package Estructura_repetitiva_for

fun main (){
    var m3 = 0
    var m5 = 0
    var m9 = 0
    for (index in 1..1000){
        if (index % 3 == 0)
            m3++
        if (index % 5 == 0)
            m5++
        if (index % 9 == 0)
            m9++
    }
    println("Cantidad de múltiplos de 3: $m3.")
    println("Cantidad de múltiplos de 5: $m5.")
    println("Cantidad de múltiplos de 9: $m9.")
}