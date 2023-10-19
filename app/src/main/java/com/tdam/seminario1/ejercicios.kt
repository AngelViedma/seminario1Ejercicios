package com.tdam.seminario1

import java.util.Locale
import kotlin.math.max

fun main(){
    val numeros= listOf(1,2,3,4,5)

    println(ejercicio1(numeros))
    println(ejercicio2(numeros))
    println(ejercicio3(5))
    println(ejercicio4("olo"))
    println(ejercicio5("Holaaaaa",'a'))
    ejercicio6("Hola me llamo pepe","23 me llamo")
    ejercicio7("hola me llamo angel")
    ejercicio8(123)
    print("El maximo comun divisor es: ")
    println(ejercicio9(5,10))
    print("La sucession de Fibonnaci es: ")
    println(ejercicio10(4))
    ejercicio11(6,35)
    println(ejercicio12(101))
    ejercicio13("a")
    ejercicio13("div.coche#VWPolo")
    ejercicio13("div.oferta")
    ejercicio14(6)
    val num1= arrayOf(1,2,3,4,5)
    val num2= arrayOf(1,1,2,4,3)
    println(ejercicio15(num1,num2))
    println(ejercicio20(5))
    println(ejercicio21("Hola"))
    println(ejercicio22(28))
    println(ejercicio23(371,3))
    val matriz = arrayOf(
        arrayOf(12,2,3,4),
        arrayOf(1,6,80,8),
        arrayOf(9,10,11,12)
    )
    println(ejercicio24(matriz))
    println(ejercicio25(matriz))
    val listaStrings = listOf("hola","palabra","palabraMasLarga","xd")
    println(ejercicio26(listaStrings))
    println(ejercicio27(listaStrings))
    println(ejercicio28("Hola9"))

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
    var regex = """/^[0-9\s]*$/"""
    return cadena.contains(regex)

//    var aux = regex.toRegex().find(cadena)
//
//   // if(aux) return true
//    return false

}




