package com.grubbrpractical.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginRequest(
    @SerializedName("AppVersion")
    var appVersion: String? = "",
    @SerializedName("DeviceID")
    var deviceID: String? = "",
    @SerializedName("DeviceType")
    var deviceType: String? = "",
    @SerializedName("FCMID")
    var fCMID: String? = "",
    @SerializedName("ModuleID")
    var moduleID: String? = "",
    @SerializedName("password")
    var password: String? = "",
    @SerializedName("Username")
    var username: String? = ""
) : Parcelable