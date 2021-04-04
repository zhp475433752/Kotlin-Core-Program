package com.hpzhang.kotlin_core_program.capt3.delegate

/**
 * Created by hpzhang on 4/4/21.
 *
 */
class Bird5 (flyer: Flyer, animal: Animal) : CanFly by  flyer, CanEat by animal{
}