package com.example.chap03.condition

fun main() {
    val number = 0
    val result = if(number>0)
        "양수 값"
    else if (number<0)
        "음수 값"
    else
        "0"

    println(result)
}