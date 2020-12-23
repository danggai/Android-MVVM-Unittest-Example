package com.example.android_mvvm_unittest_example.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainFragViewModel : ViewModel() {

    private var mainStr: MutableLiveData<String> = MutableLiveData<String>("I'm MutableLiveData String in MainFragViewModel")
    val _mainStr: MutableLiveData<String> = mainStr

}