package com.example.android_mvvm_unittest_example.di

import com.example.android_mvvm_unittest_example.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel { MainViewModel() }
}