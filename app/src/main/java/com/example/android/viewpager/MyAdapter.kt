package com.example.android.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

class MyAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int) =
        when(position) {
            0 -> Tab1()
            1 -> Tab2()
            2 -> Tab3()
            else -> Tab1()
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