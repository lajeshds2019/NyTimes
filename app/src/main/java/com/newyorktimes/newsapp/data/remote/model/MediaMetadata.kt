package com.newyorktimes.newsapp.data.remote.model

import com.google.gson.annotations.SerializedName

/****
 * Media Metadata class
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
data class MediaMetadata(@SerializedName("url") var imageUrl : String? = "",
                         @SerializedName("format") var format: String? = "")