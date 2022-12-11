package com.durand.appprojectfinalupc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var button_login: Button
    private lateinit var button_sign_up: Button
    private lateinit var edit_username_input: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button_sign_up = findViewById(R.id.button_sign_up)
        button_login = findViewById(R.id.button_login)
        edit_username_input = findViewById(R.id.edit_username_input)

        button_login.setOnClickListener {
            when {
                edit_username_input.text.toString() == "74894179" -> {
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        button_sign_up.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}