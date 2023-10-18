package com.tdam.seminario1

fun main(){
    var numeros= listOf(1,2,3,4,5)
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

      textoNuevo+=textoSplit[i].capitalize()+" "
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
    var cadenaSplit=cadena.split("div.","#")

    if(cadenaSplit.size==1){
        println("<a><a/>")
    }else if(cadenaSplit.size==2){
        var etiqueta=cadenaSplit[1]
        println("<div class=“$etiqueta”></div>")
    }else if(cadenaSplit.size==3){
        var etiqueta_div=cadenaSplit[1]
        var etiqueta_id=cadenaSplit[2]
        println("<div class=“$etiqueta_div” id=“$etiqueta_id”></div>")
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

fun ejercicio15(array1:Array<Int>,array2:Array<Int>){

}