package com.example.chap03.Lambdafunc

fun main() {
    retFunc2()
}

fun inlineLambda2(a:Int, b:Int, out: (Int,Int) -> Unit) {
    out(a,b)
}

fun retFunc2() {
    println("start of retFunc2")
    inlineLambda2(5,3) lit@{a, b ->
        val result = a+b
        if(result>10) return@lit
        println("result: $result")
    }
    println("end of retFunc2")
}