package com.hpzhang.kotlin_core_program.capt4

/**
 * Created by hpzhang on 4/15/21.
 * ADT：代数数据类型，例如枚举，使用when表达式的时候，不会有遗漏
 */
sealed class Coupon {
    companion object {
        // 优惠券类型
        const val COUPON_TYPE_CASH = "CASH"
        const val COUPON_TYPE_DISCOUNT = "DISCOUNT"
        const val COUPON_TYPE_GIFT = "GIFT"

        /**
         * 获取优惠券状态
         */
        fun getCouponStatus(coupon: Coupon, user: User):CouponStatus = when {
            isExpired(coupon) -> CouponStatus.StatusExpired(coupon)
            isUsed(coupon, user) -> CouponStatus.StatusUsed(coupon, user)
            isFetched(coupon, user) -> CouponStatus.StatusFetched(coupon, user)
            else -> CouponStatus.StatusNotFetched(coupon)
        }

        /**
         * 状态是ADT,所以不需要写else分支，新增状态，编译器会报错提示
         */
        fun showStatus(status: CouponStatus) = when (status) {
            is CouponStatus.StatusExpired -> showExpired()
            is CouponStatus.StatusNotFetched -> showNotFetched()
            is CouponStatus.StatusFetched -> showFetched()
            is CouponStatus.StatusUsed -> showUsed()
        }

        private fun showUsed() { println("显示状态：已使用")}
        private fun showFetched() {println("显示状态：已领取")}
        private fun showNotFetched() {println("显示状态：未领取")}
        private fun showExpired() {println("显示状态：已过期")}

        private fun isFetched(c: Coupon, user: User) = false
        private fun isUsed(c: Coupon, user: User) = true
        private fun isExpired(c: Coupon) = false
    }

    /**
     * 优惠券类型，方便扩展
     */
    class CashCoupon(val id: Long, val couponType: String, val leastCost: Long, val reduceConst: Long) : Coupon()
    class DiscountCoupon(val id: Long, val couponType: String, val disCount: Int) : Coupon()
    class GiftCoupon(val id: Long, val couponType: String, val gift: String) : Coupon()



}