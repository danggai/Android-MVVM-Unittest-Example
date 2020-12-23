package com.example.android_mvvm_unittest_example.ui.main

import android.os.Bundle
import androidx.annotation.LayoutRes
import com.example.android_mvvm_unittest_example.R
import com.example.android_mvvm_unittest_example.databinding.MainActivityBinding
import com.example.android_mvvm_unittest_example.ui.BindingActivity
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : BindingActivity<MainActivityBinding>() {

    @LayoutRes
    override fun getLayoutResId() = R.layout.main_activity

    private lateinit var mVM: MainActViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.vm = getViewModel()
        binding.lifecycleOwner = this

        binding.vm?.let {
            mVM = it
        }

        initFragment()
    }

    private fun initFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment, MainFragment.newInstance(), MainFragment.TAG)
            .commit()
    }

}