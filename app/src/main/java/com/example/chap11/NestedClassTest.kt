package com.example.chap11

class Outer {
    val ov = 5
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv" //외부의 ov에는 접근 불가
    }

    fun outside() {
        val msg = Nested().greeting() //Outer 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg, ${Nested().nv}") //중첩 클래스의 프로퍼티 접근
    }
}

fun main() {
    //static 처럼 Outer 객체 생성 없이 Nested 객체 생성 가능
    val output = Outer.Nested().greeting()
    println(output)

    //Outer 객체 생성 필요
    val outer = Outer()
    outer.outside()
}