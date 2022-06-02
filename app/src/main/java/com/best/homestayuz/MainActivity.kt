package com.best.homestayuz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView
import com.best.homestayuz.Activities.RentPage


class MainActivity : AppCompatActivity() {

    lateinit var lottieAnimator1: LottieAnimationView
    lateinit var lottieAnimator2: LottieAnimationView
    lateinit var lottieAnimator3: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendToRentsPage()
        sendToAddsPage()
        sendToHomesPage()
    }


    private fun sendToRentsPage() {
        lottieAnimator1 = findViewById(R.id.Rents_id)

        lottieAnimator1.setOnClickListener {
            val intent = Intent(this, RentPage::class.java)
            startActivity(intent)
        }

    }

    private fun sendToAddsPage() {
        lottieAnimator2 = findViewById(R.id.Adds_id)
        lottieAnimator2.setOnClickListener {
            val intent = Intent(this, RentPage::class.java)
            startActivity(intent)
        }
    }

    private fun sendToHomesPage() {
        lottieAnimator3 = findViewById(R.id.Homes_id)
        lottieAnimator3.setOnClickListener {
            val intent = Intent(this, RentPage::class.java)
            startActivity(intent)
        }
    }


}