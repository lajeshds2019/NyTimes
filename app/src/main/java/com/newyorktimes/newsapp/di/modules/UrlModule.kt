package com.newyorktimes.newsapp.di.modules

import com.newyorktimes.newsapp.common.Configuration
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/****
 * Url Module
 * Author: Lajesh Dineshkumar
 * Created on: 2019-12-19
 * Modified on: 2019-12-19
 *****/
@Module
class UrlModule {

    @Provides
    @Singleton
    @Named("baseUrl")
    fun provideBaseUrl(): String {
        return Configuration.baseURL
    }
}