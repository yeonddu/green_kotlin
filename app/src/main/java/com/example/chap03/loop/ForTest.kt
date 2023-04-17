package com.example.chap03.loop

fun main() {


//For
//1~10까지의 짝수 출력
    for(x1 in 2..10 step 2) {
        println(x1)
    }
//1~10까지의 홀수 출력
    for(x2 in 1..10 step 2) {
        println(x2)
    }
//1~10까지의 짝수 누적합계 출력
    var sum1 = 0
    for (y2 in 2..10 step 2){
        sum1 += y2
    }
    println(sum1)
//1~10까지의 홀수 누적합계 출력
    var sum2 = 0
    for (y1 in 1..10 step 2){
        sum2 += y1
    }
    println(sum2)

//1~10까지의 10을 제외한 숫자를 내림차순으로 출력
    for(z in 9 downTo 1){
        println(z)
    }
}