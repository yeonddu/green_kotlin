package com.example.chap02.exam01

fun main() {
    val a: Int = 128
    val b: Int = 128
    println(a == b)
    println(a === b)

    val c: Int = 128
    val d: Int? = 128
    println(c == d)
    println(c === d) // false(캐시(메모리) 때문에 true 나옴)
}