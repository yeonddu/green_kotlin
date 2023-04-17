package com.example.chap12

open class Parent
class Child(): Parent()
class Cup<T>

fun main() {
    val obj1: Parent = Child()
    //val obj2: Child = Parent() 에러 - 하위 형식인 Child의 객체는 Parent로 변환되지 않음
    //val obj3: Cup<Parent> = Cup<Child>() 에러 - 자료형 형식이 일치하지 않음
    //val obj3: Cup<Child> = Cup<Parent>() 에러 - 자료형 형식이 일치하지 않음

    val obj5 = Cup<Child>()
    val obj6: Cup<Child> = obj5 //형식이 일치하므로 가능
}