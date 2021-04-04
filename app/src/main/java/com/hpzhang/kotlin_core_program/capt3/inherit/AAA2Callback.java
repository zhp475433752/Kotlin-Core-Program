package com.hpzhang.kotlin_core_program.capt3.inherit;

/**
 * Created by hpzhang on 3/31/21.
 */
public interface AAA2Callback {
    default void t(){
       int k = 0;
        System.out.println("AAA2-Callback-t()");
    }

    void b();
}
