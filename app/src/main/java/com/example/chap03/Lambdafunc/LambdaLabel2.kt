package com.example.chap03.Lambdafunc

fun main() {
    retFunc3()
}

fun inlineLambda3(a:Int, b:Int, out:(Int, Int) -> Unit) {
    out(a,b)
}

fun retFunc3(){
    println("start of retFunc3")
    inlineLambda3(13,3){a,b ->
        val result = a+b
        if(result > 10) return@inlineLambda3
        println("result:: $result")
    }
    println("end of retFunc3")
}