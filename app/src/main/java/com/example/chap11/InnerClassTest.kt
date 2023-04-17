package com.example.chap11
//이너 클래스 생성
class Smartphone(val model: String) {
    //인스턴스
    private val cpu = "Exynos"
    //인스턴스
    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }
}

fun main() {
    val mySdcard = Smartphone("S23").ExternalStorage(256)//객체 생성
    println(mySdcard.getInfo())
}