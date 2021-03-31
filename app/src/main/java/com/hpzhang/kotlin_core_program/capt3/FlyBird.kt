package com.hpzhang.kotlin_core_program.capt3

/**
 * Created by hpzhang on 3/30/21.
 *
 * 限制修饰符
 *
 * kotlin的类和方法默认是不能被继承或重写的，除非加上open修饰符
 * 子类应该尽量避免重写父类非抽象方法，这样违背了面向对象设计原则中的"里氏替换原则"
 */
/**
 * 里氏替换原则
 * 1.子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
 * 2.子类可以增加自己特有的方法
 * 3.当子类的方法实现父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松
 * 4.当子类的方法实现父类的抽象方法时，方法的后置条件（即方法的返回值）要比父类更严格
 */
abstract class FlyBird {
    open fun fly() {
        println("I can fly")
    }

    abstract fun sleep()
}

class Penguin : FlyBird() {
    override fun fly() {
        println("I can't fly actually.")
    }

    override fun sleep() {
        // 子类重写父类抽象方法
    }
}

open class Animal1(){
    val name = "Animal"
}

class Human : Animal1() {
    fun printInfo() {
        println(name)
    }
}


/**
 * 密封类和Java的抽象类一样，子类需要和父类在同一个文件夹中
 */
sealed class A{
    class B : A()
}

