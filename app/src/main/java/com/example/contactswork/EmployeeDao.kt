package com.example.contactswork

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow



@Dao
interface EmployeeDao {


 @Insert
 suspend fun insert(employeeEntitee: EmployeeEntitee)

 @Update
 suspend fun update(employeeEntitee: EmployeeEntitee)

 @Delete
 suspend fun  delete(employeeEntitee: EmployeeEntitee)

 @Query("SELECT * FROM `employee-table`")
 fun fetchAllEmployees():Flow<List<EmployeeEntitee>>

 @Query("SELECT * FROM `employee-table` where id=:id")
 fun fetchEmployeeById(id:Int):Flow<List<EmployeeEntitee>>







}