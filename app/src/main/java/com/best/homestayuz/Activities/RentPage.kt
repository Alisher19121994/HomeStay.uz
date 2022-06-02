package com.best.homestayuz.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.best.homestayuz.Activity_Adapter_RecyclerViews.AdapterRents
import com.best.homestayuz.Models.Rents
import com.best.homestayuz.R
import kotlinx.android.synthetic.main.activity_rent_page.*

class RentPage : AppCompatActivity() {
    private var adapters: AdapterRents? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent_page)
        openRentPage()
    }

    private fun openRentPage() {
        rent_recyclerview_id.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val list = ArrayList<Rents>()
        list.add(Rents(R.drawable.home_1, "Price: 25000"))
        list.add(Rents(R.drawable.home_2, "Price: 200065"))
        list.add(Rents(R.drawable.home_3, "Price: 25500"))
        list.add(Rents(R.drawable.home_4, "Price: 29000"))
        list.add(Rents(R.drawable.home_5, "Price: 25600"))
        list.add(Rents(R.drawable.home_6, "Price: 25890"))
        list.add(Rents(R.drawable.home_7, "Price: 9665"))
        list.add(Rents(R.drawable.home_8, "Price: 33696"))
        list.add(Rents(R.drawable.home_9, "Price: 98745"))
        list.add(Rents(R.drawable.home_10, "Price: 321475"))
        adapters = AdapterRents(list)
        rent_recyclerview_id.adapter = adapters
        rent_recyclerview_id.setOnClickListener {
            val list = ArrayList<Rents>()
            list.add(Rents(R.drawable.home_1, "Price: 25000"))
            list.add(Rents(R.drawable.home_2, "Price: 200065"))
            list.add(Rents(R.drawable.home_3, "Price: 25500"))
            list.add(Rents(R.drawable.home_4, "Price: 29000"))
            list.add(Rents(R.drawable.home_5, "Price: 25600"))
            list.add(Rents(R.drawable.home_6, "Price: 25890"))
            list.add(Rents(R.drawable.home_7, "Price: 9665"))
            list.add(Rents(R.drawable.home_8, "Price: 33696"))
            list.add(Rents(R.drawable.home_9, "Price: 98745"))
            list.add(Rents(R.drawable.home_10, "Price: 321475"))
            sendToPage(list)
        }
    }

    private fun sendToPage(rents: ArrayList<Rents>) {
        val intent = Intent(this, SecondRentPage::class.java)
        intent.putExtra("rents", rents)
        startActivity(intent)
    }
}