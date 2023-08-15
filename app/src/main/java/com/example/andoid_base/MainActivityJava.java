package com.example.andoid_base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.common.content.PagePath;

@Route(path = PagePath.AppPage.JAVA_MAIN_PAGE)
public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_java);
    }
}