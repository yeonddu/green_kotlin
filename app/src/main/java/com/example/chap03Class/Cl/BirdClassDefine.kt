package com.example.chap03Class.Cl

class Bird {
    var name: String = "mybird"
    var wing: Int = 2
    var beak: String = "short"
    var color: String = "blue"

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Song vol: $vol")
}

fun main() {
    val coco = Bird()
    coco.color = "red"

    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}