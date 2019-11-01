package com.example.candi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var RvCandi: RecyclerView
    private var list: ArrayList<Candi> = arrayListOf()
    private var title: String = "Candi"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RvCandi = findViewById(R.id.candi)
        RvCandi.setHasFixedSize(true)
        list.addAll(CandiData.listData)
        showCandiList()
        setActionBar(title)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showCandiList(){
        RvCandi.layoutManager = LinearLayoutManager(this)
        val listCandiAdapter = ListCandiAdapter(list)
        RvCandi.adapter = listCandiAdapter

        listCandiAdapter.setOnClickCallBack(object : ListCandiAdapter.OnItemCallBack {
            override fun onItemClicked(data: Candi) {
                showSelected(data)
            }
        })
    }

    private fun setActionBar(title: String) {
        if (supportActionBar!=null){
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun showSelected(candi: Candi){
        Toast.makeText(this, "Selamat Datang di "+ candi.name,
            Toast.LENGTH_SHORT).show()
    }

    private fun setMenu(selected: Int){
        when(selected){
            R.id.me ->{
                val movedata = Intent(this@MainActivity, About::class.java)
                startActivity(movedata)
            }
        }
    }
}
