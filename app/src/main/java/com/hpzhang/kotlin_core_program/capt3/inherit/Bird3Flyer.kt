package com.hpzhang.kotlin_core_program.capt3.inherit

/**
 * Created by hpzhang on 3/31/21.
 */
interface Bird3Flyer {
    // 抽象方法
    fun fly()
    fun eat():Int
    // kotlin带默认实现的方法
    fun kind() = "[Flyer] Flyer flying animals"
    fun kind2() = "[Flyer] Flyer flying animals"

    fun getColor() = "flyer color"
}