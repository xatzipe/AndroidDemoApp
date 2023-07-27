package com.github.xatzipe.androiddemoapp

import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import com.microsoft.appcenter.distribute.Distribute
import com.microsoft.appcenter.distribute.UpdateTrack

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        Distribute.setUpdateTrack(UpdateTrack.PRIVATE)
        AppCenter.start(
            this,
            BuildConfig.APPCENTER_APP_SECRET,
            Analytics::class.java, Crashes::class.java, Distribute::class.java
        )
    }
}