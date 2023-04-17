package com.example.chap14

fun main() {
    val arr = intArrayOf(1,2,3,4,5)
    println(arr.get(2))
    println(arr[2])

    val arr2d = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    println(arr2d[2][1])

    arr.set(2,7)
    arr[0] = 8

    arr2d[2][1] = 2

    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}, arr2d[2][1]: ${arr2d[2][1]}")
}