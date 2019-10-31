package com.oliverspryn.medium.androidunittests.dagger

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
    ) = LayoutInflater.from(
        context
    )

    @Provides
    fun provideViewMvcFactory(
        layoutInflater: LayoutInflater
    ) = ViewMvcFactory(
        layoutInflater = layoutInflater
    )
}
