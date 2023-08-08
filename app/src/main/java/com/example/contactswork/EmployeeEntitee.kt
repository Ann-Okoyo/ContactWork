package com.example.contactswork

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(tableName = "employee-table")
data class EmployeeEntitee(
    val id:Int=0,
    val name:String = "",
    @ColumnInfo(name= "email-id")
    val email:String="",




    



)
