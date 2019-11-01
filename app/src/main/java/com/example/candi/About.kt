package com.example.candi

import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (supportActionBar as ActionBar).title = "About"
        (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.about)
    }
}