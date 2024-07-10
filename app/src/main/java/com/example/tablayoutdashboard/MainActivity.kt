package com.example.tablayoutdashboard

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var tabLayout : TabLayout
        var viewPager : ViewPager

        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewPager)

        var adapter : ViewPagerAdapter

        adapter=ViewPagerAdapter(supportFragmentManager)

        viewPager.adapter = adapter

        viewPager.

        tabLayout.setupWithViewPager(viewPager)
    }
}