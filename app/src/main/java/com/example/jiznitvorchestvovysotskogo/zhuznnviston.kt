package com.example.jiznitvorchestvovysotskogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class zhuznnviston : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zhuznnviston)
    }

    fun clickOnNext(view: View) {
        val nextActivity:Intent=Intent(this@zhuznnviston,tvorvysot::class.java)
        startActivity(nextActivity)
    }
}