package com.barreto.roomexemple.DAO

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.barreto.roomexemple.model.UserModel

@Dao
interface UserDAO {
    @Insert
    fun insert(user: UserModel):Long

    @Update
    fun update(user: UserModel):Int

    @Delete
    fun delete(user: UserModel):Int

    @Query("SELECT * FROM user WHERE id = :id")
    fun get(id: Int) : UserModel

    @Query("SELECT * FROM user")
    fun getAll():List<UserModel>

}