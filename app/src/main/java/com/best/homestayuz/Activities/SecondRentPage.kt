package com.best.homestayuz.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.best.homestayuz.R

class SecondRentPage : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var imageView: ImageView
    private var TAG = SecondRentPage::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_rent_page)
        getData()
    }

    private fun getData() {
        textView = findViewById(R.id.second_rent_price_ID)
        imageView = findViewById(R.id.second_rent_image_id)

        val intent = intent.getSerializableExtra("rents")
        Log.d(TAG, intent.toString())
        textView.text = intent.toString()
        imageView.setImageResource(intent as Int)
    }
}