package com.example.fillfuel_application

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Get_Start : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_start)

        val btn_start=findViewById<Button>(R.id.button_start)
        btn_start.setOnClickListener(View.OnClickListener {val Intentstart=
            Intent(this,Orders::class.java)// signup page
            startActivity(Intentstart)  })
    }
}