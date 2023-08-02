package com.barreto.roomexemple.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class UserModel {

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    @ColumnInfo(name = "username")
    var username:String = ""
    @ColumnInfo(name = "password")
    var password:String = ""


}