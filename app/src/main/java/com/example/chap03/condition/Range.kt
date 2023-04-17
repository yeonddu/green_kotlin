package com.example.chap03.condition

fun main() {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade:Char = 'F'

    if(score >= 90.0){
        grade = 'A'
    } else if(score in 80.0 .. 89.9){
        grade = 'B'
    } else if(score in 70.0 .. 79.9){
        grade = 'C'
    }
    println("Score: $score, Grade: $grade")
}