package com.tdam.seminario1

fun main(){
    var numeros= listOf(1,2,3,4,5)
    println(ejercicio2(numeros))
    println(ejercicio3(5))
    println(ejercicio4("olo"))
    println(ejercicio5("Holaaaaa"))
    ejercicio5("Hola")
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

fun ejercicio5(texto:String):Int{
    var cadena=texto.slice(1..2)

}

fun ejercicio6(texto:String,subcadena:String){
    var comprobar_text=texto.split(" ")
    for(i in 0 until comprobar_text.size){
        if(comprobar_text[i])
    }
}