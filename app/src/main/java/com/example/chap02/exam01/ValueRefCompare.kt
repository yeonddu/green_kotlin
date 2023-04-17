package com.example.chap02.exam01

fun main() {
    val a: Int = 128
    val b = a

    println(a === b) //true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c

    println(c == d) //true
    println(c === d) //false (값의 내용은 같지만 참조된 객체가 다른 객체)
    println(c === e) //true (값의 내용도 같고 참조된 객체도 동일
}