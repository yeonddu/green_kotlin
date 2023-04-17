package com.example.chap07

class User1(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }
    var age: Int = _age
}

fun main() {
    val user1 = User1(1, "yeonsu",27)
    user1.name = "coco"
    println("user3.name = ${user1.name}")
}