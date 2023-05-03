package com.kotlinnavigationdemo.ex3_navdrawer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
     public var _title:MutableLiveData<String> = MutableLiveData<String>()
    public fun setTitle(title: String){
        _title.value = title
    }
}