package com.example.android_mvvm_unittest_example.ui.main

import android.app.Application
import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.example.android_mvvm_unittest_example.R
import com.example.android_mvvm_unittest_example.ui.BaseViewModel

class MainFragViewModel(override val app: Application) : BaseViewModel(app) {

    private var clickTime: Int = 0
    private var clickTimeDesc: MutableLiveData<String> = MutableLiveData<String>(String.format(getString(R.string.click_count_desc), clickTime))
    val _clickTimeDesc: MutableLiveData<String> = clickTimeDesc

    private var remainTime: Int = 10
    private var remainTimeDesc: MutableLiveData<String> = MutableLiveData<String>(String.format(getString(R.string.remain_count_desc), remainTime))
    val _remainTimeDesc: MutableLiveData<String> = remainTimeDesc


    fun onClick(v: View) {
        when (v.id) {
            R.id.btn_first -> {
                Log.d("btnClick", "button first")
                clickTime += 1
                clickTimeDesc.value = String.format(getString(R.string.click_count_desc), clickTime)
            }
            R.id.btn_second -> {
                Log.d("btnClick", "button second")
                _remainTimeDesc.value = if (remainTime > 0) {
                    remainTime -= 1
                    String.format(getString(R.string.remain_count_desc), remainTime)
                } else {
                    getString(R.string.remain_count_desc_fake)
                }
            }
        }
    }

}