package com.grubbrpractical.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "item_images")
data class ItemImagesMaster(
    @PrimaryKey
    @ColumnInfo(name = "IImgID")
    @SerializedName("IImgID")
    var iImgID: String = "",
    @ColumnInfo(name = "ImageUrl")
    @SerializedName("ImageUrl")
    var imageUrl: String? = "",
    @ColumnInfo(name = "ItemID")
    @SerializedName("ItemID")
    var itemID: String? = "",
) : Parcelable