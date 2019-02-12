package com.example.getaccepttest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
    private val scoreFullPoint = 20
    private val scoreHalfPoint = 10
    private val nullNumber     = 0


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
               calculation(i)
            }
        }
    }

    private fun calculation(num:Int) {

        if (score_view_one.text.isEmpty()) {

            score_view_one.text = "$num"
        }

        else if (score_view_two.text.isEmpty()) {

           score_view_two.text = "$num"

           sumOfTheScores(scoreInputOne = score_view_one.text.toString().toInt(),
                scoreInputTwo = score_view_two.text.toString().toInt())
        }

        else if (score_view_three.text.isEmpty()) {

          score_view_three.text = "$num"
        }

        else if (score_view_four.text.isEmpty()) {

            score_view_four.text = "$num"

            sumOfTheScores(scoreInputOne = score_view_three.text.toString().toInt(),
                scoreInputTwo = score_view_four.text.toString().toInt())
        }

        else if (score_view_five.text.isEmpty()) {

            score_view_five.text = "$num"
        }

        else if (score_view_six.text.isEmpty()) {

            score_view_six.text = "$num"

            sumOfTheScores(scoreInputOne = score_view_five.text.toString().toInt(),
                scoreInputTwo = score_view_six.text.toString().toInt())

            high_score_value.text = current_score_value.text
        }
    }

    private fun sumOfTheScores(scoreInputOne: Int, scoreInputTwo: Int){

        val result = scoreInputOne + scoreInputTwo

        if (result_view_one.text.isEmpty()) {

            result_view_one.text = result.toString()
            current_score_value.text = result_view_one.text
        }

        else if (result_view_two.text.isEmpty()) {

            val secondResult = result_view_one.text.toString().toInt() + result

            result_view_two.text = secondResult.toString()
            current_score_value.text = result_view_two.text
        }

        else {

            val thirdResult = result_view_two.text.toString().toInt() + result

            result_view_three.text = thirdResult.toString()
            current_score_value.text = result_view_three.text
        }
    }

    private  fun strike_And_Spare_Result() {

        strike_button.setOnClickListener {
            
            if (score_view_one.text.isEmpty() && score_view_two.text.isEmpty()) {

                score_view_one.text        = nullNumber.toString()
                score_view_two.text        = nullNumber.toString()
                score_view_one.visibility  = View.GONE
                score_view_two.visibility  = View.GONE
                strike_view_one.visibility = View.VISIBLE

                result_view_one.text       = "$scoreFullPoint"
                current_score_value.text   = result_view_one.text
            }

            else if (score_view_one.text.isNotEmpty() && score_view_two.text.isEmpty()) {

                score_view_two.text        = nullNumber.toString()
                score_view_two.visibility  = View.GONE
                strike_view_two.visibility = View.VISIBLE
                strike_view_two.text       = "/"

                result_view_one.text       = (score_view_one.text.toString().toInt() + scoreHalfPoint).toString()
                current_score_value.text   = result_view_one.text
            }

            else if (score_view_two.text.isNotEmpty() && score_view_three.text.isEmpty()) {

                score_view_three.text        = nullNumber.toString()
                score_view_four.text         = nullNumber.toString()
                score_view_three.visibility  = View.GONE
                score_view_four.visibility   = View.GONE
                strike_view_three.visibility = View.VISIBLE

                result_view_two.text = ((result_view_one.text.toString().toInt() + scoreFullPoint).toString())
                current_score_value.text = result_view_two.text

            }

            else if (score_view_three.text.isNotEmpty() && score_view_four.text.isEmpty()) {

                score_view_four.text        = nullNumber.toString()
                score_view_four.visibility  = View.GONE
                strike_view_four.visibility = View.VISIBLE
                strike_view_four.text       = "/"

                result_view_two.text = ((result_view_one.text.toString().toInt() +
                        score_view_three.text.toString().toInt() + scoreHalfPoint).toString())

                current_score_value.text = result_view_two.text
            }

            else if (score_view_four.text.isNotEmpty() && score_view_five.text.isEmpty()) {

                score_view_five.text        = nullNumber.toString()
                score_view_six.text         = nullNumber.toString()
                score_view_five.visibility  = View.GONE
                score_view_six.visibility   = View.GONE
                strike_view_five.visibility = View.VISIBLE

                result_view_three.text = ((result_view_two.text.toString().toInt() + scoreFullPoint).toString())

                current_score_value.text = result_view_three.text
                high_score_value.text = result_view_three.text
            }

            else if (score_view_five.text.isNotEmpty() && score_view_six.text.isEmpty()) {

                score_view_six.text        = nullNumber.toString()
                score_view_six.visibility  = View.GONE
                strike_view_six.visibility = View.VISIBLE
                strike_view_six.text       = "/"

                result_view_three.text = ((result_view_two.text.toString().toInt()
                        + score_view_five.text.toString().toInt() + scoreHalfPoint).toString())

                current_score_value.text = result_view_three.text
                high_score_value.text = result_view_three.text
            }
        }
    }
}

