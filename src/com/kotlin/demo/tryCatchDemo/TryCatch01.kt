package com.kotlin.demo.tryCatchDemo

import java.lang.Exception
fun test(x:Int,y:Int):Int{
    return try {
        x/y
    }catch (e:Exception){
        e.printStackTrace()
        0
    }
}
fun testFinally(x:Int,y:Int):Int{
    return try {
        x/y
    }catch (e:Exception){
        e.printStackTrace()
        0
    }finally {
        123
        println("---finally---")
    }
}
fun main() {
//    val i = 30
//    val j = 0
//    val result = try {
//        i/j
//    }catch (e:Exception){
//        e.printStackTrace()
//        0
//    }
    var result = test(20,0)
    println(result)
    println("==========")
    result = test(30,5)
    println(result)
    println("++++++++++++++++")
    result = testFinally(20,0)
    println(result)
    println("==========")
    result = testFinally(30,5)
    println(result)
}