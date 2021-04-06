package com.hpzhang.kotlin_core_program.capt3.data

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by hpzhang on 4/4/21.
 * 数据类
 * 如果是val 则会在内部创建属性
 * 数据类继承问题
 */
data class Bird6(val weight: Double, val age: Int, val color: String) : BaseModel()

data class Bird7(val code2: Int, val age: Int) : BaseModel2(code = code2)