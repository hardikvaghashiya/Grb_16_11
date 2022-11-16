package com.grubbrpractical.model
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
@Entity(tableName = "item_category_mapping")
data class ItemCategoryMappingMaster(
    @PrimaryKey
    @ColumnInfo(name = "PCMappingID")
    @SerializedName("PCMappingID")
    var pCMappingID: String = "",
    @ColumnInfo(name = "PCMappingID")
    @SerializedName("PCMappingID")
    var itemID: String? = "",
    @ColumnInfo(name = "PCMappingID")
    @SerializedName("PCMappingID")
    var categoryID: String? = "",
    @ColumnInfo(name = "PCMappingID")
    @SerializedName("PCMappingID")
    var displayOrder: String? = ""
) : Parcelable