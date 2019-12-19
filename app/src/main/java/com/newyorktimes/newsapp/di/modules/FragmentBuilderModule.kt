package com.newyorktimes.newsapp.di.modules

import com.newyorktimes.newsapp.view.fragment.news.NewsListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/****
 * The module which provides the android injection service to fragments.
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
@Suppress("unused")
@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeNewsListFragment(): NewsListFragment
}