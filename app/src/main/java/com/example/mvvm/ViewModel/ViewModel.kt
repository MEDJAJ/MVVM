package com.example.mvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.Model.User

class UserViewModel : ViewModel(){
    private val user = MutableLiveData<User>()
    val use: LiveData<User> =user

    fun getUser() {
        user.value = User("Mohammede", 25)
    }
}
