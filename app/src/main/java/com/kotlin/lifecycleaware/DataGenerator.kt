package com.kotlin.lifecycleaware

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.collections.RandomAccess

class DataGenerator : ViewModel() {
    companion object {
        private val TAG = DataGenerator::class.java.simpleName
    }

//    private lateinit var myRandomNumber: String
    private lateinit var myRandomNumber:MutableLiveData<String>

    private fun createNumber() {
        val random = Random()
        Log.i(TAG, "Number Generated")
        myRandomNumber.value = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    fun getNumber(): MutableLiveData<String> {
        Log.i(TAG, "Get Number")
        if (!this::myRandomNumber.isInitialized) {
            myRandomNumber= MutableLiveData()
            createNumber()
        }

        return myRandomNumber
    }
}