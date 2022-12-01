package com.example.jiznitvorchestvovysotskogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun biog(view: View) {

        val intent: Intent = Intent(this@MainActivity, zhiznvysotskogo::class.java)
        startActivity(intent)

    }
}