package com.example.chap04

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    //인터페이스는 기본적으로 open임
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}
//콤마를 사용해 클래스와 인터페이스 지정
class C : A(), B {
    //f 오버라이딩
    override fun f() = println("C class f()")
    fun test() {
        f() //현재 클래스의 f()
        b() //B 인터페이스의 b()
        super<A>.f() //A 클래스의 f()
        super<B>.f() //B 클래스의 f()
    }
}

fun main() {
    val c = C()
    c.test()
}