package com.example.chap02.exam01

fun main() {
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any){ //인자를 Any형으로 받음
    if(x is String) {
        println("x is String: $x")
    }
    if(x is Int) {
        println("x is Int: $x")
    }
}