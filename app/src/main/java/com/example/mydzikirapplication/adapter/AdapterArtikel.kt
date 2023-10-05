package com.example.mydzikirapplication.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mydzikirapplication.databinding.FragmentArtikelBinding
import com.example.mydzikirapplication.databinding.RowItemDzikirDoaBinding
import com.example.mydzikirapplication.model.ModelArtikel
import com.example.mydzikirapplication.ui.detail.DetailArtikelActivity

class AdapterArtikel(private val listArtikel: ArrayList<ModelArtikel>) : RecyclerView.Adapter<AdapterArtikel.MyViewHolder>(){
    class MyViewHolder(val binding: FragmentArtikelBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = FragmentArtikelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = listArtikel.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = listArtikel[position]
        Glide.with(holder.itemView.context).load(data.image).into(holder.binding.imgFragment)

        holder.binding.imgFragment.setOnClickListener {
            val intentDetail = Intent(holder.itemView.context, DetailArtikelActivity::class.java)
            holder.itemView.context.startActivity(intentDetail)
        }
    }
}