package com.newyorktimes.newsapp.view.listeners

/****
 * Back button handler interface. Add/remove listener functionality
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
interface BackButtonHandlerListener {
    fun addBackpressListener(listner: BackPressListener)
    fun removeBackpressListener(listner: BackPressListener)
}