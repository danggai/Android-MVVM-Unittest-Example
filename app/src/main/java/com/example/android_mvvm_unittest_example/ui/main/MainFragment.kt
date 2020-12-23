package com.example.android_mvvm_unittest_example.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.example.android_mvvm_unittest_example.R
import com.example.android_mvvm_unittest_example.databinding.MainFragmentBinding
import com.example.android_mvvm_unittest_example.ui.BindingFragment
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainFragment : BindingFragment<MainFragmentBinding>() {

    companion object {
        val TAG: String = MainFragment::class.java.simpleName
        fun newInstance() = MainFragment()
    }

    private lateinit var vm: MainFragViewModel

    @LayoutRes
    override fun getLayoutResId() = R.layout.main_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.vm = getViewModel()
        binding.lifecycleOwner = viewLifecycleOwner

        binding.vm?.let{
            vm = it
        }

        initLv()
    }

    fun initLv() {
//        vm._mainStr.observe(this, Observer {
//            // it로 넘어오는 param은 LiveData의 value
//        })
    }


}