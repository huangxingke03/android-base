package com.example.aidl_server

import android.app.Application
import com.example.common.LogUtils

class ServerApp : Application() {
    override fun onCreate() {
        super.onCreate()
        LogUtils.init()
    }
}