package com.example.mydzikirapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mydzikirapplication.databinding.RowItemDzikirDoaBinding
import com.example.mydzikirapplication.model.DoaDzikirModel
import com.example.mydzikirapplication.model.DzikirDoaData

class AdapterDoaDzikir (private val listDoa: ArrayList<DoaDzikirModel>):
    RecyclerView.Adapter<AdapterDoaDzikir.MyViewHolder>() {
    class MyViewHolder(val binding:RowItemDzikirDoaBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterDoaDzikir.MyViewHolder {
        val bindingDoaDzikir = RowItemDzikirDoaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(bindingDoaDzikir)
    }

    override fun onBindViewHolder(holder: AdapterDoaDzikir.MyViewHolder, position: Int) {
        val dataDoaDzikir = listDoa[position]

        holder.binding.apply {
            tvDesc.text = dataDoaDzikir.desc
            tvLafaz.text = dataDoaDzikir.lafaz
            tvTerjemah.text = dataDoaDzikir.terjemah
        }
    }

    override fun getItemCount(): Int = listDoa.size
}