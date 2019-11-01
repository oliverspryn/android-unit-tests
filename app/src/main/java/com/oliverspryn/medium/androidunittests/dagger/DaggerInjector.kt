package com.oliverspryn.medium.androidunittests.dagger

import com.oliverspryn.medium.androidunittests.MainActivity
import com.oliverspryn.medium.androidunittests.dagger.components.MainComponent

object DaggerInjector {

    var mainComponent: MainComponent? = null
        private set

    fun buildMainComponent(activity: MainActivity): MainComponent {
        val component = DaggerMainComponent
            .builder()
            .build()

        mainComponent = component
        return component
    }
}
