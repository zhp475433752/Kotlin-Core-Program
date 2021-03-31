package com.hpzhang.kotlin_core_program.capt3.inherit

/**
 * Created by hpzhang on 3/31/21.
 */
interface Flyer {
    // 抽象方法
    fun fly()
    // kotlin带默认实现的方法
    fun kind() = "[Flyer] Flyer flying animals"
}