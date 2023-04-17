package com.example.chap07

class User(_id: Int, _name: String, _age: Int) {
    var id: Int = _id
        get() = field
    var name: String = _name
        get() = field
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user1 = User(1,"Kildong", 30)
    user1.age = 35 //세터 동작
    println("user1.age = ${user1.age}") //게터 동작
}
