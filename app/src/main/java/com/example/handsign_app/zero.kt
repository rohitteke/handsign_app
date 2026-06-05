package com.example.handsign_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class zero : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zero)

        val img = findViewById<ImageView>(R.id.imageView)
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {

            img.setImageResource(R.drawable.img1)
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {

            img.setImageResource(R.drawable.img2)
        }
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {

            img.setImageResource(R.drawable.img3)
        }
        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {

            img.setImageResource(R.drawable.img4)
        }
        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {

            img.setImageResource(R.drawable.img5)
        }
        val btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {

            img.setImageResource(R.drawable.img6)
        }
        val btn7 = findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {

            img.setImageResource(R.drawable.img7)
        }
        val btn8 = findViewById<Button>(R.id.btn8)
        btn8.setOnClickListener {

            img.setImageResource(R.drawable.img8)
        }
        val btn9 = findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener {

            img.setImageResource(R.drawable.img9)
        }

    }
}