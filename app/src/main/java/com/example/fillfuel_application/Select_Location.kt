package com.example.fillfuel_application

import android.annotation.SuppressLint
import android.content.Intent
import android.location.Address
import android.location.Geocoder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SearchView

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import java.io.IOException

class Select_Location : AppCompatActivity(), OnMapReadyCallback {

    lateinit var  myMap:GoogleMap
    lateinit var mapSearchView:SearchView

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_location)
        mapSearchView=findViewById(R.id.search_location1)

        val btn_next=findViewById<Button>(R.id.btn_next)
        btn_next.setOnClickListener(View.OnClickListener {val Intentback=
            Intent(this,Home_page::class.java)
            startActivity(Intentback)  })




        val mapFragment = supportFragmentManager.findFragmentById(R.id.map1)as SupportMapFragment
        mapSearchView.setOnQueryTextListener(object  :SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                val location = mapSearchView.query.toString()
                var addressList: List<Address>? = null

                if (location != null) {
                    val geocoder = Geocoder(this@Select_Location)

                    try {
                        addressList = geocoder.getFromLocationName(location, 1)
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }

                    val address = addressList?.get(0)
                    val latlng = LatLng(address!!.latitude, address.longitude)
                    myMap.addMarker(MarkerOptions().position(latlng).title(location))
                    myMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latlng, 10f))

                }
                return false


            }

            override fun onQueryTextChange(newText: String?): Boolean {
               return false
            }
        })
        mapFragment.getMapAsync(this@Select_Location)

        }

    override fun onMapReady(googleMap: GoogleMap) {
        myMap=googleMap

    }
}










