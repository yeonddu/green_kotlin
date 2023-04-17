package com.example.chap03.condition

fun main() {
    var x = 0
    when (x) {
        0,1 -> print("x == 0 or x == 1")
        else -> print("기타")
    }
}