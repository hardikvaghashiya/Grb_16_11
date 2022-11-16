package com.grubbrpractical.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginResponse(
    @SerializedName("ScreenSaverMasters")
    var screenSaverMasters: ArrayList<ScreenSaverMaster> = ArrayList(),
    @SerializedName("CategoryMasters")
    var categoryMasters: ArrayList<CategoryMaster> = ArrayList(),
    @SerializedName("CategoryImages")
    var categoryImagesMaster: ArrayList<CategoryImagesMaster> = ArrayList(),
    @SerializedName("Items")
    var itemsMaster: ArrayList<ItemsMaster> = ArrayList(),
    @SerializedName("ItemImages")
    var itemImagesMaster: ArrayList<ItemImagesMaster> = ArrayList(),
    @SerializedName("Item_Category_Mappings")
    var itemCategoryMappingMaster: ArrayList<ItemCategoryMappingMaster> = ArrayList()
) : Parcelable