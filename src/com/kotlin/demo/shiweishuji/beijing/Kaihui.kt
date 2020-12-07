package com.kotlin.demo.shiweishuji.beijing
import com.kotlin.demo.shiweishuji.北京.市委书记
import com.kotlin.demo.shiweishuji.shanghai.市委书记 as 茶水大王
import com.kotlin.demo.shiweishuji.tianjin.市委书记 as 围棋大王
fun main() {
    val 北京市市委书记:市委书记 = 市委书记("张")
    val 上海市市委书记:茶水大王 = 茶水大王("李")
    val 天津市市委书记:围棋大王 = 围棋大王("王")
    println(北京市市委书记.toString())
    println("开会了")
}