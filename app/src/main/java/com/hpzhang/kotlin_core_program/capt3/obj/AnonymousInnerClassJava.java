package com.hpzhang.kotlin_core_program.capt3.obj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hpzhang on 4/8/21.
 * 匿名内部类
 */
class AnonymousInnerClassJava {
    public void sort() {
        List<String> list = Arrays.asList("zhang", "wang", "hui");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1 == null) return -1;
                if (s2 == null) return 1;
                return s1.compareTo(s2);
            }
        });
    }
}
