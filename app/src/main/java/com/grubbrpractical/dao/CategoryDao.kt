package com.grubbrpractical.dao

import androidx.room.*
import com.grubbrpractical.model.CategoryMaster

@Dao
interface CategoryDao {

    @Insert
    fun insert(note: CategoryMaster)

    @Update
    fun update(note: CategoryMaster)

    @Delete
    fun delete(note: CategoryMaster)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllCategory(order: List<CategoryMaster>)

    @Query("delete from category_master")
    fun deleteAllCategory()

    @Query("select * from category_master")
    fun getAllCategory(): List<CategoryMaster>
}