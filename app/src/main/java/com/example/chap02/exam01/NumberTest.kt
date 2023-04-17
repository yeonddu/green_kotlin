package com.example.chap02.exam01

fun main() {
    var test: Number = 12.2 //Float 형으로 스마트 캐스트
    println("$test")

    test = 12 //Int 형으로 스마트 캐스트
    println("$test")

    test = 120L //Long 형으로 스마트 캐스트
    println("$test")

    test += 12.0f //Float 형으로 스마트 캐스트
    println("$test")
}