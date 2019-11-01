package com.oliverspryn.medium.androidunittests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oliverspryn.medium.androidunittests.dagger.DaggerInjector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerInjector.buildMainComponent(this)
        setContentView(R.layout.activity_main)
    }
}
