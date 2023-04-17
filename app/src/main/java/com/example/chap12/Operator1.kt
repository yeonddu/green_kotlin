package com.example.chap12

data class Point2(val x: Int, val y: Int)

operator fun Point2.unaryMinus() = Point2(-x,-y)

fun main() {
    val point = Point2(10,20)
    val point1 = Point2(-10,-20)
    println(point)
    println(point1)
    println(-point)
    println(-point1)
}