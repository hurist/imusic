package com.hurist.imusic.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PhoneLoginViewModel : ViewModel(){
    val phone = MutableLiveData<String>()
    val password = MutableLiveData<String>()
}