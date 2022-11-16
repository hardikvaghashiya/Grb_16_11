package com.grubbrpractical.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "screen_saver_master")
data class ScreenSaverMaster(
    @ColumnInfo(name = "AnimationDirectionID")
    @SerializedName("AnimationDirectionID")
    var animationDirectionID: Int? = 0,
    @ColumnInfo(name = "BranchID")
    @SerializedName("BranchID")
    var branchID: Int? = 0,
    @ColumnInfo(name = "CompanyID")
    @SerializedName("CompanyID")
    var companyID: Int? = 0,
    @ColumnInfo(name = "ConcessionaireID")
    @SerializedName("ConcessionaireID")
    var concessionaireID: Int? = 0,
    @ColumnInfo(name = "CreatedBy")
    @SerializedName("CreatedBy")
    var createdBy: Int? = 0,
    @ColumnInfo(name = "CreatedDate")
    @SerializedName("CreatedDate")
    var createdDate: String? = "",
    @ColumnInfo(name = "Description")
    @SerializedName("Description")
    var description: String? = "",
    @ColumnInfo(name = "DisplayOrder")
    @SerializedName("DisplayOrder")
    var displayOrder: Int? = 0,
    @ColumnInfo(name = "IPAddress")
    @SerializedName("IPAddress")
    var iPAddress: String? = "",
    @ColumnInfo(name = "ImagePath")
    @SerializedName("ImagePath")
    var imagePath: String? = "",
    @ColumnInfo(name = "IsActive")
    @SerializedName("IsActive")
    var isActive: String? = "",
    @ColumnInfo(name = "Name")
    @SerializedName("Name")
    var name: String? = "",
    @PrimaryKey
    @ColumnInfo(name = "ScreenSaverID")
    @SerializedName("ScreenSaverID")
    var screenSaverID: Int = 0,
    @ColumnInfo(name = "ScreenSaverTypeID")
    @SerializedName("ScreenSaverTypeID")
    var screenSaverTypeID: Int? = 0,
    @ColumnInfo(name = "SliderText")
    @SerializedName("SliderText")
    var sliderText: String? = "",
    @ColumnInfo(name = "UpdatedBy")
    @SerializedName("UpdatedBy")
    var updatedBy: String? = "",
    @ColumnInfo(name = "UpdatedDate")
    @SerializedName("UpdatedDate")
    var updatedDate: String? = "",
    @ColumnInfo(name = "VideoPath")
    @SerializedName("VideoPath")
    var videoPath: String? = ""
) : Parcelable