package com.newyorktimes.newsapp.view.listeners

/****
 * Back press listener for handling back navigation in activity/fragments
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
interface BackPressListener {
    fun onBackPress(): Boolean
}