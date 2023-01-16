package com.ersubhadip.retrofitbestpractices.data

sealed class NetworkResults<T : Any> {
    class SUCCESS<T : Any>(val data: T) : NetworkResults<T>() {}
    class FAILURE<T : Any>(val e: Int, val message: String?) : NetworkResults<T>() {}
    class LOADING<T : Any> : NetworkResults<T>() {}
}
