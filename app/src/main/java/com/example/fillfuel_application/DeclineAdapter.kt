package com.example.fillfuel_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DeclineAdapter(private val declineList: ArrayList<Decline>)
    : RecyclerView.Adapter<DeclineAdapter.DeclineViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeclineViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.decline_item,
            parent,false)
        return  DeclineViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DeclineViewHolder, position: Int) {
        val currentItem =declineList[position]
        holder.vehicleType.text=currentItem.vehicleType
        holder.vehicleNumber.text= currentItem.vehicleNumber
        holder.fuelType.text=currentItem.fuelType
        holder.fuelQuantity.text=currentItem.fuelQuantity
        holder.location.text=currentItem.location

    }

    override fun getItemCount(): Int {
        return declineList.size
    }
    class DeclineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val vehicleType: TextView =itemView.findViewById(R.id.devehicleType)
        val vehicleNumber: TextView =itemView.findViewById(R.id.devehicleNumber)
        val fuelType: TextView =itemView.findViewById(R.id.defuelType)
        val fuelQuantity: TextView =itemView.findViewById(R.id.defuelQuantity)
        val location: TextView =itemView.findViewById(R.id.delocation)

    }
}