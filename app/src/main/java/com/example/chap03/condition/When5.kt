package com.example.chap03.condition

fun main() {
    var x = 50

    when(x) {
        in 1..10 -> print("x는 1 이상 10 이하입니다.")
        !in 10..20 -> print("x는 10 이상 20이하의 범위에 포함되지 않습니다.")
        else -> print("x는 어떤 범위에도 없습니다.")
    }
}