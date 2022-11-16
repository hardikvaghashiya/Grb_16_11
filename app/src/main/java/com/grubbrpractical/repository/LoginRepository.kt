package com.grubbrpractical.repository

import com.grubbrpractical.model.LoginRequest
import com.grubbrpractical.retrofit.RetrofitService

class LoginRepository constructor(
    private val retrofitService: RetrofitService
) {
    fun login(request: LoginRequest) = retrofitService.login("1.0", request)
}