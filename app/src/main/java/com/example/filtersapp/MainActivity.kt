package com.example.filtersapp

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.mukesh.image_processing.ImageProcessor

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

        val processor = ImageProcessor();
        bmp = BitmapFactory.decodeResource(resources, R.drawable.testimage);

        oneiv = findViewById(R.id.iv1);
        twoiv = findViewById(R.id.iv2);
        threeiv = findViewById(R.id.iv3);
        fouriv = findViewById(R.id.iv4);
        fiveiv = findViewById(R.id.iv5);
        sixiv = findViewById(R.id.iv6);
        seveniv = findViewById(R.id.iv7);
        eightiv = findViewById(R.id.iv8);
        nineiv = findViewById(R.id.iv9);
        teniv = findViewById(R.id.iv10);
        originaliv = findViewById(R.id.ivOriginal);

        onebmp=processor.tintImage(bmp,90);
        oneiv.setImageBitmap(onebmp);

        twobmp = processor.applyGaussianBlur(bmp);
        twoiv.setImageBitmap(twobmp);

        threebmp = processor.createSepiaToningEffect(bmp,1, 2.0, 1.0, 5.0);
        threeiv.setImageBitmap(threebmp);

        fourbmp = processor.applySaturationFilter(bmp,3);
        fouriv.setImageBitmap(fourbmp);

        fivebmp = processor.applySnowEffect(bmp);
        fiveiv.setImageBitmap(fivebmp);

        sixbmp = processor.doGreyScale(bmp);
        sixiv.setImageBitmap(sixbmp);

        sevenbmp = processor.engrave(bmp);
        seveniv.setImageBitmap(sevenbmp);

        eightbmp = processor.createContrast(bmp, 1.5);
        eightiv.setImageBitmap(eightbmp);

        ninebmp = processor.createShadow(bmp);
        nineiv.setImageBitmap(ninebmp);

        tenbmp = processor.applyFleaEffect(bmp);
        teniv.setImageBitmap(tenbmp);


        oneiv.setOnClickListener{
            originaliv.setImageBitmap(onebmp);
        }

        twoiv.setOnClickListener{
            originaliv.setImageBitmap(twobmp);
        }

        threeiv.setOnClickListener{
            originaliv.setImageBitmap(threebmp);
        }

        fouriv.setOnClickListener{
            originaliv.setImageBitmap(fourbmp);
        }

        fiveiv.setOnClickListener{
            originaliv.setImageBitmap(fivebmp);
        }

        sixiv.setOnClickListener{
            originaliv.setImageBitmap(sixbmp);
        }

        seveniv.setOnClickListener{
            originaliv.setImageBitmap(sevenbmp);
        }

        eightiv.setOnClickListener{
            originaliv.setImageBitmap(eightbmp);
        }

        nineiv.setOnClickListener{
            originaliv.setImageBitmap(ninebmp);
        }

        teniv.setOnClickListener{
            originaliv.setImageBitmap(tenbmp);
        }
    }
}