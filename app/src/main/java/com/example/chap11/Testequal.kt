package com.example.chap11

data class Customer(var name: String, var email: String) {
    var job: String = "unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
    init {

    }
}

fun main() {
    val cus1 = Customer("Sean", "sean@mail.com")
    val cus2 = Customer("Sean", "sean@mail.com")

    println(cus1 == cus2)
    println(cus1.equals(cus2))
    println("${cus1.hashCode()}. ${cus2.hashCode()}")

    val cus3 = cus1.copy(name="Alice")
    println(cus1.toString())
    println(cus3.toString())

}