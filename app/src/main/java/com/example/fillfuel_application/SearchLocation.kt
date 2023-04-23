package com.example.fillfuel_application

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SearchLocation : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_location)

        val search=findViewById<Button>(R.id.search)
        search.setOnClickListener(View.OnClickListener {val Intentback=
            Intent(this,Select_Location::class.java)
            startActivity(Intentback)  })
    }
}