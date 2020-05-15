package com.example.sharedpreferencesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sharedpreferencesexample.sharePref.SharePrefExamp

class SecondActivity : AppCompatActivity() {

    val pref = SharePrefExamp.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        pref.token ="Dasturlash.net"
        val token = pref.token
        Log.d("TTT",token)

        pref.isVisibilIntro = false
        Log.d("TTT",pref.isVisibilIntro.toString())
    }
}
