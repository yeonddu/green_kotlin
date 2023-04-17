package com.example.chap03.loop


fun main() {
    print("점수를 입력하세요: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'f'

    when(score) {
        in 90.0..100.0-> grade = 'a'
        in 80.0..89.9 -> grade = 'b'
        in 70.0..79.9 -> grade = 'c'
        in 60.0..69.9 -> grade = 'd'
        in 50.0..59.9 -> grade = 'e'
        !in 50.0..100.0 -> grade = 'f'
    }
    println("점수: $score 등급: $grade")
}
