package com.example.aidl_server.service

import android.app.Service
import android.content.Intent
import android.os.Bundle
import android.os.IBinder
import com.example.aidl_server.AidlServerInterface
import com.example.aidl_server.bean.Product

class AidlService : Service() {
    private var bind = object : AidlServerInterface.Stub() {
        override fun addProduct(product: Product?) {
            TODO("Not yet implemented")
        }

        override fun addProductWithBundle(bundle: Bundle?) {
            TODO("Not yet implemented")
        }

        override fun getProduct(): Product {
            TODO("Not yet implemented")
        }

        override fun addProductIn(product: Product?): Product {
            TODO("Not yet implemented")
        }

        override fun addProductOut(product: Product?): Product {
            TODO("Not yet implemented")
        }

        override fun addProductInOut(product: Product?): Product {
            TODO("Not yet implemented")
        }

        override fun getProductList(product: Product?): MutableList<Product> {
            TODO("Not yet implemented")
        }

    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}