package com.grubbrpractical.dao

import androidx.room.*
import com.grubbrpractical.model.ItemsMaster

@Dao
interface ItemsDao {

    @Insert
    fun insert(note: ItemsMaster)

    @Update
    fun update(note: ItemsMaster)

    @Delete
    fun delete(note: ItemsMaster)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllItems(order: List<ItemsMaster>)

    @Query("delete from items")
    fun deleteAllItems()

    @Query("select * from items")
    fun getAllItems(): List<ItemsMaster>
}