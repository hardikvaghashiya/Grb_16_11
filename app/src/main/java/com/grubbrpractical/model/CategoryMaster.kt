package com.grubbrpractical.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName = "category_master")
data class CategoryMaster(
    @SerializedName("BackgroundImage")
    var backgroundImage: String? = "",
    @SerializedName("BranchID")
    var branchID: String? = "",
    @PrimaryKey
    @ColumnInfo(name = "CategoryID")
    @SerializedName("CategoryID")
    var categoryID: String = "",
    @SerializedName("CategoryIcon")
    var categoryIcon: String? = "",
    @SerializedName("ColorCode")
    var colorCode: String? = "",
    @SerializedName("CompanyID")
    var companyID: String? = "",
    @SerializedName("CreatedBy")
    var createdBy: String? = "",
    @SerializedName("CreatedDate")
    var createdDate: String? = "",
    @SerializedName("DMBDescription")
    var dMBDescription: String? = "",
    @SerializedName("DMBImage")
    var dMBImage: String? = "",
    @SerializedName("DMBName")
    var dMBName: String? = "",
    @ColumnInfo(name = "Description")
    @SerializedName("Description")
    var description: String? = "",
    @SerializedName("DescriptionLang")
    var descriptionLang: String? = "",
    @SerializedName("DeselectCategoryIcon")
    var deselectCategoryIcon: String? = "",
    @SerializedName("DisplayCatItemRowCount")
    var displayCatItemRowCount: String? = "",
    @SerializedName("DisplayName")
    var displayName: String? = "",
    @SerializedName("DisplayOrder")
    var displayOrder: String? = "",
    @SerializedName("HeaderImage")
    var headerImage: String? = "",
    @SerializedName("HideHeaderText")
    var hideHeaderText: String? = "",
    @SerializedName("IPAddress")
    var iPAddress: String? = "",
    @SerializedName("IncludeInTopMenu")
    var includeInTopMenu: String? = "",
    @SerializedName("IsActive")
    var isActive: String? = "",
    @SerializedName("IsAlkol")
    var isAlkol: String? = "",
    @SerializedName("IsCatering")
    var isCatering: String? = "",
    @SerializedName("IsCateringAddOn")
    var isCateringAddOn: String? = "",
    @SerializedName("IsDeleted")
    var isDeleted: String? = "",
    @SerializedName("IsShowInOnlineCatering")
    var isShowInOnlineCatering: String? = "",
    @SerializedName("IsShowOnKiosk")
    var isShowOnKiosk: String? = "",
    @SerializedName("IsShowOnOnlineOrder")
    var isShowOnOnlineOrder: String? = "",
    @SerializedName("IsShowOnPOS")
    var isShowOnPOS: String? = "",
    @SerializedName("LabelforItemSelection")
    var labelforItemSelection: String? = "",
    @ColumnInfo(name = "Name")
    @SerializedName("Name")
    var name: String? = "",
    @SerializedName("NameLang")
    var nameLang: String? = "",
    @SerializedName("OmnivoreID")
    var omnivoreID: String? = "",
    @SerializedName("ParentCategoryID")
    var parentCategoryID: String? = "",
    @SerializedName("RefCategoryId")
    var refCategoryId: String? = "",
    @SerializedName("RefVersion")
    var refVersion: String? = "",
    @SerializedName("ShowOnDMB")
    var showOnDMB: String? = "",
    @SerializedName("ShowasClassicModifierGroup")
    var showasClassicModifierGroup: String? = "",
    @SerializedName("TextBackgroundColorForDMB")
    var textBackgroundColorForDMB: String? = "",
    @SerializedName("TextColorForDMB")
    var textColorForDMB: String? = "",
    @SerializedName("ThirdPartyPortalID")
    var thirdPartyPortalID: String? = "",
    @SerializedName("UpdatedBy")
    var updatedBy: String? = "",
    @SerializedName("UpdatedDate")
    var updatedDate: String? = ""
) : Parcelable