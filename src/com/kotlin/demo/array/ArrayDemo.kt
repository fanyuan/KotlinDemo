package com.kotlin.demo.array

import com.kotlin.demo.shiweishuji.北京.市委书记

val arrayOfInt:IntArray = intArrayOf(2,1,3,5,9,4,6,7)
val arrayOfChar:CharArray = charArrayOf('a','c','b','e','f')
val arrayOfString:Array<String> = arrayOf("我","是","一","个","码农")
val arrayOf书记:Array<市委书记> = arrayOf(市委书记("张"),市委书记("赵"),市委书记("黄"))
fun main() {
    println(arrayOfInt.size)
    for(i in arrayOfInt){
        print("$i ")
    }
    println()
    println(arrayOf书记[1])
    arrayOf书记[1] = 市委书记("王")
    println(arrayOf书记[1])
    println(arrayOfChar.joinToString(""))
    println(arrayOfInt.slice(1..2))

}
