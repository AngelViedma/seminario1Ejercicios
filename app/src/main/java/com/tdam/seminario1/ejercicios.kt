package com.tdam.seminario1

import java.util.Locale
import kotlin.math.max

fun main(){
    val numeros= listOf(1,2,3,4,5)
    println("//////////////////////EJERCICIO 1///////////////////////")
    println(ejercicio1(numeros))
    println("//////////////////////EJERCICIO 2///////////////////////")
    println(ejercicio2(numeros))
    println("//////////////////////EJERCICIO 3///////////////////////")
    println(ejercicio3(5))
    println("//////////////////////EJERCICIO 4///////////////////////")
    println(ejercicio4("olo"))
    println("//////////////////////EJERCICIO 5///////////////////////")
    println(ejercicio5("Holaaaaa",'a'))
    println("//////////////////////EJERCICIO 6///////////////////////")
    ejercicio6("Hola me llamo pepe","23 me llamo")
    println("//////////////////////EJERCICIO 7///////////////////////")
    ejercicio7("hola me llamo angel")
    println("//////////////////////EJERCICIO 8///////////////////////")
    ejercicio8(123)
    println("//////////////////////EJERCICIO 9///////////////////////")
    print("El maximo comun divisor es: ")
    println(ejercicio9(5,10))
    println("//////////////////////EJERCICIO 10///////////////////////")
    print("La sucession de Fibonnaci es: ")
    println(ejercicio10(4))
    println("//////////////////////EJERCICIO 11///////////////////////")
    ejercicio11(6,35)
    println("//////////////////////EJERCICIO 12///////////////////////")
    println(ejercicio12(101))
    println("//////////////////////EJERCICIO 13///////////////////////")
    ejercicio13("a")
    ejercicio13("div.coche#VWPolo")
    ejercicio13("div.oferta")
    println("//////////////////////EJERCICIO 14///////////////////////")
    ejercicio14(6)
    println("//////////////////////EJERCICIO 15///////////////////////")
    val num1= arrayOf(1,2,3,4,5)
    val num2= arrayOf(1,1,2,4,3)
    println(ejercicio15(num1,num2))
    println("//////////////////////EJERCICIO 16///////////////////////")
    println(ejercicio16(numeros))
    println("//////////////////////EJERCICIO 17///////////////////////")
    println(ejercicio17(numeros))
    println("//////////////////////EJERCICIO 18///////////////////////")
    println(ejercicio18(5))
    println("//////////////////////EJERCICIO 19///////////////////////")
    println(ejercicio19("Hola me llamo paco"))
    println("//////////////////////EJERCICIO 20///////////////////////")
    println(ejercicio20(5))
    println("//////////////////////EJERCICIO 21///////////////////////")
    println(ejercicio21("Hola"))
    println("//////////////////////EJERCICIO 22///////////////////////")
    println(ejercicio22(28))
    println("//////////////////////EJERCICIO 23///////////////////////")
    println(ejercicio23(371,3))
    val matriz = arrayOf(
        arrayOf(12,2,3,4),
        arrayOf(1,6,80,8),
        arrayOf(9,10,11,12)
    )
    println("//////////////////////EJERCICIO 24///////////////////////")
    println(ejercicio24(matriz))
    println("//////////////////////EJERCICIO 25///////////////////////")
    println(ejercicio25(matriz))

    val listaStrings = listOf("hola","palabra","palabraMasLarga","xd")

    println("//////////////////////EJERCICIO 26///////////////////////")
    println(ejercicio26(listaStrings))
    println("//////////////////////EJERCICIO 27///////////////////////")
    println(ejercicio27(listaStrings))
    println("//////////////////////EJERCICIO 28///////////////////////")
    println(ejercicio28("Hola1"))
    println("//////////////////////EJERCICIO 29///////////////////////")
    val string1="hola peter"
    val string2="retep hoal"

    println(ejercicio29(string1,string2))
    println("//////////////////////EJERCICIO 30///////////////////////")
    println(ejercicio30(6))
    println("//////////////////////EJERCICIO 31///////////////////////")
    println(ejercicio31(numeros))
    println("//////////////////////EJERCICIO 32///////////////////////")

    val lista1 = listOf("Fruta","Vehiculo","Material","Color")
    val lista2 = listOf("Pera","Coche","Plastico","Rojo")
    println(ejercicio32(lista1,lista2))

    println("//////////////////////EJERCICIO 33///////////////////////")
    println(ejercicio33(5))
    println("//////////////////////EJERCICIO 34 (encriptar y desencriptar)///////////////////////")
    val cadenaencriptar="Esto es una cadena para encriptar"
    println(ejercicio34encriptar(cadenaencriptar))
    println(ejercicio34desencriptar(ejercicio34encriptar(cadenaencriptar)))

    println("//////////////////////EJERCICIO 35///////////////////////")
}

fun ejercicio1(lista: List<Int>):Int{
    var max=lista[0]
    for(i in 1 until lista.size){
        if(lista[i] > max){
            max=lista[i]
        }
    }
    return max
}

fun ejercicio2(lista: List<Int>):Int{
    var suma=0
    for(i in 0 until lista.size){
        suma+=lista[i]
    }
    return suma
}

fun ejercicio3(millas:Int):Double{
    return millas*1.6
}

fun ejercicio4(palabra:String):Boolean{
    return palabra==(palabra.reversed())
}

fun ejercicio5(texto:String,cadena:Char):Int{
    var contador=0
    for(i in texto){
        if(i==cadena){
            contador++
        }
    }
    return contador
}

fun ejercicio6(texto:String, subcadena:String) {
    val textoSplit = texto.split(subcadena)

   println( textoSplit.size-1)
}

fun ejercicio7(texto:String){
    val textoSplit=texto.split(" ")

    var textoNuevo=""
    for (i in textoSplit){

      textoNuevo+= i.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } +" "
    }
    println(textoNuevo)
}

fun ejercicio8(numero:Int){
    val numSplit=numero.toString().split("")
    val numList=numSplit.toList()
    var suma=0
    for (num in 1 until numList.size-1){
        suma+=num
    }
    println("La suma de $numero es: $suma")
}

fun ejercicio9(a: Int, b: Int): Int{
    return max(a,b)
}

fun ejercicio10(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        ejercicio10(n - 1) + ejercicio10(n - 2)
    }
}

fun ejercicio11(a: Int, b: Int){
    if(ejercicio9(a,b)==1){
        println("Son primos relativos")
    }else{
        println("No son primos relativos")
    }
}

fun ejercicio12(numero: Int): Boolean {
    var numeroInvertido = 0
    var numeroOriginal = numero

    while (numeroOriginal > 0) {
        val digito = numeroOriginal % 10
        numeroInvertido = numeroInvertido * 10 + digito
        numeroOriginal /= 10
    }

    return numero == numeroInvertido
}

fun ejercicio13(cadena:String){

    val cadenaSplit=cadena.split(".","#")
    val etiqueta0=cadenaSplit[0]
    when (cadenaSplit.size) {
        1 -> {
            println("<$etiqueta0><$etiqueta0/>")
        }
        2 -> {
            val etiqueta=cadenaSplit[1]
            println("<$etiqueta0 class=“$etiqueta”></$etiqueta0>")
        }
        3 -> {
            val etiquetaDiv=cadenaSplit[1]
            val etiquetaId=cadenaSplit[2]
            println("<$etiqueta0 class=“$etiquetaDiv” id=“$etiquetaId”></$etiqueta0>")
        }
    }
}

fun ejercicio14(num:Int){
    for (i in 0 until num+1){
        for(j in 0 until i){
            print(i)
        }
        println("")
    }
}

fun ejercicio15(array1:Array<Int>,array2:Array<Int>):List<Boolean>{
    val comprobar = BooleanArray(array1.size)

    if(array1.size==array2.size){
        for (i in array1.indices){
            comprobar[i] = array1[i]==array2[i]
        }

    }else{
        println("los arrays no tienen el mismo tamaño")
    }
    return comprobar.toList()
}

fun ejercicio16(numeros:List<Int>):Int{
    var producto=1
    for(num in numeros){
        producto*=num
    }
    return producto
}

fun ejercicio17(numeros:List<Int>):List<Int>{
    val listaPar= mutableListOf<Int>()
    for(num in numeros){
        if(num%2==0){
            listaPar.add(num)
        }
    }
    return listaPar
}

fun ejercicio18(numero:Int):Boolean{
    if(numero<=1){
        return false
    }

    for(i in 2 until numero){
        if(numero%2==0){
            return false
        }
    }
    return true
}

fun ejercicio19(cadena:String):String{
    val vocales="AEIOUaeiou"
    val builder = StringBuilder()

    for(vocal in cadena){
        if(vocal !in vocales){
            builder.append(vocal)
        }
    }
    return builder.toString()
}

fun ejercicio20(num:Int):Int{
    var multi=num
    for(n in 1 until num){
        multi*=n
    }
    return multi
}

fun ejercicio21(cadena:String):String{
    return cadena.reversed()
}

fun ejercicio22(numero:Int):Boolean{
    if (numero <= 0) {
        return false
    }
    var sumaDivisores = 0

    for (i in 1 until numero) {
        if (numero % i == 0) {
            sumaDivisores += i
        }
    }
    return sumaDivisores == numero
}
//FALTA ARREGLAR LO DE LA POTENCIA
fun ejercicio23(num:Int,potencia:Int):Boolean{
    val numSplit=num.toString().split("")
    var suma=0
    for(i in 1 until numSplit.size-1){
        suma+=numSplit[i].toInt()*potencia
    }
    return suma==num
}

fun ejercicio24(matriz:Array<Array<Int>>):Int{
    var max=matriz[0][0]

    for(i in matriz){
        for(j in i){
            if(j>max){
                max=j
            }
        }
    }
    return max
}

fun ejercicio25(matriz:Array<Array<Int>>):Int{
    var min=matriz[0][0]

    for(i in matriz){
        for (j in i){
            if(j<min){
                min=j
            }
        }
    }
    return min
}

fun ejercicio26(palabras:List<String>):String{
    return palabras.maxByOrNull { it.length }.toString()
}

fun ejercicio27(palabra:List<String>):String{
    var min=palabra[0]
    for(i in palabra){
        if(i.length<min.length){
            min=i
        }
    }
    return min
}

fun ejercicio28(cadena:String):Boolean{
    val comprobacion=" 1234567890"
    var test=true

    for(i in cadena){
        if(i in comprobacion){
            test=false
            break
        }else{
            test = true
        }
    }
    return test
}

fun ejercicio29(cadena1:String,cadena2:String):Boolean{
    val str1=cadena1.replace(" ","").lowercase()
    val str2=cadena2.replace(" ","").lowercase()

    if(str1.length!=str2.length){
        println("Las cadenas no tienen el mismo tamaño")
        return false
    }

    val cadenaSorted1 = str1.toCharArray().sorted()
    val cadenaSorted2 = str2.toCharArray().sorted()

    return cadenaSorted1.containsAll(cadenaSorted2)
}


fun ejercicio30(numero:Int):Boolean{
    var n = 1
    var suma = 0

    while (suma < numero) {
        suma += n
        n++
    }
    return suma == numero
}

fun ejercicio31(lista:List<Int>):List<Int>{
    //se usa map para modificar una lista con el it
    return lista.map { it*2 }
}

fun ejercicio32(claves:List<String>,valores:List<String>):Map<String,String>{
    //requiere sirve para crear una condicion y si no se cumple salga con una excepcion
    require(claves.size==valores.size){"Las listas no tienen el mismo tamaño!"}

    //metodo zip
    //añade claves y valores en una lista con zip
    //var union = claves.zip(valores)
    //pasamos la lista a Map
    //var diccionario = union.toMap()
    //return diccionario

    //a mi forma xd
    val diccionario = mutableMapOf<String,String>()
    for(i in claves.indices){
        diccionario[claves[i]] = valores[i]
    }
    return diccionario
}

fun ejercicio33(decimal:Int):String{
    //este ejercicio entendia como se hace pero no me salia, he tenido que usar chatgpt xd
    if(decimal == 0){
        return "0"
    }
    var numero=decimal
    var binario=""

    while(numero>0){
        val aux=numero%2
        binario="$aux$binario"
        numero/=2
    }
    return binario
}

fun ejercicio34encriptar(cadena:String):String{
    var cadenaRev = cadena.reversed()
    var encriptar = StringBuilder()
    for(caracter in cadenaRev){
        when(caracter){
            'a' -> encriptar.append("1")
            'e' -> encriptar.append("2")
            'i' -> encriptar.append("3")
            'o' -> encriptar.append("4")
            'u' -> encriptar.append("5")
            else -> encriptar.append(caracter)
        }
    }
    return encriptar.toString()
}
fun ejercicio34desencriptar(cadena:String):String{
    var desencriptar = StringBuilder()

    for(caracter in cadena){
        when(caracter){
            '1' -> desencriptar.append("a")
            '2' -> desencriptar.append("e")
            '3' -> desencriptar.append("i")
            '4' -> desencriptar.append("o")
            '5' -> desencriptar.append("u")
            else -> desencriptar.append(caracter)
        }
    }
    return desencriptar.toString().reversed()
}

//fun ejercicio35(matriz:Array<Array<Int>>,criterio:String="ASC"){
    //var aux=matriz[0][0]
    //if(criterio.lowercase() == "asc"){
    //    var orden = ">"
    //}else{
    //   var orden = "<"
    //}

    //   for(i in matriz){
    //        for(j in i){
    //            if(aux)
    //        }
    //    }

//}

