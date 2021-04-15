package com.hpzhang.kotlin_core_program.capt4

/**
 * Created by hpzhang on 4/15/21.
 * 优惠券状态类，包含信息：优惠券 & 用户
 */
sealed class CouponStatus {
    // 未领取
    data class StatusNotFetched(val coupon: Coupon) : CouponStatus()
    // 已领取
    data class StatusFetched(val coupon: Coupon, val user: User) : CouponStatus()
    // 已使用
    data class StatusUsed(val coupon: Coupon, val user: User) : CouponStatus()
    // 已过期
    data class StatusExpired(val coupon: Coupon) : CouponStatus()
}