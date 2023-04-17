package com.example.chap03.Lambdafunc

fun main() {

    val getMessage = fun(num: Int): String {
        if (num !in 1..100) {
            return "Error"
        }
        return "Success"
    }

    val result = getMessage(99)

    println(result)
}