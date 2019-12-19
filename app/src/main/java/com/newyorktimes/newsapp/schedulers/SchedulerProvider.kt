package com.newyorktimes.newsapp.schedulers

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/****
 * Android Scheduler provider for executing the asynchronous operations
 * Author: Lajesh Dineshkumar
 * Created on: 18/12/19
 * Modified on: 18/12/19
 *****/
class SchedulerProvider : SchedulerContract {

    override fun io(): Scheduler {
        return Schedulers.newThread()
    }

    override fun ui(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

}