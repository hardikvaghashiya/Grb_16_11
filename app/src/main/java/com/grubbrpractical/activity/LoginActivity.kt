package com.grubbrpractical.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.grubbrpractical.R
import com.grubbrpractical.databinding.ActivityLoginBinding
import com.grubbrpractical.factory.MyViewModelFactory
import com.grubbrpractical.model.LoginRequest
import com.grubbrpractical.repository.LoginRepository
import com.grubbrpractical.retrofit.RetrofitService
import com.grubbrpractical.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    lateinit var mBinding: ActivityLoginBinding

    lateinit var viewModel: LoginViewModel
    private val retrofitService = RetrofitService.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        initView()
    }

    private fun initView() {
        viewModel =
            ViewModelProvider(this, MyViewModelFactory(this, LoginRepository(retrofitService))).get(
                LoginViewModel::class.java
            )

        viewModel.loginResponse.observe(this) {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        }

        mBinding.btnSubmit.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.btnSubmit -> {
                if (checkValidation()) {
                    var request = LoginRequest(
                        appVersion = "1.0",
                        deviceID = "c4db5cb7e4a46365",
                        deviceType = "1",
                        fCMID = "ef5Dk7VIGsU:APA91bHhPJLrfv2oLhMCT8geh1v0sZGZyvtGXMvU_AAV6ncep3O_g1po0n1Wy_ACNm5HLv6KEjJgZ8I-SNJZnZ5wp1Bsz_QQi82YUTy8-0IwctLICHz_Zy49NBV0OowslifNcgrahad5",
                        moduleID = "1",
                        password = mBinding.edtPassword.text.toString().trim(),
                        username = mBinding.edtUserName.text.toString().trim()
                    )
                    viewModel.login(this, request)
                }
            }
        }
    }

    private fun checkValidation(): Boolean {
        if (mBinding.edtUserName.text.toString().trim().isEmpty()) {
            Toast.makeText(this, getString(R.string.error_username), Toast.LENGTH_SHORT).show()
        } else if (mBinding.edtPassword.text.toString().trim().isEmpty()) {
            Toast.makeText(this, getString(R.string.error_password), Toast.LENGTH_SHORT).show()
        } else {
            return true
        }
        return false
    }
}