package com.hpzhang.kotlin_core_program.capt3

/**
 * Created by hpzhang on 3/28/21.
 * 构造方法中含有 val和var,就等价于在Bird类内部声明了一个同名的属性
 * 构造方法的参数尅在init语句块被调用
 */
class Bird(val weight: Double = 0.00, val age: Int = 1, val color: String = "blue")

/**
 * Bird和Bird2是一样的
 * 这里的构造参数没有val和var
 */
class Bird2(weight: Double = 0.00, age: Int = 1, color: String = "blue"){
    val weight:Double
    val age:Int
    val color:String

    // init语句块，属于上述构造方法的一部分，可以有多个init语句块
    init {
        this.weight = weight    // 构造方法参数可以在init语句块被调用
        this.age = age
        this.color = color
    }

    init {
        // 这是第二个init...
    }

    init {
        // 这是第三个init...
    }

}