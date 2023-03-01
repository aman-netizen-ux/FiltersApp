package com.example.filtersapp

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var oneiv: ImageView
    lateinit var twoiv : ImageView
    lateinit var threeiv : ImageView
    lateinit var fouriv : ImageView
    lateinit var fiveiv : ImageView
    lateinit var sixiv : ImageView
    lateinit var seveniv : ImageView
    lateinit var eightiv : ImageView
    lateinit var nineiv : ImageView
    lateinit var teniv : ImageView
    lateinit var originaliv : ImageView

    lateinit var bmp : Bitmap
    lateinit var onebmp : Bitmap
    lateinit var twobmp : Bitmap
    lateinit var threebmp : Bitmap
    lateinit var fourbmp :Bitmap
    lateinit var fivebmp :Bitmap
    lateinit var sixbmp :Bitmap
    lateinit var sevenbmp :Bitmap
    lateinit var eightbmp :Bitmap
    lateinit var ninebmp :Bitmap
    lateinit var tenbmp :Bitmap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}