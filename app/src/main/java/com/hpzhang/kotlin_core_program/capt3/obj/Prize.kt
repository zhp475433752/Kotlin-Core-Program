package com.hpzhang.kotlin_core_program.capt3.obj

/**
 * Created by hpzhang on 4/8/21.
 * 伴生对象 静态的
 * 一个类的伴生对象跟一个静态类一样，全局只能有一个
 */
class Prize(val name:String, val count :Int, val type:Int) {

    companion object {
        val TYPE_REDPACK = 0
        val TYPE_COUPON = 1

        fun isRedpack(prize: Prize): Boolean {
            return prize.type == TYPE_REDPACK
        }
    }
}

class Apple private constructor(val name:String, val count:Int, val type:Int){
    // 伴生对象里的都是静态的
    companion object {
        private const val TYPE_COMMON = 1
        private const val TYPE_REDPACK = 2
        private const val TYPE_COUPON = 3
        val defaultCommonApple = Apple("奖品", 10, Apple.TYPE_COMMON)
        fun newRedPackApple(name: String, count: Int) = Apple(name, count, Apple.TYPE_REDPACK)
        fun newCouponApple(name: String, count: Int) = Apple(name, count, Apple.TYPE_COUPON)
    }
}
