package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicatdion.ItemRental
import com.example.myapplication.databinding.RentalItemBinding

class AdapterRental(private val dataList: List<ItemRental>) :
    RecyclerView.Adapter<AdapterRental.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            RentalItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class MyViewHolder(private val binding: RentalItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ItemRental) {
            binding.tvNameRental.text = item.name
            binding.tvNoHp.text = item.no_hp
            binding.tvAlamat.text = item.alamat
        }
    }
}
