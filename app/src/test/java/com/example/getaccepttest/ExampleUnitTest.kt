package com.example.getaccepttest

import android.widget.TextView
import org.hamcrest.core.IsNull
import org.junit.Test

import org.junit.Assert.*
import org.w3c.dom.Text

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val allFunc = AllFunctions()


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }






    @Test
    fun testOne_additionFunction() {

        var testOne = allFunc.additoinFunction_Two_Int(3,17)
        assertEquals(testOne,20)
    }

    @Test
    fun testTwo_additionFunctionTwo(){

        var testTwo = allFunc.additoinFunction_Three_Int(30,40,400)
        assertEquals(testTwo, 470)
    }
}
