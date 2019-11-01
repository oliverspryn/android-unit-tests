package com.oliverspryn.medium.androidunittests.dagger.components

import com.oliverspryn.medium.androidunittests.dagger.modules.MvcModule
import dagger.Component

@Component(modules = [
    MvcModule::class
])
interface MainComponent
