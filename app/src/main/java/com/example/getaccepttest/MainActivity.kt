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
            result_of_view_one_and_two.text = (viewOne + viewTwo).toString()
            current_score_value.text = result_of_view_one_and_two.text
        }
        else if (score_view_three.text.isEmpty()) {

          score_view_three.text = "$viewThree"

        }
        else if (score_view_four.text.isEmpty()) {

            score_view_four.text = "$viewFour"
            result_view_of_three_and_four.text = (viewOne + viewTwo + viewThree + viewFour).toString()
            current_score_value.text = result_view_of_three_and_four.text

        }
        else if (score_view_five.text.isEmpty()) {

            score_view_five.text = "$viewFive"
        }
        else if (score_view_six.text.isEmpty()) {

            score_view_six.text = "$viewSix"
            result_of_view_five_and_six.text = (viewOne + viewTwo + viewThree + viewFour + viewFive + viewSix).toString()
            current_score_value.text = result_of_view_five_and_six.text
            high_score_value.text = current_score_value.text
        }
    }

} // Class
