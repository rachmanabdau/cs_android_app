package com.minjem.cs

import android.app.Application
import timber.log.Timber

class DumiCSAppliation : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}