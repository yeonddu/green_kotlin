package com.example.chap03.condition

fun main() {
    var x = 3
    when (x) {
        1 -> print("x==1")
        2 -> print("x==2")
        else -> {
            print("x는 1, 2가 아닙니다.")
        }
    }
}