package com.example.iman_tulenaliev_hw_6_3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {

    private var counter = 0
    var mCounter = MutableLiveData<Int>()
    val operation = MutableLiveData("")

    fun onIncrementClick() {
        ++counter
        mCounter.value = counter
        operation.value += "+ , "
    }

    fun onDecrementClick() {
        --counter
        mCounter.value = counter
        operation.value += "- , "
    }
}