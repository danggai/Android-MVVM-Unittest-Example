package com.example.android_mvvm_unittest_example.util

import android.util.Log
import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class NumAddTest {
    @Test
    fun test_1() {
        val result: Int = 2 + 2
        val value = CommonFunction.numAdd(2,2)
        Assert.assertThat(result, CoreMatchers.`is`(value))
    }

    @Test
    fun test_2() {
        val result: Int = 8 + (-1)
        val value = CommonFunction.numAdd(8,-1)
        Assert.assertThat(result, CoreMatchers.`is`(value))
    }

    @Test
    fun test_3() {
        val result: Int = 65535 + 1
        val value = CommonFunction.numAdd(65535,1)
        Assert.assertThat(result, CoreMatchers.`is`(value))
    }
}