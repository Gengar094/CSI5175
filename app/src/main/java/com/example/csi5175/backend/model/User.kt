package com.example.csi5175.backend.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User (
    @PrimaryKey
    @ColumnInfo
    var uid: Int,
    @ColumnInfo
    var email: String,
    @ColumnInfo
    var password: String,
    @ColumnInfo(name = "first_name")
    var firstName: String,
    @ColumnInfo(name = "last_name")
    var lastName: String,
    @ColumnInfo
    var phone: Int,
    @ColumnInfo
    var address: Address,
    @ColumnInfo
    var history: List<Order>?,
    @ColumnInfo
    var favorite: List<Product>?,
    @ColumnInfo
    var cart: List<Product>?,
)