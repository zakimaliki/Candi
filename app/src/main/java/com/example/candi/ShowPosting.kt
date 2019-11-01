package com.example.candi

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ShowPosting : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_item)
        (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        getIntentItem()
    }

    @SuppressLint("ResourceType")
    private fun getIntentItem(){
        val img = intent.getIntExtra("get_photo",0)
        val name = intent.getStringExtra("get_name")
        val detail = intent.getStringExtra("get_detail")
        val jdl: TextView = findViewById(R.id.post_name)
        val dtl: TextView = findViewById(R.id.post_detail)
        val imgP: ImageView = findViewById(R.id.img_candi)
        jdl.text = name
        dtl.text = detail
        Glide.with(this)
            .load(img)
            .into(imgP)
        if (supportActionBar!=null){
            (supportActionBar as ActionBar).title = name
        }
    }
}