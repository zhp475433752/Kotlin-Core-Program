package com.hpzhang.kotlin_core_program

import com.hpzhang.kotlin_core_program.capt2.FunTest
import com.hpzhang.kotlin_core_program.capt3.Capt3

/**
 * Created by hpzhang on 3/27/21.
 */
object KotlinTest {
    @JvmStatic
    fun main(args: Array<String>) {
        FunTest().test()
        Capt3().test()
    }
}