package com.example.module_home.ui.debug

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.example.module_utils.BuildConfig

class MyAp:Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}