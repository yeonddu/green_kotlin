package com.example.chap03.condition

fun main() {
    var data = 10
    val result = if(data>0){
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)
}