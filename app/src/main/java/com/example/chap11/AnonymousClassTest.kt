package com.example.chap11
//익명 객체를 위한 인터페이스 추가
interface Switcher {
    fun on(): String
}

class Smartphone3(val model: String) {
    fun powerOn(): String {
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model"
        }
        val powerStatus = Led("Red")
        val powerSwitch = object: Switcher { //익명 객체를 사용해 Switcher의 on() 구현
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on() //익명 객체의 메서드 사용
    }
}

fun main() {
    var myphone = Smartphone3("iphone13")
    println(myphone.powerOn())
}