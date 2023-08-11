package com.example.aidl_server.bean

import android.os.Parcel
import android.os.Parcelable

data class Product(
    var productName: String? = "Product",
    var productPrice: Int = 0
) : Parcelable {
    constructor(parcel: Parcel) : this() {
        readFromParcel(parcel)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(productName)
        parcel.writeInt(productPrice)
    }

    fun readFromParcel(parcel: Parcel) {
        productName = parcel.readString() ?: ""
        productPrice = parcel.readInt()
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }
}