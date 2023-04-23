package com.example.fillfuel_application

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Orders : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders)

        //back button
        val back_btnorder=findViewById<ImageView>(R.id.back_btnorder)
        back_btnorder.setOnClickListener(View.OnClickListener {val Intent2=
            Intent(this,Home_page::class.java)
            startActivity(Intent2)  })


        //Confirm orders
        val btn_confirm=findViewById<Button>(R.id.btn_confirm)
        btn_confirm.setOnClickListener(View.OnClickListener {  val Intent1=Intent(this,Confirm_Orders::class.java)
            startActivity(Intent1) })



    // pending orders
        val btn_pending=findViewById<Button>(R.id.btn_pending)
        btn_pending.setOnClickListener(View.OnClickListener {val Intent2=Intent(this,Pending_Orders::class.java)
            startActivity(Intent2)  })




        //decline orders
        val btn_decline=findViewById<Button>(R.id.btn_decline)
        btn_decline.setOnClickListener(View.OnClickListener {  val Intent3=Intent(this,Decline_Orders::class.java)
            startActivity(Intent3) })



        }


}