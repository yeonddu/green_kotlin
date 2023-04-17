package com.example.chap03.condition

fun main() {
    val a = 12
    val b = 7

    val max = if(a>b) {
        println("a 선택")
        a
    }
    else {
        println("b 선택")
        b
    }
    println(max)
}