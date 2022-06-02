package com.best.homestayuz.Activity_Adapter_RecyclerViews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.best.homestayuz.Models.Rents
import com.best.homestayuz.R

class AdapterRents(var list: ArrayList<Rents>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_rents, parent, false)
        return MyViews(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val rents = list[position]
        if (holder is MyViews) {
            holder.image.setImageResource(rents.image)
            holder.price.text = rents.price
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViews(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.rent_image_id)
        val price = itemView.findViewById<TextView>(R.id.rent_price_ID)
    }
}