package com.example.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerapp.adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // definindo viewPager
        viewPager = findViewById(R.id.viewPager)

        // definindo o adaptador passando como parametro nossa activity
        myAdapter = MyAdapter(this)

        // definindo orientacao de troca de fragments
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        // definindo myAdapter como adaptador da nossa viewPager
        viewPager.adapter = myAdapter
    }
}