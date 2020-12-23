package com.example.android_mvvm_unittest_example.di

import com.example.android_mvvm_unittest_example.ui.main.MainActViewModel
import com.example.android_mvvm_unittest_example.ui.main.MainFragViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel { MainActViewModel() }
    viewModel { MainFragViewModel() }
}