package com.best.homestayuz.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.best.homestayuz.Adapter_ViewPager.Adapter_ViewPager
import com.best.homestayuz.Fragments.*
import com.best.homestayuz.R
import com.google.android.material.tabs.TabLayout

class FragmentPage : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout
    lateinit var adapterViewpager: Adapter_ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_page)
        getAllData()
    }

    private fun getAllData() {
        viewPager = findViewById(R.id.veiwpager_id)
        tabLayout = findViewById(R.id.tablayout_id)
        adapterViewpager = Adapter_ViewPager(supportFragmentManager)
        adapterViewpager.pagerLists(Page_1(), "Home")
        adapterViewpager.pagerLists(Page_2(), "Electricity")
        adapterViewpager.pagerLists(Page_3(), "Gas")
        adapterViewpager.pagerLists(Page_4(), "Water")
        adapterViewpager.pagerLists(Page_5(), "Others")
        viewPager.adapter = adapterViewpager
        tabLayout.setupWithViewPager(viewPager)
    }
}