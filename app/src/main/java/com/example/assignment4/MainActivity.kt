package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            var num1 = editTextNumberDecimal3.text.toString()
            var num2 = editTextNumberDecimal4.text.toString()
            if (num1 == "" || num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "+"
            textView7.text = (num1.toDouble() + num2.toDouble()).toString()
        }

        btn2.setOnClickListener {
            var num1 = editTextNumberDecimal3.text.toString()
            var num2 = editTextNumberDecimal4.text.toString()
            if (num1 == ""||num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "-"
            textView7.text = (num1.toDouble() - num2.toDouble()).toString()
        }

        btn3.setOnClickListener {
            var num1 = editTextNumberDecimal3.text.toString()
            var num2 = editTextNumberDecimal4.text.toString()
            if (num1 == ""||num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            textView4.text = "*"
            textView7.text = (num1.toDouble() * num2.toDouble()).toString()
        }

        btn4.setOnClickListener {
            var num1 = editTextNumberDecimal3.text.toString()
            var num2 = editTextNumberDecimal4.text.toString()
            if (num1 == ""||num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            if (num2 == "0"||num2 =="")
                return@setOnClickListener Toast.makeText(this@MainActivity, "Do Not Num2 is Zero or Null", Toast.LENGTH_SHORT).show()
            textView4.text = "/"
            textView7.text = (num1.toDouble() / num2.toDouble()).toString()
        }

        btn5.setOnClickListener {
            var num1 = editTextNumberDecimal3.text.toString()
            var num2 = editTextNumberDecimal4.text.toString()
            if (num1 == ""||num2 == "")
                return@setOnClickListener Toast.makeText(this@MainActivity, "Plase Input Num1 and Num2", Toast.LENGTH_SHORT).show()
            if (num2 == "0"||num2 =="")
                return@setOnClickListener Toast.makeText(this@MainActivity, "Do Not Num2 is Zero or Null", Toast.LENGTH_SHORT).show()
            textView4.text = "%"
            textView7.text = (num1.toDouble() % num2.toDouble()).toString()
        }

        btn6.setOnClickListener {
            editTextNumberDecimal3.text.clear()
            editTextNumberDecimal4.text.clear()
            textView7.text = ""
        }
    }
}