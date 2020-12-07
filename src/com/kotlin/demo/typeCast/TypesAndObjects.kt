package com.kotlin.demo.typeCast


class 妹子(override var 性格:String, override var 长相:String, override var 声音:String) : 人(性格,长相,声音)
class 帅哥(override var 性格:String,override var 长相:String,override var 声音:String) : 人(性格,长相,声音)
open class 人(open var 性格:String, open var 长相:String, open var 声音:String){
	init{
		println("new 了一个${this.javaClass.getSimpleName()},其性格：${性格}，长相：$长相，声音：$声音")
	}
}
fun main(args: Array<String>) {
	val 我喜欢的妹子 = 妹子("温柔","甜美","动人")
	val 我膜拜的帅哥 = 帅哥("彪悍","帅气","深厚")
	println(我喜欢的妹子 is 人)
}