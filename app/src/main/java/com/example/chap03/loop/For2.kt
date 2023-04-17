package com.example.chap03.loop

fun main() {
    var sum = 0
    for (x in 1..10 step 2){
            sum += x
            print("$x, ")


    }
    print("\n")
    print("Sum: $sum")
}