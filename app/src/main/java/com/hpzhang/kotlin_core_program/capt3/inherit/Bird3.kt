package com.hpzhang.kotlin_core_program.capt3.inherit

/**
 * Created by hpzhang on 3/31/21.
 * kotlin接口中的方法必须被继承者重写，即使接口方法有默认实现
 * Java接口的方法如果有默认实现（Java8用static或者default声明），继承者可以不重写
 */
class Bird3 : Flyer, Animal {


    /**
     * 钻石问题（菱形问题）解决方式1：主动实现方法直接覆盖父接口方法
     */
//    override fun kind(): String =  "我是Bird3覆盖的kind方法"

    /**
     * 钻石问题（菱形问题）解决方式2：使用super来指定继承哪个父接口方法
     */
    override fun kind() = super<Flyer>.kind()

    // 重写继承的抽象的属性
    override val name: String
        get() = "zhang"

    override fun eat() {
        println("I can eat")
    }

    override fun fly() {
        println("I can fly")
    }


}