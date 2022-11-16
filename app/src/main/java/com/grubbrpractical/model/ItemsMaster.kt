package com.grubbrpractical.model
import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
@Entity(tableName = "items")
data class ItemsMaster(
    @PrimaryKey
    @ColumnInfo(name = "ItemID")
    @SerializedName("ItemID")
    var itemID: String = "",
    @ColumnInfo(name = "Name")
    @SerializedName("Name")
    var name: String? = "",
    @ColumnInfo(name = "FullDescription")
    @SerializedName("FullDescription")
    var fullDescription: String? = "",
    @ColumnInfo(name = "Price")
    @SerializedName("Price")
    var price: String? = ""
) : Parcelable