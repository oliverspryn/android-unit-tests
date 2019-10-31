package com.oliverspryn.medium.androidunittests.mvc

import android.view.LayoutInflater
import javax.inject.Inject

class ViewMvcFactory @Inject constructor(
    private val layoutInflater: LayoutInflater
)
