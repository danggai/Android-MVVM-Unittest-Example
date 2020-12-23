package com.example.android_mvvm_unittest_example.ui.main

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.android_mvvm_unittest_example.R
import com.example.android_mvvm_unittest_example.ui.BaseViewModel

class MainFragViewModel(override val app: Application) : BaseViewModel(app) {

    private var mainStr: MutableLiveData<String> = MutableLiveData<String>(getString(R.string.string_default))
    val _mainStr: MutableLiveData<String> = mainStr

}