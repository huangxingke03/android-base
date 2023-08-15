package com.example.andoid_base.handle

import android.os.Handler
import android.os.Looper
import android.os.Message
import com.example.common.LogUtils

class Handle2(looper: Looper) : Handler(looper) {
    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        LogUtils.d("-----------Handle2------------${msg.what}")
    }
}