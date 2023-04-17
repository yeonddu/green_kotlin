package com.example.chap11

//메서드에 지역 클래스 추가
class Smartphone2(val model: String) {
    //인스턴스
    private val cpu = "Exynos"
    //인스턴스
    inner class ExternalStorage2(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }
    fun powerOn(): String {
        //지역 클래스
        class Led(val color: String){
            fun blink(): String = "Blinking $color on $model" //외부 프로퍼티 접근 가능
        }
        val powerStatus = Led("Red") //지역 클래스 사용
        return powerStatus.blink()
    }
}

fun main() {
    val mySdcard = Smartphone("S23").ExternalStorage(256)//객체 생성
    println(mySdcard.getInfo())
    val myphone = Smartphone2("Note9")
    myphone.ExternalStorage2(128)
    println(myphone.powerOn())
}