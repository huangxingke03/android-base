package com.example.module_kotlin.ui

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.common.content.PagePath
import com.example.common.ui.ARouterActivity
import com.example.common.ui.BaseActivity
import com.example.module_kotlin.R
@Route(path=PagePath.ModuleKotlinPage.FUNCTION_PAGE)
class FunctionActivity : ARouterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_function)
        findViewById<Button>(R.id.bt_click_function).setOnClickListener {
            ARouter.getInstance().build(PagePath.ModuleKotlinPage.TEST_PAGE).navigation()
        }
    }
}