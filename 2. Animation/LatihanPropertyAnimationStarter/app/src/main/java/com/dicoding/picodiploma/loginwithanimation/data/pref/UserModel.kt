package com.dicoding.picodiploma.loginwithanimation.data.pref

data class UserModel(
    val email: String,
    val token: String,

    //diluar data
    val isLogin: Boolean = false
)