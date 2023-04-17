package com.example.chap03.loop

fun main() {
//1부터 10까지

//홀수, 짝수
    print("1부터 10까지 홀수: ")
    for(x1 in 1..10 step 2) {
        print("$x1, ")
    }
    print("\n")
    print("1부터 10까지 짝수: ")
    for(x2 in 2..10 step 2) {
        print("$x2, ")
    }
    print("\n\n")
//홀수,짝수 누적합계
    print("1부터 10까지 홀수 누적 합계: ")
    var sum1 = 0
    for (y1 in 1..10 step 2){
        sum1 += y1
    }
    println(sum1)

    print("1부터 10까지 짝수 누적 합계: ")
    var sum2 = 0
    for (y2 in 2..10 step 2){
        sum2 += y2
    }
    println(sum2)
    print("\n")
//9,7,5,3,1
    print("9부터 1까지 2씩 감소: ")
    for(z in 9 downTo 1 step 2){
        print("$z, ")
    }
}