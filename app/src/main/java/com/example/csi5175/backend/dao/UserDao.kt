package com.example.csi5175.backend.dao

import androidx.room.*
import com.example.csi5175.backend.model.User

@Dao
interface UserDao
{
    @Query("SELECT * FROM user WHERE uid = :uid LIMIT 1")
    fun findUserByUid(uid: Int): User

    @Query("SELECT * FROM user")
    fun getAllUsers(): List<User>

    @Insert
    fun insert(vararg users: User)

    @Update
    fun updateUserInfo(user: User)

    @Query("DELETE FROM user WHERE uid = :uid")
    fun delete(uid: Int)
}