package com.hurist.imusic.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

class PhoneLoginViewModel : ViewModel(){
    val phone = MutableLiveData<String>()
    val password = MutableLiveData<String>()
}