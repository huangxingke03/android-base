package com.example.andoid_base

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.ArraySet
import android.widget.Button
import androidx.annotation.RequiresApi
import com.example.andoid_base.weather.CityListActivity
import com.example.base_utils.JsonUtils
import com.example.base_utils.LogUtils
import java.util.Hashtable
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.LinkedList
import java.util.TreeMap
import java.util.concurrent.ConcurrentHashMap

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.M)
    var arrySet = ArraySet<String>()

    var linkHashSet = LinkedHashSet<String>()

    //    var arryList = arrayListOf(1, 2, 3, 4, 5, 6)
    var arryList = ArrayList<String>()
    var linkList = LinkedList<String>()


    var hashMap = HashMap<String, String>()
    var hashtable = Hashtable<String, String>()
    var concurrentHashMap = ConcurrentHashMap<String, String>()
    var linkHashMap = LinkedHashMap<String, String>()

    var treeMap = TreeMap<String, String>()

    var array1 = intArrayOf(1, 2, 3, 4, 5, 6)

    var array2 = intArrayOf(5, 6, 7, 8)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener {
            arryList.add("arryList条目1")
            arryList.add("arryList条目2")
            arryList.add("arryList条目3")
            arryList.add("arryList条目4")
            arryList.remove("arryList条目3")
            arryList[0]

        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            linkList.add("linkList条目1")
            linkList.add("linkList条目2")
            linkList.add("linkList条目3")
            linkList.add("linkList条目4")
            linkList.remove("linkList条目2")
            linkList[2]

        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            hashMap.put("hashMapKey1", "hashMapValue1")
            hashMap.put("hashMapKey2", "hashMapValue2")
            hashMap.put("hashMapKey3", "hashMapValue3")
            val hashMapValue1 = hashMap.get("hashMapKey3")
            val hashMapValue2 = hashMap.getValue("hashMapKey2")

            linkHashMap.put("linkHashMapKey1", "linkHashMapValue1")
//            val value1 = hashMap["hashMapKey1"]

//
//            hashMap.remove("hashMapValue3")
        }
        findViewById<Button>(R.id.button4).setOnClickListener {


        }
    }
}