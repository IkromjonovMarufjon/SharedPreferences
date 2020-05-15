package com.example.sharedpreferencesexample.sharePref

import android.content.Context

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/14/2020 , time = 11:40
 */

class SharePref constructor(context : Context) {
    private val pref = context.getSharedPreferences("example.xml", Context.MODE_PRIVATE)

//    var token : String by StringPreference(pref,"other")
//    var isLoad : Boolean by BooleanPreference(pref,false)
}


