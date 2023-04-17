package com.example.chap05

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 //접근 허용
    }
    fun access() {
        privateFunc() //접근 허용
    }
}

class OtherClass {
    private val opc = PrivateClass() //private 하지 않을 경우 접근 불가
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
    //pc.i //접근 불가
    //pc.privateFunc //접근 불가
}

fun TopFunction() {
    val tpc = PrivateClass() //객체 생성 가능
}