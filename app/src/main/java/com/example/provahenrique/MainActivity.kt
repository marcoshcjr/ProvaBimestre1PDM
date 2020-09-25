package com.example.provahenrique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mudarParaPrincipal()
    }

    private fun mudarParaPrincipal() {
        val intent = Intent(this, TelaPrincipal::class.java)

        Handler().postDelayed({
            intent.change()
        }, 4500)
    }

    fun Intent.change() {
        startActivity(this)
        finish()
    }
}