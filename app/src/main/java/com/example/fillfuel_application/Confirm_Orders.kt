package com.example.fillfuel_application

import  android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class Confirm_Orders : AppCompatActivity() {

    private lateinit var firebaseDatabase: FirebaseDatabase
    private lateinit var dbref:DatabaseReference
     private  lateinit var  userRecyclerView: RecyclerView
    private lateinit var ArrayList_con: ArrayList<Confirm>

    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_orders)

        val homec=findViewById<ImageView>(R.id.homec)
        homec.setOnClickListener(View.OnClickListener {val Intentc=
            Intent(this,Home_page::class.java)
            startActivity(Intentc)  })

        val locationc=findViewById<ImageView>(R.id.locationc)
        locationc.setOnClickListener(View.OnClickListener {val Intentlc=
            Intent(this,Select_Location::class.java)
            startActivity(Intentlc)  })

        val cartc=findViewById<ImageView>(R.id.cartc)
        cartc.setOnClickListener(View.OnClickListener {val Intent2=
            Intent(this,Orders::class.java)
            startActivity(Intent2)  })

        val profilec=findViewById<ImageView>(R.id.profilec)
        profilec.setOnClickListener(View.OnClickListener {val Intent2=
            Intent(this,StationProfile::class.java)
            startActivity(Intent2)  })


      val   userRecyclerView:RecyclerView=findViewById(R.id.recy_con)
        userRecyclerView.layoutManager=LinearLayoutManager(this)
        userRecyclerView.setHasFixedSize(true)

        ArrayList_con= arrayListOf<Confirm>()

        getConfirmData()



    }

    private fun getConfirmData() {

        dbref = FirebaseDatabase.getInstance().getReference("Confirms");
        dbref.addValueEventListener(object :ValueEventListener{
            @SuppressLint("SuspiciousIndentation")
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for(userSnapshot in snapshot.children){
                      val confirm=userSnapshot.getValue(Confirm::class.java)

                            ArrayList_con.add(confirm!!)

                    }

                    userRecyclerView.adapter=ConfirmAdapter(ArrayList_con)

                }


            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

    }



}