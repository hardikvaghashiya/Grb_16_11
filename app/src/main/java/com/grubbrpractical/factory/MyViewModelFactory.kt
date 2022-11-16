package com.grubbrpractical.factory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.grubbrpractical.repository.LoginRepository
import com.grubbrpractical.viewmodel.LoginViewModel

class MyViewModelFactory constructor(private val context: Context,private val repository: LoginRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            LoginViewModel(this.context, this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}