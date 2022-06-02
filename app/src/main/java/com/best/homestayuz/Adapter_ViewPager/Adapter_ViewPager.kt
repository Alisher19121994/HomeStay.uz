package com.best.homestayuz.Adapter_ViewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter_ViewPager(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private val listFragment = ArrayList<Fragment>()
    private val listStringTitles = ArrayList<String>()

    fun pagerLists(fragment: Fragment, string: String) {
        listFragment.add(fragment)
        listStringTitles.add(string)
    }

    override fun getCount(): Int {
        return listFragment.size
    }

    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return listStringTitles[position]
    }
}