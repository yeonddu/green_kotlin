package com.example.chap02.exam01

fun main(){
    var str1: String = "Hello Kotlin"
    //str1 = null //null을 허용하지 않음(오류 발생)
    println("str1: $str1")

    var str2: String? = "Hello Kotlin"
    str2 = null
    val len = if(str2 != null) str2.length else -1
    println("str2: $str2 length: ${len}")
}