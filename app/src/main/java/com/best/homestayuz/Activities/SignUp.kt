package com.best.homestayuz.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.best.homestayuz.R

class SignUp : AppCompatActivity() {
    lateinit var fullname: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var confirmPassword: EditText
    lateinit var button: TextView
    lateinit var textViewSignIn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        signUp()
    }

    private fun signUp() {
        fullname = findViewById(R.id.edit_text_fullname_id)
        email = findViewById(R.id.edit_text_email_id)
        password = findViewById(R.id.edit_text_password_id)
        confirmPassword = findViewById(R.id.edit_text_confirm_password_id)

        button = findViewById(R.id.edit_text_button_id)
        button.setOnClickListener {
            finish()
        }
        textViewSignIn = findViewById(R.id.sign_in)
        textViewSignIn.setOnClickListener {
            finish()
        }
    }

}