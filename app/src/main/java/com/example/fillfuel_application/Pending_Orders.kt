package com.example.fillfuel_application

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class Pending_Orders : AppCompatActivity() {
    private lateinit var dbref:DatabaseReference
    lateinit var  RecyclerView_pen: RecyclerView
    private lateinit var ArrayList_pen: ArrayList<Pending>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pending_orders)

        val RecyclerView_pen :RecyclerView=findViewById(R.id.pending)
        RecyclerView_pen.layoutManager= LinearLayoutManager(this)
        RecyclerView_pen.setHasFixedSize(true)

        ArrayList_pen= arrayListOf<Pending>()
        getPendingData()



    }

    private fun getPendingData() {
        dbref = FirebaseDatabase.getInstance().getReference("Pending")
        dbref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                if(snapshot.exists()){
                    for(userSnapshot in snapshot.children){
                        val Pending=userSnapshot.getValue(Pending::class.java)
                        ArrayList_pen.add(Pending!!)
                    }

                    RecyclerView_pen.adapter=PendingAdapter(ArrayList_pen)

                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })

    }
    }
