package com.example.fillfuel_application

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class Fuel_Type_Quantity : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fuel_type_quantity)

        val quantity_back=findViewById<ImageView>(R.id.quantity_back)
        quantity_back.setOnClickListener(View.OnClickListener {val Intentb=
            Intent(this,Home_page::class.java)
            startActivity(Intentb)  })


        val imageView_ptrol92=findViewById<ImageView>(R.id.imageView_ptrol92)
        imageView_ptrol92.setOnClickListener(View.OnClickListener {val Intent2=
            Intent(this,All_Quantity::class.java)
            startActivity(Intent2)  })

        val image_95=findViewById<ImageView>(R.id.image_95)
        image_95.setOnClickListener(View.OnClickListener {val Intent2=
            Intent(this,All_Quantity::class.java)
            startActivity(Intent2)  })

        val image_dies=findViewById<ImageView>(R.id.image_dies)
       image_dies.setOnClickListener(View.OnClickListener {val Intent2=
            Intent(this,All_Quantity::class.java)
            startActivity(Intent2)  })

        val image_d=findViewById<ImageView>(R.id.image_d)
        image_d.setOnClickListener(View.OnClickListener {val Intent2=
            Intent(this,All_Quantity::class.java)
            startActivity(Intent2)  })

    }
}