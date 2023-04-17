package com.example.chap03.Lambdafunc

fun main() {
    retFunc4()

}
fun retFunc4(){
    println("start of retFunc4")
    inlineLambda(13,3,fun(a,b){
        val result = a + b
        if(result >10) return
        println("result: $result")
    })
    println("end of retFunc4")
}