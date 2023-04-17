package com.example.chap02.exam01

fun main() {
    val num = 256

    if(num is Int){
        print(num)
    } else if(num !is Int){
        println("Not a Int")
    }
}