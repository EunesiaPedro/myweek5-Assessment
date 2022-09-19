package com.tech4dev.netflixapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPageAdapter(fm: FragmentManager, lf: Lifecycle): FragmentStateAdapter(fm, lf) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
       return when (position) {
            0 -> TVshowFragment()
            1 -> MoviesFragment()
            2 -> CategoriesFragment()
            else -> TVshowFragment()

        }
    }
}