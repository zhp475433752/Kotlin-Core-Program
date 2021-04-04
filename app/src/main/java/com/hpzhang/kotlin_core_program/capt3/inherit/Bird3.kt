package com.hpzhang.kotlin_core_program.capt3.inherit

/**
 * Created by hpzhang on 3/31/21.
 * kotlin接口继承：
 *  实现一个接口时，需要实现接口中没有实现的方法及未初始化的属性
 *  实现多个接口时，方法签名相同，有实现，则需要主动指定（super<T>.function()）使用哪个接口的方法或者重写方法
 *                            无实现，可以指定实现哪个方法
 *                方法签名不同，则报错 -> 解决方法：实现类里写2个内部类，分别实现两个接口
 *
 */
class Bird3 : Bird3Flyer, Bird3Animal {


    /**
     * 钻石问题（菱形问题）解决方式1：主动实现方法直接覆盖父接口方法
     */
//    override fun kind(): String =  "我是Bird3覆盖的kind方法"

    /**
     * 钻石问题（菱形问题）解决方式2：使用super来指定继承哪个父接口方法
     */
    override fun kind() = super<Bird3Flyer>.kind()
    override fun kind2(): String {
        return ""
    }

    // 重写继承的抽象的属性
    override val name: String
        get() = "zhang"

    // 可以指定哪一个
    override fun eat(): Int {
        return 1
    }

    override fun fly() {
        println("I can fly")
    }


}