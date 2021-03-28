package com.hpzhang.kotlin_core_program.capt2

/**
 * Created by hpzhang on 3/28/21.
 * 枚举
 */
enum class Day {
    MON,
    TUE,
    WEN,
    THU,
    FRI,
    SAT,
    SUN
}

enum class DayOfWeek(val day: Int){
    MON(1),
    TUE(2),
    WEN(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7);//如果枚举类还有其他属性和方法，则这里必须以分号结束

    fun getDayNumber(): Int {
        return day
    }
}

