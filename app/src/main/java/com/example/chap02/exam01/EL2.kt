package com.example.chap02.exam01

fun main(){
    var a = 1
    var str1 = "a =$a"
    val str2 = "a = ${a+2}" //문자열에 표현식 사용

    println("str1: \"$str1\", str2: \"$str2\"")
}