package com.grubbrpractical.viewmodel

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.grubbrpractical.dao.*
import com.grubbrpractical.database.GrubbrDatabase
import com.grubbrpractical.model.LoginRequest
import com.grubbrpractical.model.LoginResponse
import com.grubbrpractical.repository.LoginRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel constructor(
    private val context: Context,
    private val repository: LoginRepository
) : ViewModel() {

    val loginResponse = MutableLiveData<LoginResponse>()
    val errorMessage = MutableLiveData<String>()
    lateinit var screenSaverDao: ScreenSaverDao
    lateinit var categoryDao: CategoryDao
    lateinit var categoryImagesDao: CategoryImagesDao
    lateinit var itemCategoryMappingDao: ItemCategoryMappingDao
    lateinit var itemImagesDao: ItemImagesDao
    lateinit var itemsDao: ItemsDao

    init {
        screenSaverDao = GrubbrDatabase.getInstance(context).screenSaverDao()
        categoryDao = GrubbrDatabase.getInstance(context).categoryDao()
        categoryImagesDao = GrubbrDatabase.getInstance(context).categoryImagesDao()
        itemCategoryMappingDao = GrubbrDatabase.getInstance(context).itemCategoryMappingDao()
        itemImagesDao = GrubbrDatabase.getInstance(context).itemImagesDao()
        itemsDao = GrubbrDatabase.getInstance(context).itemsDao()
    }

    fun login(context: Context, request: LoginRequest) {
        val response = repository.login(request)
        response.enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                loginResponse.postValue(response.body())

                Log.e("Response", Gson().toJson(response.body()!!))
                screenSaverDao.insertAllScreenSaver(response.body()!!.screenSaverMasters)

                Log.e(
                    "Size",
                    screenSaverDao.getAllScreenSaver().size.toString()
                )
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                errorMessage.postValue(t.message)
            }
        })
    }
}