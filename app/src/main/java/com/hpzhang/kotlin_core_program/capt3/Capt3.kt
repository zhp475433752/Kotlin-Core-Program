package com.hpzhang.kotlin_core_program.capt3

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
    }
}
