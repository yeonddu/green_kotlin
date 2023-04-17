package com.example.chap03.condition

fun main() {
    val str = "안녕하세요."
    val result = when(str) {
        is String -> "문자열입니다."
        else -> false
    }
    print(result)
}