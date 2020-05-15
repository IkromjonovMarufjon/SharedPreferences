package com.example.sharedpreferencesexample.app

import android.app.Application
import com.example.sharedpreferencesexample.sharePref.SharePrefExamp
import com.example.sharedpreferencesexample.sharePref.SharePrefSecond

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/14/2020 , time = 10:27
 */
 
class App : Application(){

    lateinit var appContext : App
    override fun onCreate() {
        super.onCreate()
        SharePrefSecond.init(this)
        appContext = this
        // boshqa example uchun
        SharePrefExamp.init(this)
    }
}