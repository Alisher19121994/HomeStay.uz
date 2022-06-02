package com.best.homestayuz.Fragment_Adapter_RecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.best.homestayuz.R

class Page_2_RecyclerView(var list: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_page_2_recyclerview, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val lists = list[position]
        if (holder is MyViews) {
            holder.text.text = lists
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViews(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var text = itemView.findViewById<TextView>(R.id.page_2_text_id)
    }
}