package com.grubbrpractical.dao

import androidx.room.*
import com.grubbrpractical.model.ItemImagesMaster

@Dao
interface ItemImagesDao {

    @Insert
    fun insert(note: ItemImagesMaster)

    @Update
    fun update(note: ItemImagesMaster)

    @Delete
    fun delete(note: ItemImagesMaster)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllItemImages(order: List<ItemImagesMaster>)

    @Query("delete from item_images")
    fun deleteAllItemImages()

    @Query("select * from item_images")
    fun getAllItemImages(): List<ItemImagesMaster>
}