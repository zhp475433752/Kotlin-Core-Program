package com.hpzhang.kotlin_core_program.capt3

import android.content.Context
import android.util.AttributeSet
import android.view.View
import java.util.*

/**
 * Created by hpzhang on 3/30/21.
 * 主从构造方法
 */

// 主构造方法 Person(age: Int)
class Person(val age: Int) {

    // 从构造函数A
    constructor(timestamp: Long) : this(Date(timestamp))

    // 从构造函数B
    constructor(birth: Date) : this(birth.year)

}

class KotlinView : View {
    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, arrts: AttributeSet?) : this(context, arrts, 0)
    constructor(context: Context?, arrts: AttributeSet?, defStyleAttr: Int) : super(
        context,
        arrts,
        defStyleAttr
    ) {
        //调用从构造函数A -> 从构造函数B -> 主构造函数
        val person = Person(123455L)
    }
}

//如果主构造方法存在注解或者可见性修饰符，则必须加上constructor
internal class Car @inject constructor(age: Int) {
    annotation class inject
}