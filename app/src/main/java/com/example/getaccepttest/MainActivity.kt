package com.example.getaccepttest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        allNumberButtons()

        restart_button.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            finish()
            startActivity(intent)
        }
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

            sumOfTheScores(inputOne = score_view_one.text.toString().toInt(),
                inputTwo = score_view_two.text.toString().toInt())
        }
        else if (score_view_three.text.isEmpty()) {

          score_view_three.text = "$viewThree"
        }
        else if (score_view_four.text.isEmpty()) {

            score_view_four.text = "$viewFour"

             sumOfTheScores(inputOne = score_view_three.text.toString().toInt(),
                inputTwo = score_view_four.text.toString().toInt())
        }
        else if (score_view_five.text.isEmpty()) {

            score_view_five.text = "$viewFive"
        }
        else if (score_view_six.text.isEmpty()) {

            score_view_six.text = "$viewSix"

            sumOfTheScores(inputOne = score_view_five.text.toString().toInt(),
                inputTwo = score_view_six.text.toString().toInt())

            high_score_value.text = current_score_value.text
        }
    }

    private fun sumOfTheScores(inputOne: Int, inputTwo: Int){

        val result = inputOne + inputTwo

        if (result_of_view_one.text.isEmpty()) {

            result_of_view_one.text = result.toString()
            current_score_value.text = result_of_view_one.text
        }
        else if (result_view_two.text.isEmpty()) {

            val secondResult = result_of_view_one.text.toString().toInt() + result
            result_view_two.text = secondResult.toString()
            current_score_value.text = result_view_two.text
        }
        else  {

            val thirdResult = result_view_two.text.toString().toInt() + result
            result_view_three.text = thirdResult.toString()
            current_score_value.text = result_view_three.text
        }
    }
} // Class

