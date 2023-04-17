package com.example.chap12

//기본적으로 null이 혀용되는 형식 매개변수
class GenericNull<T> {
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main(args: Array<String>) {
    val obj = GenericNull<String>() //null이 불가능한 형식
    obj.EqualityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>() //null 가능한 형식
    obj2.EqualityFunc(null, 10)
}