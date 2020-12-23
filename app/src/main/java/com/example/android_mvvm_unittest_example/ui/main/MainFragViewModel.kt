package com.example.android_mvvm_unittest_example.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainFragViewModel : ViewModel() {

    private var mainStr: MutableLiveData<String> = MutableLiveData<String>("나는 FragViewModel에 있는 string이얌")
    val _mainStr: MutableLiveData<String> = mainStr

}