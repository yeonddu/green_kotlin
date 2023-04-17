package com.example.chap04

open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child: Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f() //현재 이너 클래스의 f()
            Child().f() //바로 바깥 클래스의 f()
            super@Child.f() //바깥 클래스의 상위 클래스의 f()
            println("[Inside] super@Child.x: ${super@Child.x}")
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()// 이너클래스의 test()
}