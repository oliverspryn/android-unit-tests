package com.oliverspryn.medium.myapplication.mvc

import java.util.ArrayList

abstract class BaseObservableViewMvc<Listener> : BaseViewMvc(), ObservableViewMvc<Listener> {

    private val listeners = ArrayList<Listener>()

    override fun registerListener(listener: Listener) {
        listeners.add(listener)
    }

    override fun unregisterListener(listener: Listener) {
        listeners.remove(listener)
    }
}
