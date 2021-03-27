package com.hpzhang.kotlin_core_program.capt2

/**
 * Created by hpzhang on 3/27/21.
 */
class LamTest {
    fun t() {
        listOf(1,2).forEach { foo(it) }
    }
    fun foo(int: Int) {
        println(int)
    }
}