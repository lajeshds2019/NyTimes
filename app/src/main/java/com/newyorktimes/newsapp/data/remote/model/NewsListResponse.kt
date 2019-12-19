package com.newyorktimes.newsapp.data.remote.model

import com.google.gson.annotations.SerializedName

/****
 * Data Model class which represents the list of news
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
data class NewsListResponse(@SerializedName("results") var popularNewsList : ArrayList<NewsItem>? = ArrayList())