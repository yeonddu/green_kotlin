package com.example.chap13

fun <T> add(a: T, b: T, op: (T,T) -> T): T {
    return op(a,b)
}

fun <T: Number> addLimit(a: T, b: T, op: (T, T) -> T): T {
    return op(a,b)
}

fun main() {
    val result = add(2,3,{a,b -> a+b})
    println(result)

    //val result2 = addLimit("abc","def",{a,b -> a+b}) //오류 - 제한된 자료형
}
