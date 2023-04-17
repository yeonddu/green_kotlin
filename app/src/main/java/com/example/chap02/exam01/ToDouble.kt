package com.example.chap02.exam01

fun main(){
    val a: Int = 1
    //val b: Double = a //자료형 불일치 오류
    //val c: Int = 1.1 //자료형 불일치 오류

    val b: Double = a.toDouble()
    val result = 1L + 3
    println(a)
    println(b)
    println(result)
}