package com.hpzhang.kotlin_core_program.capt2

import java.util.Collections.emptyList

/**
 * Created by hpzhang on 3/27/21.
 * 函数、高阶函数、lambda、枚举、中缀函数（仅仅只是为了调用优雅）
 */
public class FunTest {
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
        // lambda表达式可以放在（）外面
        filterCountries(list, { country ->
            "中国" == country.name
        })

        // 调用方式4：和3是一样的，只不过lambda表达式放到了()外面
        // 柯里化 Currying
        filterCountries(list) {
            "中国" == it.name
        }

        listOf(1, 2, 3).forEach { foo(it) }

        val name:String? = null
        println(name)
        println(name ?: "name为空，这是新的值")
        println(name)

        schedule(true, Day.FRI)

        // for循环
        for (i in 1..2) println(i)

        // 中缀函数调用
        "zhang" add "huipeng"
        this plusName "huipeng"

    }
    // 高阶函数1：以其他函数作为参数或者返回值的函数
    private fun filterCountries(
        countries: List<Country>,
        bigCountry: (Country) -> Boolean    // 这是一个函数类型参数
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

    fun foo(int: Int): Int {
        println("foo = $int")
        return 1
    }

    // 高阶函数2：返回值是一个函数
    fun foo2(x: Int): (Int) -> Int {
        return { y: Int -> x + y }
    }

    /**
     * when表达式
     */
    private fun schedule(sunny: Boolean, day: Day) = when (day) {
        Day.SAT -> { }
        Day.SUN -> { }
        Day.FRI -> { }
        else -> when {
            sunny -> {}
            else -> {}
        }
    }

    /**
     * 中缀函数-扩展函数
     * 1.必须是某个类型的扩展函数或者成员方法
     * 2.只能有一个参数，不能是可变参数
     * 3.函数参数不能有默认值
     */

    infix fun String.add(name: String) {
        println("我是中缀函数-扩展函数 $this name is $name")
    }

    /**
     * 中缀函数-成员函数
     */
    infix fun plusName(name: String) {
        println("我是中缀函数-成员函数 $this name is $name")
    }
}

data class Country(val name: String)

class CalFactory {
    // 表达式函数体：单函数表达式与等号定义函数
    fun isBigCountry(country: Country): Boolean = "中国" == country.name

    fun isSmallCountry(country: Country, index: Int): Boolean {
        return false
    }
    fun isOk(flag: Boolean) {
        val ok = if (flag) "我是true" else ""
    }

}