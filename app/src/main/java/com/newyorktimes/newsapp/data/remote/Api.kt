package com.newyorktimes.newsapp.data.remote

import com.newyorktimes.newsapp.data.remote.model.NewsListResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path


/****
 * Keep all the REST Apis here
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
interface Api {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/{index}.json")
    fun getPopularNews(@Path("index") index: Int): Observable<NewsListResponse>

}