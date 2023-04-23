package com.example.fillfuel_application

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class Decline_Orders : AppCompatActivity() {

    private lateinit var dbref: DatabaseReference
   lateinit var  declineRecyclerView: RecyclerView
    private lateinit var ArrayList_dec: ArrayList<Decline>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decline_orders)


        val recycle_decline :RecyclerView=findViewById(R.id.recy_decline)
        recycle_decline.layoutManager= LinearLayoutManager(this)
        declineRecyclerView.setHasFixedSize(true)

        ArrayList_dec= arrayListOf<Decline>()
        getDeclineData()



    }

    private fun getDeclineData() {
        dbref = FirebaseDatabase.getInstance().getReference("Decline")
        dbref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if (snapshot.exists()){
                    for(userSnapshot in snapshot.children){
                        val Decline=userSnapshot.getValue(Decline::class.java)
                        ArrayList_dec.add(Decline!!)
                    }
                    declineRecyclerView.adapter=DeclineAdapter(ArrayList_dec)
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })

    }
    }
