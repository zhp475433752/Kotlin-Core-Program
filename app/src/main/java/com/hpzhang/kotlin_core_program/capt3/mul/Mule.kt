package com.hpzhang.kotlin_core_program.capt3.mul

/**
 * Created by hpzhang on 4/4/21.
 * 钻石问题解决方法1：内部类继承
 * 钻石问题解决方法2：委托 {@link com.hpzhang.kotlin_core_program.capt3.delegate.Bird5}
 */
class Mule {
    // 私有内部类实现多继承
    private inner class HorseC : Horse()
    private inner class DonkeyC : Donkey()

    fun runFast() {
        HorseC().runFast()
    }

    fun getNameHorse() {
        HorseC().getName()
    }

    fun doLongTimeThing() {
        DonkeyC().doLongTimeThing()
    }

    fun getNameDonkey() {
        DonkeyC().getName()
    }
}