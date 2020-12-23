package com.example.android_mvvm_unittest_example.ui

import android.app.Application
import androidx.lifecycle.ViewModel

open class BaseViewModel(open val app: Application) : ViewModel() {

    fun getString(resourceId: Int): String {
        return app.getString(resourceId)
    }

}