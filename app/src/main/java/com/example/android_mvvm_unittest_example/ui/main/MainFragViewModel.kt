package com.example.android_mvvm_unittest_example.ui.main

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.android_mvvm_unittest_example.R
import com.example.android_mvvm_unittest_example.ui.BaseViewModel

class MainFragViewModel(override val app: Application) : BaseViewModel(app) {

    private var clickTime: Int = 0

    private var clickTimeDesc: MutableLiveData<String> = MutableLiveData<String>(String.format(getString(R.string.click_count_desc), 0))
    val _clickTimeDesc: MutableLiveData<String> = clickTimeDesc


    fun onClick() {
        Log.d("btnClick", "user clicked button.")
        clickTime += 1

        clickTimeDesc.value = String.format(getString(R.string.click_count_desc), clickTime)
    }

}