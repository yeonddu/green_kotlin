package com.example.chap07

class User2(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    private var tempName: String? = null
    var name: String = _name
        get() {
            if(tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
    var age: Int = _age
}

fun main() {
    val user3 = User2(1,"yeonsu",27)
    user3.name = ""
    println("user3.name = ${user3.name}")
}