package com.example.itcell

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate.setOnClickListener {
            var n1 = num1.text.toString().toInt()
            var n2 = num2.text.toString().toInt()
            var sum = n1+n2
            result.text=sum.toString()

        }

    }
}
