package com.kotlin.demo.whenDemo

import com.kotlin.demo.test

fun main() {
    println("when demo 01")
    println(test("123abc"))

    val x = 500
    when (x){
        is Int -> println("x is Int")
        in 1..100 -> println("$x is in 1..100")
        !in 1..100 -> println("$x is not in 1..100")
    }
    var mode = when(x){
        in 1..100 -> "0"
        in 100..500 -> "1"
        else -> "2"
    }
    println("$mode")
}