package com.example.chap08

class Person2(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person: Person2 by lazy {
        isPersonInstantiated = true
        Person2("Song", 23)
    }
    val personDelegate = lazy{Person2("Hong",25)}

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")
    println("personDelagate.value.name = ${personDelegate.value.name}")

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")

}