package com.example.getaccepttest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    private val strike = 40
    private val spare = 25
    var dummy = 0
    var allFunctions = AllFunctions()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberButtonClicked()
        strike_And_Spare_Result()

        restart_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            finish()
            startActivity(intent)
        }
    }

   private fun numberButtonClicked() {

        val theNumberButtons = arrayOf(button_number_zero, button_number_one, button_number_two,
            button_number_three, button_number_four, button_number_five, button_number_six, button_number_seven,
            button_number_eight, button_number_nine, button_number_ten)

        for (i in theNumberButtons.indices) {

            theNumberButtons[i].setOnClickListener {
                dummy = i
                calculation()
            }
        }
    }

    fun calculation() {

        if (score_view_one.text.isEmpty() || score_view_two.text.isEmpty()) {

            allFunctions.TextView_One_And_Two_Input_Values(dummy,score_view_one,score_view_two,
                result_view_one, current_score_value)
        }

        else if (score_view_three.text.isEmpty() || score_view_four.text.isEmpty()) {

            allFunctions.TextView_Three_And_Four_Input_Values(dummy,score_view_three,
                score_view_four,result_view_two,current_score_value,result_view_one)
        }

        else if (score_view_five.text.isEmpty() || score_view_six.text.isEmpty()) {

            allFunctions.TextView_Five_And_Six_Input_Values(dummy,score_view_five,
                score_view_six,result_view_three,result_view_two, current_score_value, high_score_value)
        }
    }

    private  fun strike_And_Spare_Result() {

        strike_button.setOnClickListener {
            
            if (score_view_one.text.isEmpty() && score_view_two.text.isEmpty()) {

                allFunctions.dummyIntDouble(score_view_one, score_view_two)
                allFunctions.ViewReplacementDouble(score_view_one,score_view_two,strike_view_one)
                allFunctions.strikePointViewOne(result_view_one, strike)
                allFunctions.currentScore(current_score_value,result_view_one)
            }

            else if (score_view_one.text.isNotEmpty() && score_view_two.text.isEmpty()) {

                allFunctions.dummyIntSingle(score_view_two)
                allFunctions.ViewReplacementSingle(score_view_two, strike_view_two)
                allFunctions.sparePointViewOne(score_view_one,spare,result_view_one)
                allFunctions.currentScore(current_score_value,result_view_one)
                strike_view_two.text = "/"
            }

            else if (score_view_two.text.isNotEmpty() && score_view_three.text.isEmpty()) {

                allFunctions.dummyIntDouble(score_view_three, score_view_four)
                allFunctions.ViewReplacementDouble(score_view_three,score_view_four, strike_view_three)
                allFunctions.strikePointViewTwo(result_view_two,strike, result_view_one)
                allFunctions.currentScore(current_score_value,result_view_two)
            }

            else if (score_view_three.text.isNotEmpty() && score_view_four.text.isEmpty()) {

                allFunctions.dummyIntSingle(score_view_four)
                allFunctions.ViewReplacementSingle(score_view_four,strike_view_four)
                allFunctions.sparePointViewTwo(score_view_three,spare,result_view_two,result_view_one)
                allFunctions.currentScore(current_score_value,result_view_two)
                strike_view_four.text = "/"

            }

            else if (score_view_four.text.isNotEmpty() && score_view_five.text.isEmpty()) {

                allFunctions.dummyIntDouble(score_view_five, score_view_six)
                allFunctions.ViewReplacementDouble(score_view_five,score_view_six,strike_view_five)
                allFunctions.strikePointViewThree(result_view_three,strike,result_view_two)
                allFunctions.currentScoreWithHighScore(current_score_value,result_view_three,high_score_value)
            }

            else if (score_view_five.text.isNotEmpty() && score_view_six.text.isEmpty()) {

                allFunctions.dummyIntSingle(score_view_six)
                allFunctions.ViewReplacementSingle(score_view_six,strike_view_six)
                allFunctions.sparePointViewThree(score_view_five,spare,result_view_three,result_view_two)
                allFunctions.currentScoreWithHighScore(current_score_value,result_view_three,high_score_value)
                strike_view_six.text = "/"
            }
        }
    }
}

