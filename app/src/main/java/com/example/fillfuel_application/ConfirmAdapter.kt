package com.example.fillfuel_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ConfirmAdapter(private val confirmList: ArrayList<Confirm>)
    : RecyclerView.Adapter<ConfirmAdapter.ConfirmViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConfirmViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.confirm_item,
        parent,false)
        return  ConfirmViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ConfirmViewHolder, position: Int) {
        val currentItem =confirmList[position]
        holder.vehicleType.text=currentItem.vehicleType
        holder.vehicleNumber.text= currentItem.vehicleNumber
        holder.fuelType.text=currentItem.fuelType
        holder.fuelQuantity.text=currentItem.fuelQuantity
        holder.location.text=currentItem.location

    }

    override fun getItemCount(): Int {
        return confirmList.size
    }
    class ConfirmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val vehicleType:TextView=itemView.findViewById(R.id.tvvehicleType)
        val vehicleNumber:TextView=itemView.findViewById(R.id.tvvehicleNumber)
        val fuelType:TextView=itemView.findViewById(R.id.tvfuelType)
        val fuelQuantity:TextView=itemView.findViewById(R.id.tvfuelQuantity)
        val location:TextView=itemView.findViewById(R.id.tvlocation)

    }
}