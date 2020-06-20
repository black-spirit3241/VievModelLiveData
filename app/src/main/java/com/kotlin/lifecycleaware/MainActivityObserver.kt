package com.kotlin.lifecycleaware

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivityObserver : LifecycleObserver {

    companion object {
        private val TAG = MainActivityObserver::class.java.simpleName
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreateEvent() {
        Log.i(TAG, "Observer ON_Create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStartEvent(){
        Log.i(TAG,"Observer ON_Start")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResumeEvent(){
        Log.i(TAG,"Observer ON_Resume")
    }
}