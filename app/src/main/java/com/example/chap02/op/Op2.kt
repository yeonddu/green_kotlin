package com.example.test.op

fun main() {
    var check = (5>3) && (5>2)
    check = (5>3) || (2>5)
    check = !(5>3)
    println(check)
}