package com.example.module_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.common.content.PagePath

@Route(path = PagePath.ModuleKotlinPage.MAIN_PAGE)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.bt_click_main).setOnClickListener {
            ARouter.getInstance().build(PagePath.ModuleKotlinPage.TEST_PAGE).navigation()
        }
    }
}