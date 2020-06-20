package com.kotlin.lifecycleaware

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainActivityViewModel : ViewModel() {
    private lateinit var myRandomNumber: MutableLiveData<String>

     fun createNumber() {
        val random = Random()
        myRandomNumber.value = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    fun getNumber(): MutableLiveData<String> {
        if (!this::myRandomNumber.isInitialized) {
            myRandomNumber = MutableLiveData()
            createNumber()
        }

        return myRandomNumber
    }
}