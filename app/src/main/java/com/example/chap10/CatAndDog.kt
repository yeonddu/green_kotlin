package com.example.chap10

interface Pet3 {
    var category: String
    val msgTags: String
        get() = "I'm your lovely pet!"
    fun feeding()
    fun patting(){
        println("Keep patting!")
    }
}

open class Animal(val name: String)

class Dog3(name: String, override var category: String): Animal(name), Pet3{
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Cat3(name: String, override var category: String): Animal(name), Pet3 {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
    fun playWithPet(dog: Dog3) {
        println("Enjoy with my ${dog.name}")
    }
    fun playWithPet(cat: Cat3) {
        println("Enjoy with my ${cat.name}")
    }
}

fun main() {
    val master = Master()
    val dog = Dog3("Toto", "Small")
    val cat = Cat3("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}