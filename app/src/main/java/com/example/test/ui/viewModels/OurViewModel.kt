package com.example.test.ui.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OurViewModel : ViewModel() {

    private val num = mutableListOf<String>()
    val add = MutableLiveData<MutableList<String>>()
    private var mCounter = 0

    val counter: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun onAddClick() {
        mCounter++
        counter.value = mCounter
        num.add("+\n")
        add.value = num
    }

    fun onMinusClick() {
        mCounter--
        counter.value = mCounter
        num.add("- \n")
        add.value = num
    }
}