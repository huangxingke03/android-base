package com.example.aidl_server

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aidl_server.bean.Product
import com.example.base_utils.LogUtils
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayList = ArrayList<String>()
        arrayList.add("001")
        arrayList.add("002")
//        LogUtils.d(arrayList)
        var array= arrayOf("数字001","数组002")
//        LogUtils.d("001","你好")
        val string = String()
    }
}