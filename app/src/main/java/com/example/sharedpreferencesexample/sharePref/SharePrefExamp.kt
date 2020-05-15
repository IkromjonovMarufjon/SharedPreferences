package com.example.sharedpreferencesexample.sharePref

import android.content.Context
import android.content.SharedPreferences

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/14/2020 , time = 11:04
 */

class SharePrefExamp private constructor(context: Context) {

    companion object {
        private var ob: SharePrefExamp? = null
        fun init(context: Context) {
            ob = SharePrefExamp(context)
        }

        fun getInstance(): SharePrefExamp = ob!!
    }

    private val pref = context.getSharedPreferences("example.xml", Context.MODE_PRIVATE)

    inline fun SharedPreferences.editMe(listener: (SharedPreferences.Editor) -> Unit) {
        val editMe = edit()
        listener.invoke(editMe)
        editMe.apply()
    }

    // token uchun
    var token
        get() = pref.getString("token", "empty")
        set(value) {
            pref.editMe { it.putString("token", value) }
        }

    // Into oynani ishlatish
    var isVisibilIntro
        get() = pref.getBoolean("intro", true)
        set(value) {
            pref.editMe { it.putBoolean("intro", value) }
        }
}

fun SharedPreferences.Editor.put(pair: Pair<String, Any>) {
    val key = pair.first
    val value = pair.second
    when (value) {
        is String -> putString(key, value)
        is Int -> putInt(key, value)
        is Boolean -> putBoolean(key, value)
        is Long -> putLong(key, value)
        is Float -> putFloat(key, value)
        else -> error("faqat primitiv tip bo'lishi kerak")
    }
}