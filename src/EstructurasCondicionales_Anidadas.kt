fun main () {
    /*
    //Problema 1
    print("Ingrese la primer nota:")
    val nota1: Int = readln().toInt()
    print("Ingrese la segunda nota:")
    val nota2: Int = readln().toInt()
    print("Ingrese la tercero nota:")
    val nota3: Int = readln().toInt()
    val promedio = (nota1+nota2+nota3)/3

    if (promedio>=7)
        print("Promocionado")
    else
        if (promedio>=4)
            print("Regular")
    else
        print("libre")

     */
    /*
    print("Ingrese la primer nota:")
    val nota1: Int = readln().toInt()
    print("Ingrese la segunda nota:")
    val nota2: Int = readln().toInt()
    print("Ingrese la tercero nota:")
    val nota3: Int = readln().toInt()
    val promedio = (nota1+nota2+nota3)/3
    val estado = if (promedio>=7) "Promocionado"
    else if (promedio >= 4)"Regular" else "Reprobado"
    print ("Estado del alumno $estado")
    */
    /*
    //Problema 2
    print("Ingrese el primer número:")
    val n1: Int = readln().toInt()
    print("Ingrese el segundo número:")
    val n2: Int = readln().toInt()
    print("Ingrese el tercer número:")
    val n3: Int = readln().toInt()
    var mayor: Int
    if (n1 > n2) {
        if (n1 > n3)
           println("El número mayor es $n1")
    } else {
        println("El número mayor es $n3")
    }
    if (n2 > n3) {
        println("El número mayor es $n2")
    } else {
       println("El número mayor es $n3")
    }
    */
    /*
    //Problema 3
    println("Introduce un número entero:")
    val n = readln().toInt()
    if (n>0){
        println("El número es positivo")
    }else if (n<0){
        println("El número es negativo")
    }else{
        println("El número es nulo")
    }
     */
/*
    //problema 4
    println("Ingrese el número para saber cuantas cifras posee:")
    val num = readln().toInt()
    if (num<=9){
        println("El número tiene una cifra")
    }else if (num<=10){
        println("El número tiene dos cifras")
    }else if (num<=999){
        println("El número tiene tres cifras")
    }else{
        println("Error: El número posee más de tres cifras")
    }
*/

    /*
    //Problema 4
    print("Ingrese la cantidad total de preguntas:")
    val preguntas = readln().toInt()
    print("Ingrese el total de respuestas correctas:")
    val rcorrectas = readln().toInt()
    val nota = (rcorrectas.toDouble()/preguntas.toDouble())*100
    val uwu = if (nota>=90){
        "Nivel máximo"
    }else if (nota>=75){
        "Nivel medio"
    }else if (nota>=50){
        "Nivel regular"
    }else{
        "Fuera de nivel"
    }
    println("El postulante se encuentra $uwu")
     */
    //Documento 8
    /*
    //Problema 1
    print("Ingrese el día:")
    val dia = readln().toInt()
    print("Ingrese el mes:")
    val mes = readln().toInt()
    print("Ingrese el año:")
    val year= readln().toInt()
    if (mes == 1 || mes == 2 || mes  == 3){
        println("$dia/$mes/$year pertenece al primer trimestre del año")
    }else{
        println("$dia/$mes/$year no pertenece al primer trimestre del año")
    }
*/
    /*
    //Problema 2
    print("Ingrese el primer valor:")
    val v1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val v2 = readln().toInt()
    print("Ingrese el tercer valor:")
    val v3 = readln().toInt()
    if (v1 == v2 && v1 == v3){
        val cubo = v1*v1*v1
        println("El cubo de los valores iguales es $cubo")
    }else{
        print("No se puede calcular el cubo de los valores ya que no son iguales.")
    }
    */
    /*
    //Problema 3
    print("Ingrese el valor del número:")
    val num1 = readln().toInt()
    print("Ingrese el segundo número:")
    val num2 = readln().toInt()
    print("Ingrese el tercer número:")
    val num3 = readln().toInt()
    if (num1<10 && num2 < 10 && num3 < 10){
        println("Todos los números son menores a diez")
    }else{
        println("Hay un número mayor a diez")
    }
    */
    //Problema 4
    /*
    print("Ingrese coordenada x:")
    val x = readln().toInt()
    print("Ingrese coordenada y:")
    val y = readln().toInt()
    if (x > 0 && y > 0)
        print("Se encuentra en el primer cuadrante")
    else
        if (x < 0 && y > 0)
            print("Se encuentra en el segundo cuadrante")
        else
            if (x < 0 && y < 0)
                print("Se encuentra en el tercer cuadrante")
            else
                if (x > 0 && y < 0)
                    print("Se encuentra en el cuarto cuadrante")
                else
                    print("Esta en un eje")
    */
    //Problema 5
    /* print("Ingrese el  primer valor:")
     val valor1 = readln().toInt()
     print("Ingrese el segundo valor:")
     val valor2 = readln().toInt()
     print("Ingrese el tercer valor:")
     val valor3 = readln().toInt()
     val menor = if (valor1 < valor2 && valor1 < valor3)
     valor1 else if (valor2 < valor3) valor2 else valor3
     val mayor = if (valor1 > valor2 && valor1 > valor3)
     valor1 else if (valor2 > valor3) valor2 else valor3
     print("El valor mayor de la lista es $mayor y el menor $menor")
     */
}