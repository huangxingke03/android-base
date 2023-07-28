package com.example.andoid_base.weather

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import com.example.andoid_base.R
import com.example.andoid_base.weather.data.WeatherInfo
import com.example.andoid_base.weather.net.RetrofitManager
import com.example.andoid_base.weather.net.service.SearchWeather
import com.example.base_utils.LogUtils
import com.google.gson.Gson
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers


class CityListActivity : AppCompatActivity() {
    var data = arrayListOf("北京", "上海", "广州", "深圳", "沈阳","河南")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_list)
        val city_list = findViewById<ListView>(R.id.city_list)
        city_list.adapter =
            ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                data
            )
        city_list.setOnItemClickListener { parent, view, position, id ->
            val searchWeather =
                RetrofitManager().getService(SearchWeather::class.java).searchWeather1(
                    "60914564e8cb7ca7b497530783a34882", when (position) {
                        0 -> "110000"
                        1 -> "310000"
                        2 -> "440100"
                        3 -> "440300"
                        else -> "210100"
                    }
                );
            searchWeather.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<WeatherInfo> {
                    override fun onSubscribe(d: Disposable?) {
                        LogUtils.d("----------onSubscribe------")
                    }

                    override fun onNext(value: WeatherInfo?) {
                        LogUtils.d("天气信息---${Gson().toJson(value)}")
                        showWeather(this@CityListActivity, value,data[position])
                    }

                    override fun onError(e: Throwable?) {
                        LogUtils.d("----------onError---${e?.message}------")
                    }

                    override fun onComplete() {
                        LogUtils.d("----------onComplete------")
                    }
                })
        }
    }

    fun showWeather(context: Context, weatherInfoString: WeatherInfo?, cityName: String) {
        val builder = AlertDialog.Builder(context)
        builder.setMessage(Gson().toJson(weatherInfoString?.lives?.get(0) ?: ""))
        builder.setTitle("$cityName 天气")
        val dialog = builder.create()
        dialog.show()
    }
}