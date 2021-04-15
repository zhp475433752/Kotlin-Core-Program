package com.hpzhang.kotlin_core_program.capt4

/**
 * Created by hpzhang on 4/15/21.
 */
class Capt4 {
    fun test() {
        val coupon = Coupon.GiftCoupon(11111, Coupon.COUPON_TYPE_GIFT, "书包")
        val couponStatus = Coupon.getCouponStatus(coupon, User("zhang", "19900909"))
        Coupon.showStatus(couponStatus);
    }
}