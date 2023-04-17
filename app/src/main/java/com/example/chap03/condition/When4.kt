package com.example.chap03.condition

import java.lang.Integer.parseInt


fun main() {

    try {
        var x = 10
        var str = "10"
        when (x) {
            parseInt(str) -> print("일치함")
            else -> print("기타")
        }
    } catch (e: NumberFormatException) {
        // 숫자 형식이 아님
    }
}