package com.example.common

import android.os.Handler
import android.os.Looper

object HandlerUtils {
    fun mainHandler(): Handler {
        return Handler(Looper.getMainLooper())
    }

    fun mainHandler(looper: Looper): Handler {
        return Handler(looper)
    }
}