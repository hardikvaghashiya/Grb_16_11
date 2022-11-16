package com.grubbrpractical.dao

import androidx.room.*
import com.grubbrpractical.model.ScreenSaverMaster

@Dao
interface ScreenSaverDao {

    @Insert
    fun insert(note: ScreenSaverMaster)

    @Update
    fun update(note: ScreenSaverMaster)

    @Delete
    fun delete(note: ScreenSaverMaster)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllScreenSaver(order: List<ScreenSaverMaster>)

    @Query("delete from screen_saver_master")
    fun deleteAllScreenSaver()

    @Query("select * from screen_saver_master")
    fun getAllScreenSaver(): List<ScreenSaverMaster>
}