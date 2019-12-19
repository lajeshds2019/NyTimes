package com.newyorktimes.newsapp.data.remote.response

import com.google.gson.annotations.SerializedName

/****
 * Data Model class which represents the error response
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
data class ErrorResponse (@SerializedName("errorCode") var errorCode:  String = "",
                          @SerializedName("errorDescription") var errorDescription: String = "")