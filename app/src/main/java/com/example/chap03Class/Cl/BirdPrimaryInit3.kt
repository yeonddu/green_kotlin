package com.example.chap03Class.Cl

//프로퍼티의 기본값 지정
class Bird10(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {
    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird10(beak="long", color = "red")

    println("coco.name: ${coco.name}, coco.wing: ${coco.wing}")
    println("coco.color: ${coco.color}, coco.beak: ${coco.beak}")
    coco.fly()
}