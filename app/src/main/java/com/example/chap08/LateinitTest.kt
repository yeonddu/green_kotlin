package com.example.chap08

class Person {
    lateinit var name: String
    fun test() {
        if(!::name.isInitialized) {
            println("not initialized")
        } else {
            println("initialized")
        }
    }
}

fun main() {
    val yeonsu = Person()
    yeonsu.test()
    yeonsu.name = "Yeonsu"
    yeonsu.test()
    println("name = ${yeonsu.name}")
}