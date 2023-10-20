package com.tdam.seminario1

import java.util.Locale
import kotlin.math.max
import kotlin.system.exitProcess

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

    println("//////////////////////EJERCICIO 31///////////////////////")

    println("//////////////////////EJERCICIO 32///////////////////////")

    println("//////////////////////EJERCICIO 33///////////////////////")

    println("//////////////////////EJERCICIO 34///////////////////////")

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
    return palabra.equals(palabra.reversed())
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
    var textoSplit = texto.split(subcadena)

   println( textoSplit.size-1)
}

fun ejercicio7(texto:String){
    var textoSplit=texto.split(" ")

    var textoNuevo=""
    for (i in 0 until textoSplit.size){

      textoNuevo+= textoSplit[i].replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } +" "
    }
    println(textoNuevo)
}

fun ejercicio8(numero:Int){
    var num_split=numero.toString().split("")
    var num_list=num_split.toList()
    var suma=0
    for (num in 1 until num_list.size-1){
        suma+=num
    }
    println("La suma de $numero es: $suma")
}

fun ejercicio9(a: Int, b: Int): Int{
    return Math.max(a,b)
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

    var cadenaSplit=cadena.split(".","#")
    var etiqueta0=cadenaSplit[0]
    if(cadenaSplit.size==1){
        println("<$etiqueta0><$etiqueta0/>")
    }else if(cadenaSplit.size==2){
        var etiqueta=cadenaSplit[1]
        println("<$etiqueta0 class=“$etiqueta”></$etiqueta0>")
    }else if(cadenaSplit.size==3){
        var etiqueta_div=cadenaSplit[1]
        var etiqueta_id=cadenaSplit[2]
        println("<$etiqueta0 class=“$etiqueta_div” id=“$etiqueta_id”></$etiqueta0>")
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
    var listaPar= mutableListOf<Int>()
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
    var numSplit=num.toString().split("")
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




