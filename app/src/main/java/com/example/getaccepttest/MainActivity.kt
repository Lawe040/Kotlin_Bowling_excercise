package com.example.getaccepttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        allNumberButtons()
    }

    private fun allNumberButtons() {

        val buttonNumbers = arrayOf(button_number_zero, button_number_one, button_number_two,button_number_three
        , button_number_four, button_number_five, button_number_six, button_number_seven, button_number_eight
        , button_number_nine, button_number_ten)
        for (i in buttonNumbers.indices) {

            buttonNumbers[i].setOnClickListener {
               calculation(i)
            }
        }
    }
    // function that calculates the input numbers.
    private fun calculation(num:Int) {

        val viewOne   = num.toString().toInt()
        val viewTwo   = num.toString().toInt()
        val viewThree = num.toString().toInt()
        val viewFour  = num.toString().toInt()
        val viewFive  = num.toString().toInt()
        val viewSix   = num.toString().toInt()

        if (score_view_one.text.isEmpty()) {

            score_view_one.text = "$viewOne"
        }
        else if (score_view_two.text.isEmpty()) {

            score_view_two.text = "$viewTwo"

            sumOfTwoInts(inputOne = score_view_one.text.toString().toInt(),
                inputTwo = score_view_two.text.toString().toInt())
        }
        else if (score_view_three.text.isEmpty()) {

          score_view_three.text = "$viewThree"
        }
        else if (score_view_four.text.isEmpty()) {

            score_view_four.text = "$viewFour"

             sumOfTwoInts(inputOne = score_view_three.text.toString().toInt(),
                inputTwo = score_view_four.text.toString().toInt())
        }
        else if (score_view_five.text.isEmpty()) {

            score_view_five.text = "$viewFive"
        }
        else if (score_view_six.text.isEmpty()) {

            score_view_six.text = "$viewSix"

            sumOfTwoInts(inputOne = score_view_five.text.toString().toInt(),
                inputTwo = score_view_six.text.toString().toInt())

            high_score_value.text = current_score_value.text
        }
    }
    //function that adds two numbers & prints it out in result view.
    private fun sumOfTwoInts(inputOne: Int, inputTwo: Int){

        val mySavedSum = DataStorage(this)
        var sumCount = mySavedSum.getCurrentSum()
        val result = inputOne + inputTwo

        sumCount  = result
        mySavedSum.setCurrentSum(sumCount)
        current_score_value.text = sumCount.toString()

        if (result_of_view_one.text.isEmpty()) {
            result_of_view_one.text = result.toString()
        }
        else if (result_view_two.text.isEmpty()) {

            result_view_two.text = result.toString()
        }
        else  {
            result_view_three.text = result.toString()
        }
    }
} // Class
