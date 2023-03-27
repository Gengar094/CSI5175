package com.backend.csi5175.converters

import androidx.room.TypeConverter
import com.backend.csi5175.model.Address
import com.backend.csi5175.model.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class AddressConverter {
    @TypeConverter
    fun addressToString(address: Address): String {
        val gson = Gson()
        return gson.toJson(address)
    }

    @TypeConverter
    fun stringToUser(value: String): Address {
        val type = object : TypeToken<Address>() {}.type
        return Gson().fromJson(value, type)
    }

}