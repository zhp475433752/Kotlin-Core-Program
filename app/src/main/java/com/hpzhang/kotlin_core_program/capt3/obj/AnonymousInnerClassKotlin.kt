package com.hpzhang.kotlin_core_program.capt3.obj

import java.util.*
import kotlin.Comparator

/**
 * Created by hpzhang on 4/8/21.
 * object表达式代替Java的匿名内部类
 */
class AnonymousInnerClassKotlin {
    fun sort() {
        val list = arrayListOf("zah", "fewf" , "ewoe")
        val comparator = object : Comparator<String>{
            override fun compare(s1: String?, s2: String?): Int {
                if (s1 == null) return -1
                if (s2 == null) return 1
                return s1.compareTo(s2)
            }
        }
        Collections.sort(list, comparator)
    }
}