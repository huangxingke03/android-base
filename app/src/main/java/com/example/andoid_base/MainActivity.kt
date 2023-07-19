package com.example.andoid_base

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.andoid_base.weather.CityListActivity
import java.util.LinkedList

class MainActivity : AppCompatActivity() {
    var arryList = ArrayList<String>()
    var linkList = LinkedList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener {
            arryList.add("arryList条目1")
            arryList.remove("1111")
            arryList[0]
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            linkList.add("linkList条目1")
            linkList.remove("11111")
            linkList[0]
            startActivity(Intent(this@MainActivity, CityListActivity::class.java))
        }
    }
}