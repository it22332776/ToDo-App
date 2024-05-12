package com.firstapp.anew

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAO {
    @Insert
    suspend fun insertTask(entity: com.firstapp.anew.Entity)

    @Update
    suspend fun updateTask(entity: com.firstapp.anew.Entity)

    @Delete
    suspend fun deleteTask(entity:com.firstapp.anew.Entity)

    @Query("Delete from to_do")
    suspend fun deleteAll()

    @Query("Select * from to_do")
    suspend fun getTasks():List<CardInfo>

}