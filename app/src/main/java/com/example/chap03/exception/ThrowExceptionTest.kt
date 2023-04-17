package com.example.chap03.exception

fun main() {
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch (e:Exception) {
        println(e.message)
    }
    println("amount: $amount")
}

fun checkAmount(amount: Int) {
    if(amount < 1000){
        throw Exception("잔고가 $amount 으로 1000원 이하입니다.")
    }
}