package com.example.chap04

//open -> 상속 가능한 클래스
open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing:$wing")
    // open -> 오버라이딩 가능한 메서드
    open fun sing(vol: Int) = println("Sing vol: $vol")
}

class Parrot(name: String, wing: Int=2, beak: String, color: String, var language: String="natural"): Bird(name, wing, beak, color) {
    //Parrot에 추가된 메서드
    fun speak() = println("Speak! $language")
    //오버라이딩된 메서드
    override fun sing(vol: Int) {
        println("I'm a parrot! The volume level is $vol")
        speak()
    }
}

fun main() {
    val parrot = Parrot(name = "myparrot", beak = "short", color = "multiple")
    parrot.language = "English"
    println("Parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    parrot.sing(5)
}