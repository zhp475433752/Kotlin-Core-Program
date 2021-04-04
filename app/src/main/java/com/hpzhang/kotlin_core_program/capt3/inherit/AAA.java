package com.hpzhang.kotlin_core_program.capt3.inherit;

/**
 * Created by hpzhang on 3/31/21.
 * kotlin接口实现
 *  实现一个接口时，需要实现接口中没有实现的方法
 *  实现多个接口时，方法签名相同，有实现，则需要主动指定（T.super.function()）使用哪个接口的方法或者重写方法
 *                            无实现，可以指定实现哪个方法
 *                方法签名不同，则报错 -> 解决方法：实现类里写2个内部类，分别实现两个接口
 *
 */
public class AAA {

    class AAASub1 implements AAACallback{

        @Override
        public void t() {

        }

        @Override
        public void b() {

        }
    }
    class AAASub2 implements AAA2Callback{

        @Override
        public void t() {

        }

        @Override
        public void b() {

        }
    }



}
