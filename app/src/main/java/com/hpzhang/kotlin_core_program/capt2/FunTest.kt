package com.hpzhang.kotlin_core_program.capt2

import java.util.Collections.emptyList

/**
 * Created by hpzhang on 3/27/21.
 */
public class FunTest {
    // 高阶函数：以其他函数作为参数或者返回值的函数
    private fun filterCountries(
        countries: List<Country>,
        bigCountry: (Country) -> Boolean    // 这是一个
    ): List<Country> {
        for (country in countries) {
            if (bigCountry(country)) {
                println("大国：${country.name}")
            } else {
                println("小国：${country.name}")
            }
        }
        return emptyList()
    }

    /**
     * 真正调用的地方
     */
    fun test() {
        val factory = CalFactory()
        val list = mutableListOf<Country>()
        list.add(Country("中国"))
        list.add(Country("日本"))

        // 调用方式1：方法引用 ::
        filterCountries(list, factory::isBigCountry)

        // 调用方式2：匿名函数
        filterCountries(list, fun(country: Country): Boolean {
            return "中国" == country.name
        })

        // 调用方式3：lambda表达式(与匿名函数一样，是一种函数字面量)
        filterCountries(list, {
            country -> "中国" == country.name
        })
    }

}

data class Country(val name: String)

class CalFactory {
    // 表达式函数体：单函数表达式与等号定义函数
    fun isBigCountry(country: Country): Boolean = "中国" == country.name

    fun isSmallCountry(country: Country, index: Int): Boolean {
        return false
    }

}