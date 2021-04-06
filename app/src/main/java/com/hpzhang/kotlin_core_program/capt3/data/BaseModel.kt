package com.hpzhang.kotlin_core_program.capt3.data

/**
 * Created by hpzhang on 4/6/21.
 * 可以被data class 继承的父类
 */
abstract class BaseModel {
    var code: Int = 0
    var data: Any? = null

}

open class BaseModel2(var code:Int)