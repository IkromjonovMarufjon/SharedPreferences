package com.example.sharedpreferencesexample.sharePref

import android.content.Context
import android.content.SharedPreferences

/**
 *  Created by Ikromjonov Ma'rufjon
 *  data = 5/14/2020 , time = 9:23
 */

class SharePrefSecond private constructor(context: Context) {

    companion object {
        private const val token = "TOKEN"

        private var ob : SharePrefSecond? = null
        fun init(context: Context) { ob = SharePrefSecond(context) }
        fun getInstance() : SharePrefSecond = ob!!
    }

    private val pref = context.getSharedPreferences("example.xml",Context.MODE_PRIVATE)
    private val editor = pref.edit()

    fun saveToken(st : String) = editor.putString(token,"Dastrulash.net")
    fun getToken() : String = pref.getString(token,"default_value")!!

    fun example(){
        editor.clear()
        editor.remove(token)
    }

}





/*
class SharePref (context: Context) {

    companion object {
        private const val INN = "000129054578"

        private var share : SharePref ?= null
        fun getInstance():SharePref = share!!

        fun init(context: Context){
            share = SharePref(context)
        }
    }
    private var pref = SecurePreferences(context,"2206","local_storage.xml")

    fun saveINN(INNst: String) = pref.edit().putString(INN, INNst).apply()
    fun getINN(): String  = pref.getString(INN, INN)!!

* */