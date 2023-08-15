package com.example.module_java;


import android.os.Bundle;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.common.content.PagePath;
import com.example.common.ui.ARouterActivity;

@Route(path = PagePath.ModuleJavaPage.MAIN_PAGE)
public class MainActivity extends ARouterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}