package com.example.getaccepttest

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    val allFunc = AllFunctions()
    val mainTest = MainActivity()


    @Test
    fun testOne_additionFunction() {

        var testOne = allFunc.additoinFunction_Two_Int(8,8)
        assertEquals(testOne,16)
    }

    @Test
    fun testTwo_additionFunctionTwo(){

        var testTwo = allFunc.additoinFunction_Three_Int(30,40,400)
        assertEquals(testTwo, 470)
    }

    @Test
    fun test_three() {

        var testIfResultIsRight = allFunc.bonusRewardOne(120)
        assertEquals(testIfResultIsRight, 610)
    }

    @Test
    fun test_five() {

        var testfive = allFunc.if_First_Two_Shots_is_Strikes(330,40)
        assertEquals(testfive, 40)
    }
}
