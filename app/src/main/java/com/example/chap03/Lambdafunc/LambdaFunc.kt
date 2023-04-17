package com.example.chap03.Lambdafunc

fun main() {
    println(getMessage(88))
}

val getMessage = lambda@ {num: Int ->
    if(num !in 1..100){
        return@lambda "Error"
    }
    "Sucess"
}