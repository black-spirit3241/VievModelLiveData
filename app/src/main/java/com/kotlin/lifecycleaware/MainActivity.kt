package com.kotlin.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        private val TAG=MainActivity::class.java.simpleName
    }

    private lateinit var dataGenerator:DataGenerator
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel=ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val data=viewModel.getNumber()

        data.observe(this, Observer { number ->
            tv_random_number.text=number
        })

        btn_random.setOnClickListener {
            viewModel.createNumber()
        }
//        data= DataGenerator()
//        tv_random_number.text=viewModel.getNumber()
//        lifecycle.addObserver(MainActivityObserver())
    }
}