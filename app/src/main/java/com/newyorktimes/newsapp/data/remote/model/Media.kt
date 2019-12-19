package com.newyorktimes.newsapp.data.remote.model

import com.google.gson.annotations.SerializedName

/****
 * Media Data Model
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
data class Media(@SerializedName("media-metadata") var mediaMetadata: ArrayList<MediaMetadata>? = ArrayList())
