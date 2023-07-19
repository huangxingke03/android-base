// AidlServerInterface.aidl
package com.example.aidl_server;
import com.example.aidl_server.bean.Product;
import  android.os.Bundle;

// Declare any non-default types here with import statements

interface AidlServerInterface {
       void addProduct(in Product product);
       void addProductWithBundle(in Bundle bundle);
       Product getProduct();
       Product addProductIn(in Product product);
       Product addProductOut(out Product product);
       Product addProductInOut(inout Product product);
       List<Product> getProductList(inout Product product);
}