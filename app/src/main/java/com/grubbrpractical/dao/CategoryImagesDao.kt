package com.grubbrpractical.dao

import androidx.room.*
import com.grubbrpractical.model.CategoryImagesMaster

@Dao
interface CategoryImagesDao {

    @Insert
    fun insert(note: CategoryImagesMaster)

    @Update
    fun update(note: CategoryImagesMaster)

    @Delete
    fun delete(note: CategoryImagesMaster)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllCategoryImages(order: List<CategoryImagesMaster>)

    @Query("delete from category_images")
    fun deleteAllCategoryImages()

    @Query("select * from category_images")
    fun getAllCategoryImages(): List<CategoryImagesMaster>
}