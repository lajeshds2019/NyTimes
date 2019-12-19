package com.newyorktimes.newsapp.di.components

import android.app.Application
import com.newyorktimes.newsapp.NYTimesApplication
import com.newyorktimes.newsapp.di.modules.ActivityBuilderModule
import com.newyorktimes.newsapp.di.modules.AppModule
import com.newyorktimes.newsapp.di.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/****
 * Application Component
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        NetworkModule::class,
        ActivityBuilderModule::class]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(nyTimesApplication: NYTimesApplication)
}