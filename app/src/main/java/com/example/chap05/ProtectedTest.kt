package com.example.chap05

open class Base {
    protected var i = 1
    protected fun protectedFunc(){
        i += 1 //접근 허용
    }
    fun access() {
        protectedFunc() //접근 허용
    }
    protected class Nested //내부 클래스에는 지시자 허용
}

class Derived: Base() {
    fun test(base:Base): Int {
        protectedFunc()
        return i
    }
}

fun main() {
    val base = Base() //생성 가능
    //base.i //접근 불가
    //base.protectedFunc //접근 불가
    base.access() //접근 가능
}