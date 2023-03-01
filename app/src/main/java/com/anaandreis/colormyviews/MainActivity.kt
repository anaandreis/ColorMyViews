package com.anaandreis.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    @SuppressLint("ResourceAsColor")
    fun makeColored(view: View) {


        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.image_one)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_six_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_seven_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_eight_text -> view.setBackgroundColor(Color.RED)
            R.id.box_nine_text-> view.setBackgroundColor(Color.RED)
            R.id.box_ten_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_eleven_text -> view.setBackgroundColor(Color.BLACK)
            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }

    fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)



        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, boxSixText, boxSevenText, boxEightText,
                boxNineText, boxTenText, boxElevenText, rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}