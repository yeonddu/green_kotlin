package com.example.chap11

class Outer2 {
    class Nested2 {
        fun accessOuter() {
            println(country)
            getSomething()
        }
    }

    companion object {
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}

fun main() {
    Outer2.Nested2().accessOuter()
}