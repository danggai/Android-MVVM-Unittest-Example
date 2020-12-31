package com.example.android_mvvm_unittest_example

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val result: Int = 2 + 2
        assertThat(result, `is`(4))
    }
}