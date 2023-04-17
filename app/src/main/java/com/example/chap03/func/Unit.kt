package com.example.chap03.func

fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+b}")
}

fun printSum2(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a+b}")
}

fun main() {
    printSum1(2,3)
    printSum2(3,4)
}