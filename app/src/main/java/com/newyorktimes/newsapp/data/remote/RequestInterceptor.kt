package com.newyorktimes.newsapp.data.remote

import com.newyorktimes.newsapp.common.Configuration
import com.newyorktimes.newsapp.common.Constants
import okhttp3.Interceptor
import okhttp3.Response


/****
 * This okhttp interceptor is responsible for adding the common query parameters and headers
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val originalHttpUrl = originalRequest.url()

        val url = originalHttpUrl.newBuilder()
            .addQueryParameter(Constants.QUERY_PARAM__APIKEY, Configuration.API_KEY)
            .build()

        val request = originalRequest.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}