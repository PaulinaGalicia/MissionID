package com.citi.inescanner.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val _loginState = MutableLiveData<Boolean>()
    val loginState: LiveData<Boolean> get() = _loginState

    private val hardcodedUsername = "Admin"
    private val hardcodedPassword = "qwerty"

    fun login(username: String, password: String) {
        _loginState.value = (username == hardcodedUsername && password == hardcodedPassword)
    }
}