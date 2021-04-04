package com.hpzhang.kotlin_core_program.capt3.inherit

/**
 * Created by hpzhang on 3/31/21.
 */
interface Bird3Animal {
    // 抽象的属性
    val name: String
    // 抽象方法
    fun eat():Int
    // kotlin带默认实现的方法
    fun kind() = "[Animal] Animal flying animals"
    fun kind2() = "[Animal] Animal flying animals"
}