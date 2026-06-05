package com.example.handsign_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class a_z : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_az)

        val img = findViewById<ImageView>(R.id.imageView)
        val btna = findViewById<Button>(R.id.btna)
        btna.setOnClickListener {

            img.setImageResource(R.drawable.imagea)
        }
        val btnb = findViewById<Button>(R.id.btnb)
        btnb.setOnClickListener {

            img.setImageResource(R.drawable.imageb)
        }
        val btnc = findViewById<Button>(R.id.btnc)
        btnc.setOnClickListener {

            img.setImageResource(R.drawable.imagec)
        }
        val btnd = findViewById<Button>(R.id.btnd)
        btnd.setOnClickListener {

            img.setImageResource(R.drawable.imaged)
        }
        val btne = findViewById<Button>(R.id.btne)
        btne.setOnClickListener {

            img.setImageResource(R.drawable.imgaee)
        }
        val btnf = findViewById<Button>(R.id.btnf)
        btnf.setOnClickListener {

            img.setImageResource(R.drawable.imagef)
        }
        val btng = findViewById<Button>(R.id.btng)
        btng.setOnClickListener {

            img.setImageResource(R.drawable.imageg)
        }
        val btnh = findViewById<Button>(R.id.btnh)
        btnh.setOnClickListener {

            img.setImageResource(R.drawable.imageh)
        }
        val btni = findViewById<Button>(R.id.btni)
        btni.setOnClickListener {

            img.setImageResource(R.drawable.imagei)
        }
        val btnj = findViewById<Button>(R.id.btnj)
        btnj.setOnClickListener {

            img.setImageResource(R.drawable.imagej)
        }
        val btnk = findViewById<Button>(R.id.btnk)
        btnk.setOnClickListener {

            img.setImageResource(R.drawable.imagek)
        }
        val btnl = findViewById<Button>(R.id.btnl)
        btnl.setOnClickListener {

            img.setImageResource(R.drawable.imagel)
        }
        val btnm = findViewById<Button>(R.id.btnm)
        btnm.setOnClickListener {

            img.setImageResource(R.drawable.imagem)
        }
        val btnn = findViewById<Button>(R.id.btnn)
        btnn.setOnClickListener {

            img.setImageResource(R.drawable.imagen)
        }
        val btno = findViewById<Button>(R.id.btno)
        btno.setOnClickListener {

            img.setImageResource(R.drawable.imageo)
        }
        val btnp = findViewById<Button>(R.id.btnp)
        btnp.setOnClickListener {

            img.setImageResource(R.drawable.imagep)
        }
        val btnq = findViewById<Button>(R.id.btnq)
        btnq.setOnClickListener {

            img.setImageResource(R.drawable.imageq)
        }
        val btnr = findViewById<Button>(R.id.btnr)
        btnr.setOnClickListener {

            img.setImageResource(R.drawable.imager)
        }
        val btns = findViewById<Button>(R.id.btns)
        btns.setOnClickListener {

            img.setImageResource(R.drawable.images)
        }
        val btnt = findViewById<Button>(R.id.btnt)
        btnt.setOnClickListener {

            img.setImageResource(R.drawable.imaget)
        }
        val btnu = findViewById<Button>(R.id.btnu)
        btnu.setOnClickListener {

            img.setImageResource(R.drawable.imageu)
        }
        val btnv = findViewById<Button>(R.id.btnv)
        btnv.setOnClickListener {

            img.setImageResource(R.drawable.imagev)
        }
        val btnw = findViewById<Button>(R.id.btnw)
        btnw.setOnClickListener {

            img.setImageResource(R.drawable.imagew)
        }
        val btnx = findViewById<Button>(R.id.btnx)
        btnx.setOnClickListener {

            img.setImageResource(R.drawable.imagex)
        }
        val btny = findViewById<Button>(R.id.btny)
        btny.setOnClickListener {

            img.setImageResource(R.drawable.imagey)
        }
        val btnz = findViewById<Button>(R.id.btnz)
        btnz.setOnClickListener {

            img.setImageResource(R.drawable.imagez)
        }
    }
}