package com.tech4dev.netflixapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tab)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = MainPageAdapter(supportFragmentManager,lifecycle)

        TabLayoutMediator(tabLayout, viewPager) { tab, position->
            when(position){
                0 -> tab.text = "TVshow"
                1 -> tab.text = "Movies"
                2 -> tab.text = "Categories"

            }

        }.attach()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}

