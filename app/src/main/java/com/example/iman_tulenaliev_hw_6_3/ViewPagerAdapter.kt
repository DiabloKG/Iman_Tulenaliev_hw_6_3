package com.example.iman_tulenaliev_hw_6_3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.iman_tulenaliev_hw_6_3.fragments.FirstFragment
import com.example.iman_tulenaliev_hw_6_3.fragments.SecondFragment
import com.example.iman_tulenaliev_hw_6_3.fragments.ThirdFragment

class ViewPagerAdapter(activity: FragmentActivity?) : FragmentStateAdapter(activity!!) {

    private val fragmentList = arrayListOf(FirstFragment(), SecondFragment(), ThirdFragment())

    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}