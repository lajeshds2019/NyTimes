package com.newyorktimes.newsapp.view.fragment.news

import androidx.lifecycle.MutableLiveData
import com.newyorktimes.newsapp.viewmodel.BaseViewModel

/****
 * News Item ViewModel
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
class NewsItemViewModel() : BaseViewModel() {

    var newsTitle =  MutableLiveData<String?>()
    var newsAuthors = MutableLiveData<String?>()
    var publishedDate = MutableLiveData<String?>()
    var newsUrl = MutableLiveData<String?>()
    var newsThumbnailUrl = MutableLiveData<String?>()


    constructor(title: String?, authors: String?, date: String?, url: String?, urlImage: String?) : this() {
        newsTitle.value = title
        newsAuthors.value = authors
        publishedDate.value = date
        newsUrl.value = url
        newsThumbnailUrl.value = urlImage
    }

}