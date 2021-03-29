package com.hpzhang.kotlin_core_program.capt3

import kotlin.properties.Delegates

/**
 * Created by hpzhang on 3/28/21.
 * 构造方法中含有 val和var,就等价于在Bird类内部声明了一个同名的属性
 * 构造方法的参数尅在init语句块被调用
 * 延迟初始化
 */
class Bird(val weight: Double = 0.00, val age: Int = 1, val color: String = "blue"){

    /**
     * 延迟初始化：
     *  lateinit
     *  by lazy ---引用不可变的，只能是val变量。首次调用被赋值,默认线程安全的(LazyThreadSafetyMode.SYNCHRONIZED)
     */
    val name:String by lazy {
        "zhangsan"
    }

    // 延迟初始化 必须是var
    lateinit var sex:String
    // 不能用于基本数据类型，如Int、Long等，必须使用包装类
    // 但是却可以使用委托来实现 Delegates.notNull<T>
    var aaa by Delegates.notNull<Int>()

    fun printSex() {
        this.sex = if (this.color == "yellow") "male" else "female"
        this.aaa = 234
    }
}

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

abstract class Bird3 {
    abstract val sex:String // 抽象的可以不用初始化值
}

