package android.smartbattery.myapplication.model

import android.smartbattery.myapplication.SampleApp

object AppVersionModel {
    fun getAppVersionName(): String {
        val context = SampleApp.instance
        val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        return packageInfo.versionName
    }
}