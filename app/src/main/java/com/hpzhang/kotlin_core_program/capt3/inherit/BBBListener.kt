package com.hpzhang.kotlin_core_program.capt3.inherit

/**
 * Created by hpzhang on 4/1/21.
 */
interface BBBListener {
    val name : String
    fun getName()
    fun getLastName(): String {
        return "zhang"
    }

}