package android.smartbattery.myapplication

import android.app.Application

class SampleApp : Application() {
    companion object {
        lateinit var instance: Application
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}