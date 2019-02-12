package com.example.getaccepttest

import android.view.View
import android.widget.TextView

class AllFunctions  {

    fun TextView_One_And_Two_Input_Values (number: Int, scoreViewOne: TextView, scoreViewTwo : TextView,
                                           viewThatShowsResultOne : TextView, currentValueViewOne: TextView) {

        if (scoreViewOne.text.isEmpty()) {

            scoreViewOne.text = "$number"
        }
        else if (scoreViewTwo.text.isEmpty()) {

            scoreViewTwo.text = "$number"

            viewThatShowsResultOne.text = (scoreViewOne.text.toString().toInt()
                    + scoreViewTwo.text.toString().toInt()).toString()

            currentValueViewOne.text = viewThatShowsResultOne.text
        }
    }

    fun TextView_Three_And_Four_Input_Values (number: Int, scoreViewThree: TextView, scoreViewFour : TextView,
                                           viewThatShowsResultTwo : TextView, currentValueViewTwo : TextView,
                                              PrevResult : TextView) {

        if (scoreViewThree.text.isEmpty()) {

            scoreViewThree.text = "$number"
        }
        else if (scoreViewFour.text.isEmpty()) {

            scoreViewFour.text = "$number"

            viewThatShowsResultTwo.text = (scoreViewThree.text.toString().toInt()
                    + scoreViewFour.text.toString().toInt()).toString()

            val newResult: Int = viewThatShowsResultTwo.text.toString().toInt() + PrevResult.text.toString().toInt()

            viewThatShowsResultTwo.text = newResult.toString()
            currentValueViewTwo.text = viewThatShowsResultTwo.text
        }

    }

    fun TextView_Five_And_Six_Input_Values (number: Int, scoreViewFive: TextView, scoreViewSix : TextView,
                                              viewThatShowsResultThree : TextView, PrevResultTwo : TextView,
                                            currentValueViewThree: TextView, highscoreValue : TextView) {

        if (scoreViewFive.text.isEmpty()) {

            scoreViewFive.text = "$number"
        }
        else if (scoreViewSix.text.isEmpty()) {

            scoreViewSix.text = "$number"

            viewThatShowsResultThree.text = (scoreViewFive.text.toString().toInt()
                    + scoreViewSix.text.toString().toInt()).toString()

            val newResult: Int = viewThatShowsResultThree.text.toString().toInt() + PrevResultTwo.text.toString().toInt()

            viewThatShowsResultThree.text = newResult.toString()

            currentValueViewThree.text = viewThatShowsResultThree.text
            highscoreValue.text = viewThatShowsResultThree.text
        }
    }

    fun ViewReplacementDouble(hideViewOne : TextView, hideViewTwo : TextView, viewToBeShown : TextView) {

        hideViewOne.visibility   = View.GONE
        hideViewTwo.visibility   = View.GONE
        viewToBeShown.visibility = View .VISIBLE
    }

    fun ViewReplacementSingle(hideViewOne : TextView, viewToBeShown : TextView) {

        hideViewOne.visibility   = View.GONE
        viewToBeShown.visibility = View .VISIBLE
    }

    fun dummyIntDouble(viewToConvert : TextView, viewToConvertTwo: TextView) {

        var dummyInt = 0

        viewToConvert.text    = dummyInt.toString()
        viewToConvertTwo.text = dummyInt.toString()
    }

    fun dummyIntSingle(viewToConvert : TextView) {

        var dummyInt = 0
        viewToConvert.text    = dummyInt.toString()
    }
}