package com.example.chap05

internal class InternalClass {
    internal var i = 1
    internal fun icFunc() {
        i += 1
        println(i)
    }
    fun access() {
        icFunc()
    }
}

class Other() {
    internal val ic = InternalClass() //프로퍼티 지정시 internal로 맞춰야 한다.
    fun test() {
        println(ic.i) //접근 허용
        println(ic.icFunc()) //접근허용
    }
}

fun main() {
    val mic = InternalClass() // 생성 가능
    mic.i
    mic.icFunc()
    val other = Other()
    other.test()
}