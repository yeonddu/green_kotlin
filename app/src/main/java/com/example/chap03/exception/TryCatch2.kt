package com.example.chap03.exception
// 산술연산 예외
fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a/b
    } catch(e:ArithmeticException){
        println("Exception is handled. ${e.message}")
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
}