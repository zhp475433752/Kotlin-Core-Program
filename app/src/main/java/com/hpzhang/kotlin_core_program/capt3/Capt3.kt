package com.hpzhang.kotlin_core_program.capt3

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

    }
}
