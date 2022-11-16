package com.grubbrpractical.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "category_images")
data class CategoryImagesMaster(
    @PrimaryKey
    @ColumnInfo(name = "CImgID")
    @SerializedName("CImgID")
    var cImgID: String = "",
    @ColumnInfo(name = "ImageUrl")
    @SerializedName("ImageUrl")
    var imageUrl: String? = "",
    @ColumnInfo(name = "CategoryID")
    @SerializedName("CategoryID")
    var categoryID: String? = "",
    @SerializedName("IsActive")
    var isActive: String? = "",
    @SerializedName("CreatedBy")
    var createdBy: String? = "",
    @SerializedName("CreatedDate")
    var createdDate: String? = "",
    @SerializedName("IPAddress")
    var iPAddress: String? = ""
) : Parcelable