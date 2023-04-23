package com.example.fillfuel_application

data class Pending(var vehicleType:String?=null,
                   var vehicleNumber: String,
                   var fuelType:String?=null,
                   var fuelQuantity:String?=null,
                   var location:String?=null)
