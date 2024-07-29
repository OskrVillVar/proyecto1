package funciones_retorno
fun perimetro( la: Int): Int{
    val perimetro = la+la+la+la
    return perimetro
}
fun main(){
    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readln().toInt()
    println("El perímetro del cuadrado es: ${perimetro(lado)}")
}
