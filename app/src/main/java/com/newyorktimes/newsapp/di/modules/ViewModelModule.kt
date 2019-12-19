package com.newyorktimes.newsapp.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.newyorktimes.newsapp.architecture.ViewModelFactory
import com.newyorktimes.newsapp.di.key.ViewModelKey
import com.newyorktimes.newsapp.view.fragment.news.NewsListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/****
 * View Model module which provides the viewmodelfactory and viewmodel instances
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NewsListViewModel::class)
    fun bindNewsListViewModel(newsListViewModel: NewsListViewModel): ViewModel

    @Binds
    fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}