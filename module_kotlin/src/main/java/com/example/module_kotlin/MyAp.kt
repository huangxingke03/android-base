package com.example.module_kotlin

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

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