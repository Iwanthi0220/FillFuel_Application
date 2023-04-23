package com.example.fillfuel_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PendingAdapter (private val pendingList: ArrayList<Pending>)
    : RecyclerView.Adapter<PendingAdapter.PendingViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ):

            PendingAdapter.PendingViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.pending_items,
        parent,false)

        return PendingViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PendingAdapter.PendingViewHolder, position: Int) {
        val currentItem = pendingList[position]
        holder.vehicleType.text = currentItem.vehicleType
        holder.vehicleNumber.text = currentItem.vehicleNumber
        holder.fuelType.text = currentItem.fuelType
        holder.fuelQuantity.text = currentItem.fuelQuantity
        holder.location.text = currentItem.location

    }

    override fun getItemCount(): Int {
        return pendingList.size
    }

    class PendingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val vehicleType: TextView = itemView.findViewById(R.id.pvehicleType)
        val vehicleNumber: TextView = itemView.findViewById(R.id.pvehicleNumber)
        val fuelType: TextView = itemView.findViewById(R.id.pfuelType)
        val fuelQuantity: TextView = itemView.findViewById(R.id.pfuelQuantity)
        val location: TextView = itemView.findViewById(R.id.plocation)
    }
}