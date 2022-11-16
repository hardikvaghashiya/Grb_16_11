package com.grubbrpractical.dao

import androidx.room.*
import com.grubbrpractical.model.ItemCategoryMappingMaster

@Dao
interface ItemCategoryMappingDao {

    @Insert
    fun insert(note: ItemCategoryMappingMaster)

    @Update
    fun update(note: ItemCategoryMappingMaster)

    @Delete
    fun delete(note: ItemCategoryMappingMaster)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllItemCategoryMappingMaster(order: List<ItemCategoryMappingMaster>)

    @Query("delete from item_category_mapping")
    fun deleteAllItemCategoryMappingMaster()

    @Query("select * from item_category_mapping")
    fun getAllItemCategoryMappingMaster(): List<ItemCategoryMappingMaster>
}