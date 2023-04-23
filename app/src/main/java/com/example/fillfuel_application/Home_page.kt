package com.example.fillfuel_application

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Home_page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val btn_o=findViewById<Button>(R.id.button_o)
       btn_o.setOnClickListener(View.OnClickListener {val Intent5=
            Intent(this,Orders::class.java)
            startActivity(Intent5)  })
   //location

        val btn_l=findViewById<Button>(R.id.button_l)
        btn_l.setOnClickListener(View.OnClickListener {val Intent4=
            Intent(this,Select_Location::class.java)
            startActivity(Intent4)  })


        val btn_fl=findViewById<Button>(R.id.buttonfl)
        btn_fl.setOnClickListener(View.OnClickListener {val Intent6=
            Intent(this,Fuel_Type_Quantity::class.java)
            startActivity(Intent6)  })

        //add profile

        val btn_p=findViewById<Button>(R.id.btn_p)
        btn_p.setOnClickListener(View.OnClickListener {val Intent6=
            Intent(this,StationProfile::class.java)
            startActivity(Intent6)  })
    }
}