package com.example.chap07

open class First {
    open val x: Int = 0
        get() {
            println("First x")
            return field
        }
    val y: Int = 0
}

class Second: First() {
    override val x: Int = 0
        get() {
            println("Second x")
            return field + 3
        }
}

fun main() {
    val second = Second()
    println(second.x) //오버라이딩된 두번째 클래스 객체의 x
    println(second.y) //부모로부터 상속받은 값
}