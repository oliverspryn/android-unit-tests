package com.oliverspryn.medium.androidunittests.dagger

import dagger.Component

@Component(modules = [
    MvcModule::class
])
interface MainComponent {
}
