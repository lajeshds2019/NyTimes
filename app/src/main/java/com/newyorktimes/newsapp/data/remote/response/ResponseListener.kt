package com.newyorktimes.newsapp.data.remote.response

/****
 * ResponseListener callback which is responsible for giving the API response back to the presentation layer
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
interface ResponseListener<T> {
    fun onStart()
    fun onFinish()
    fun onResponse(result: ApiResponse<T>)
}