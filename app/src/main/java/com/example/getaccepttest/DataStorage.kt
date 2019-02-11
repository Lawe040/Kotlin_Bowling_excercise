package com.example.getaccepttest

import android.content.Context

class DataStorage(context: Context) {

    val INT_STORAGE_NAME = "My int Storage"
    val INT_STORAGE_COUNT = "IntCount"
    val storage = context.getSharedPreferences(INT_STORAGE_NAME,Context.MODE_PRIVATE)

    fun getCurrentSum() : Int {
        return storage.getInt(INT_STORAGE_COUNT,0)
    }

    fun setCurrentSum(sum: Int) {

        val editor = storage.edit()
        editor.putInt(INT_STORAGE_COUNT,sum)
        editor.apply()
    }

}