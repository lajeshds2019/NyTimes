package com.newyorktimes.newsapp.schedulers

import androidx.annotation.NonNull
import io.reactivex.Scheduler

/****
 * Scheduler contract interface
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
interface SchedulerContract {

    @NonNull
    fun io(): Scheduler

    @NonNull
    fun ui(): Scheduler
}