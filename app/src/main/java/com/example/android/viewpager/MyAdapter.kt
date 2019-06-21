package com.example.android.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MyAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {

    private val tab1Fragment = Tab1()
    private val tab2Fragment = Tab2()
    private val tab3Fragment = Tab3()

    override fun getItem(position: Int) =
        when(position) {
            0 -> tab1Fragment
            1 -> tab2Fragment
            2 -> tab3Fragment
            else -> tab1Fragment
        }

    override fun getCount() = 3

    override fun getPageTitle(position: Int) =
        when(position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            2 -> "Tab 3"
            else -> "Tab Doesn't Exist "
        }

}