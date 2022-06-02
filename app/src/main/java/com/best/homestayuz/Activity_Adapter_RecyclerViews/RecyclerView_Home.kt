package com.best.homestayuz.Activity_Adapter_RecyclerViews

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.best.homestayuz.Activities.AddsPage
import com.best.homestayuz.Activities.FragmentPage
import com.best.homestayuz.Activities.RentPage
import com.best.homestayuz.MainActivity
import com.best.homestayuz.Models.Home
import com.best.homestayuz.R

class RecyclerView_Home(var context: Context? = null, var list: ArrayList<Home>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.home_view_buttons, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val lists = list[position]

        if (holder is MyViews) {
            holder.textView1.text = lists.rents
            holder.textView2.text = lists.adds
            holder.textView3.text = lists.bills
            holder.textView3.setOnClickListener {
                val intent = Intent(context, RentPage::class.java)
                context?.startActivity(intent)
            }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViews(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView1 = itemView.findViewById<TextView>(R.id.home_view_1_id)
        val textView2 = itemView.findViewById<TextView>(R.id.home_view_2_id)
        val textView3 = itemView.findViewById<TextView>(R.id.home_view_3_id)

    }

}