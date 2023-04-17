package com.example.chap03.loop

fun main() {
    print("직책을 입력하세요: ")
    val str = readLine()!!

    when(str) {
        "부장" -> println(600)
        "차장" -> println(500)
        "과장" -> println(400)
        "대리" -> println(300)
        "사원" -> println(200)
        else -> println("다시 입력하세요")
    }
}