package funciones_retorno

      fun promedio(v1: Int, v2: Int, v3: Int): Int {
      val promedio = (v1+v2+v3)/3
            return promedio
      }
fun main(){
      print("Ingrese el primer valor: ")
      val valor1 = readln().toInt()
      print("Ingrese el segundo valor: ")
      val valor2 = readln().toInt()
      print("Ingrese el tercer valor: ")
      val valor3 = readln().toInt()
      println("El promedio de los números escritos es: ${promedio(valor1, valor2, valor3)}")

}