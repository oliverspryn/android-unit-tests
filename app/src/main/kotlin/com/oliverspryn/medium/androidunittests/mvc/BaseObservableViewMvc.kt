package com.oliverspryn.medium.androidunittests.mvc

import java.util.*

abstract class BaseObservableViewMvc<Listener> : BaseViewMvc(), ObservableViewMvc<Listener> {

    private val listeners = ArrayList<Listener>()

    override fun getListeners(): List<Listener> = Collections.unmodifiableList(listeners)

    override fun registerListener(listener: Listener) {
        listeners.add(listener)
    }

    override fun unregisterListener(listener: Listener) {
        listeners.remove(listener)
    }
}
