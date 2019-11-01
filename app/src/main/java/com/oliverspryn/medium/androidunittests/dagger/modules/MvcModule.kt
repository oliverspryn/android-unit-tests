package com.oliverspryn.medium.androidunittests.dagger.modules

import android.content.Context
import android.view.LayoutInflater
import com.oliverspryn.medium.androidunittests.mvc.ViewMvcFactory
import dagger.Module
import dagger.Provides

@Module
class MvcModule {

    @Provides
    fun provideLayoutInflater(
        context: Context
    ): LayoutInflater = LayoutInflater.from(
        context
    )
}
