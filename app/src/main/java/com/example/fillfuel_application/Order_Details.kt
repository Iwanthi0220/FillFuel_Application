package com.example.fillfuel_application

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Order_Details : AppCompatActivity() {
    private lateinit var confirm_button:Button
    private lateinit var decline_button:Button

    private lateinit var  builder:AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)

        confirm_button=findViewById(R.id.con_btn)

builder=AlertDialog.Builder(this)
        confirm_button.setOnClickListener{
            builder.setTitle("Alert!")
                .setMessage("Do you Want to Confirm ? ")
                .setCancelable(true)
                .setPositiveButton("Yes"){dialogInterface,it->
                    finish()
                }
                .setNegativeButton("No"){dialogInterface,it->
                    finish()
                }

        }




    }
}