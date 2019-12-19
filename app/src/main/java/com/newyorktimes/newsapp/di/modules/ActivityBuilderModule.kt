package com.newyorktimes.newsapp.di.modules

import com.newyorktimes.newsapp.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/****
 * The module which provides the android injection service to activities
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
@Suppress("unused")
@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    abstract fun contributeMainActivity(): MainActivity
}