package com.grubbrpractical.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.grubbrpractical.dao.*
import com.grubbrpractical.model.ItemsMaster
import com.grubbrpractical.model.ScreenSaverMaster

@Database(
    entities = [ScreenSaverMaster::class, ItemsMaster::class, ItemImagesDao::class, ItemCategoryMappingDao::class,
        CategoryImagesDao::class, CategoryDao::class],
    version = 1,                // <- Database version
    exportSchema = true
)
abstract class GrubbrDatabase : RoomDatabase() {

    abstract fun screenSaverDao(): ScreenSaverDao
    abstract fun itemsDao(): ItemsDao
    abstract fun itemImagesDao(): ItemImagesDao
    abstract fun itemCategoryMappingDao(): ItemCategoryMappingDao
    abstract fun categoryImagesDao(): CategoryImagesDao
    abstract fun categoryDao(): CategoryDao

    companion object {
        private var instance: GrubbrDatabase? = null

        @Synchronized
        fun getInstance(ctx: Context): GrubbrDatabase {
            if (instance == null)
                instance = Room.databaseBuilder(
                    ctx.applicationContext, GrubbrDatabase::class.java,
                    "grubbr_database"
                )
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            return instance!!
        }
    }
}