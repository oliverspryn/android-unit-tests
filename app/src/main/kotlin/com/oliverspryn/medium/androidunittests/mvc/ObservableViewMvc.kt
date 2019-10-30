package com.oliverspryn.medium.androidunittests.mvc

interface ObservableViewMvc<Listener> : ViewMvc {
    fun getListeners(): List<Listener>
    fun registerListener(listener: Listener)
    fun unregisterListener(listener: Listener)
}
