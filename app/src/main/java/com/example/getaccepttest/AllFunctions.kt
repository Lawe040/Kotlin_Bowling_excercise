package com.example.getaccepttest

import android.view.View
import android.widget.TextView

class AllFunctions {

    fun TextView_One_And_Two_Input_Values
                (number: Int, scoreViewOne: TextView,
                 scoreViewTwo : TextView, viewThatShowsResultOne : TextView, currentValueViewOne: TextView) {

        if (scoreViewOne.text.isEmpty()) {

            scoreViewOne.text = "$number"
        }
        else if (scoreViewTwo.text.isEmpty()) {

            scoreViewTwo.text = "$number"

            viewThatShowsResultOne.text = additoinFunction_Two_Int(convertToInt(scoreViewOne),
                convertToInt(scoreViewTwo)).toString()
            currentValueViewOne.text = viewThatShowsResultOne.text
        }
    }

    fun TextView_Three_And_Four_Input_Values
                (number: Int, scoreViewThree: TextView, scoreViewFour : TextView, viewThatShowsResultTwo : TextView,
                 currentValueViewTwo : TextView, PrevResult : TextView, viewFive : TextView) {

        if (scoreViewThree.text.isEmpty()) {

            scoreViewThree.text = "$number"
        }

        else if (scoreViewFour.text.isEmpty()) {

            scoreViewFour.text = "$number"

            viewThatShowsResultTwo.text =
                additoinFunction_Two_Int(scoreViewThree.text.toString().toInt() ,
                    scoreViewFour.text.toString().toInt()).toString()

            val newResult: Int = additoinFunction_Two_Int(convertToInt(PrevResult),
                convertToInt(viewThatShowsResultTwo))

                viewThatShowsResultTwo.text = newResult.toString()
                currentValueViewTwo.text = viewThatShowsResultTwo.text
        }
    }

    fun TextView_Five_And_Six_Input_Values
                (number: Int, scoreViewFive: TextView,
                 scoreViewSix : TextView, viewThatShowsResultThree : TextView,
                 PrevResultTwo : TextView, currentValueViewThree: TextView, highscoreValue : TextView) {

        if (scoreViewFive.text.isEmpty()) {

            scoreViewFive.text = "$number"
        }
        else if (scoreViewSix.text.isEmpty()) {

            scoreViewSix.text = "$number"

            viewThatShowsResultThree.text = additoinFunction_Two_Int(convertToInt(scoreViewFive),
                convertToInt(scoreViewSix)).toString()

            val newResult: Int = additoinFunction_Two_Int(convertToInt(viewThatShowsResultThree),
                convertToInt(PrevResultTwo))

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

    fun additoinFunction_Two_Int(inputIntOne:Int, inputIntTwo: Int): Int {

            val sum = inputIntOne + inputIntTwo
            return sum
    }

    fun additoinFunction_Three_Int(inputIntOne:Int, inputIntTwo: Int, inputIntThree: Int): Int {

        val sumTwo = inputIntOne + inputIntTwo + inputIntThree
        return sumTwo
    }

    fun strikePointViewOne (resultView : TextView, scoreViewOne: Int) {
        resultView.text = scoreViewOne.toString()
    }

    fun strikePointViewTwo (resultView : TextView, scoreViewOne: Int, prevResult : TextView) {

        var calculate =  additoinFunction_Two_Int(scoreViewOne,convertToInt(prevResult))
        resultView.text = calculate.toString()
    }

    fun strikePointViewThree (resultView : TextView, scoreViewOne: Int, prevResult : TextView) {

        var calculate = additoinFunction_Two_Int(scoreViewOne, convertToInt(prevResult))
        var calculateTwo = bonusRewardOne(calculate)
        resultView.text = calculateTwo.toString()
    }

    fun sparePointViewOne (scoreToAdd : TextView,scoreViewOne: Int, resultView: TextView) {
        resultView.text = (convertToInt(scoreToAdd) + scoreViewOne.toString().toInt()).toString()
    }

    fun sparePointViewTwo (scoreToAdd : TextView,scoreViewOne: Int, resultView: TextView, prevResult: TextView) {

        var calculateTwo = additoinFunction_Three_Int(scoreViewOne,convertToInt(prevResult),convertToInt(scoreToAdd))
        resultView.text = calculateTwo.toString()
    }

    fun sparePointViewThree (scoreToAdd : TextView,scoreViewOne: Int, resultView: TextView, prevResult: TextView) {

        var calculateTwo = additoinFunction_Three_Int(scoreViewOne,convertToInt(prevResult),convertToInt(scoreToAdd))
        resultView.text = calculateTwo.toString()
    }

    fun currentScore(currentScore : TextView, resultView: TextView) {
        currentScore.text = resultView.text
    }

    fun currentScoreWithHighScore(currentScore : TextView, resultView: TextView, highscoreValue: TextView) {
        currentScore.text = resultView.text
        highscoreValue.text = currentScore.text
    }

    fun convertToInt(textViewToConvert: TextView): Int {
        val convertedToInt = textViewToConvert.text.toString().toInt()
        return convertedToInt
    }

    fun bonusRewardOne(checkInt : Int): Int {

        var rewardIfJackPot = 490
        var noBonus = checkInt
        var sum = rewardIfJackPot + checkInt

        if (checkInt == 120) {

            return sum
        }

            return noBonus
    }

    fun if_First_Two_Shots_is_Strikes(compareResult : Int) : Int {

        var numberToAdd = 20
        var sum : Int = numberToAdd + compareResult
        var number = 0

        if (compareResult == 80) {

            return sum
        }
        return number
    }
}