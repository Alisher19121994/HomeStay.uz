package com.best.homestayuz.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.best.homestayuz.MainActivity
import com.best.homestayuz.R

class SignIn : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var button: TextView
    lateinit var textViewSignUp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        signIn()
    }

    private fun signIn() {
        email = findViewById(R.id.edit_text_email_id)
        password = findViewById(R.id.edit_text_password_id)
        button = findViewById(R.id.edit_text_button_id)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        textViewSignUp = findViewById(R.id.sign_up)
        textViewSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }


    }
}