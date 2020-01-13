package com.android.tabnavigation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class PagerAdapter constructor(fm: FragmentManager, val numbOfTabs: Int) :
    FragmentStatePagerAdapter(
        fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ProfileFragment()
            1 ->  MessageFragment()
            2 ->  ChatFragment()
            else -> ProfileFragment()
        }

    }

    override fun getCount(): Int = numbOfTabs
}