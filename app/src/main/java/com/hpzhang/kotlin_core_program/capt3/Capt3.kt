package com.hpzhang.kotlin_core_program.capt3

import com.hpzhang.kotlin_core_program.capt3.data.Bird6
import com.hpzhang.kotlin_core_program.capt3.data.Bird7
import com.hpzhang.kotlin_core_program.capt3.delegate.Animal
import com.hpzhang.kotlin_core_program.capt3.delegate.Bird5
import com.hpzhang.kotlin_core_program.capt3.delegate.Flyer
import com.hpzhang.kotlin_core_program.capt3.inherit.AAA
import com.hpzhang.kotlin_core_program.capt3.inherit.AAA2Callback
import com.hpzhang.kotlin_core_program.capt3.inherit.AAACallback
import com.hpzhang.kotlin_core_program.capt3.inherit.Bird3

/**
 * Created by hpzhang on 3/28/21.
 */
class Capt3 {
    fun test() {
        val bird = Bird(weight = 200.00)
        println("bird.weight=${bird.weight}")
        println("bird.age=${bird.age}")
        println("bird.color=${bird.color}")

        val flyBird = Penguin()
        println(flyBird.fly())

        val bird3 = Bird3()
        println(bird3.kind())

        val aaa = AAA()
        val aaaCallback = AAACallback(){}
        val aaa2Callback = AAA2Callback(){}
//        println("---------------aaa--------------------${aaa.t()}")
//        println("---------------aaaCallback--------------------${aaaCallback.t()}")
//        println("---------------aaa2Callback--------------------${aaa2Callback.t()}")

        val flyer = Flyer()
        val animal = Animal()
        val b = Bird5(flyer, animal)
        b.fly()
        b.eat()

        val string = "20.1,1,blue"
        // 解构，最多5个参数，解构基于 componentN函数，和主构造函数相关
        // 数组支持解构，还有Pair 和 Triple,这两个都是数据类
        val (weight, age ,color) = string.split(",")
        println(weight)
        println(age)
        println(color)
        println("-------------------")
        val pair = Pair(100, "我是第二个")
        println(pair.first)
        println(pair.second)
        val (weightT, ageT, colorT) = Triple(99, 30, "red")

        val bird6 = Bird6(11.1, 23, "red")
        bird6.code = 32

        val bird7 = Bird7(200, 90)
        bird7.age

    }

    /**
     * 方法重载与返回值无关(因为编译器允许调用一个方法，而不同管这个方法的返回值后续怎么处理)
     */
    fun f1(): Int {
        return 1
    }

    //fun f1():String{} //这个方法编译不通过

    fun f1(code: Int): Int {
        return 3
    }
}
