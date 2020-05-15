package com.example.sharedpreferencesexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sharedpreferencesexample.sharePref.SharePref

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val sharePref = SharePref(this)

//        sharePref.isLoad = false
//        Log.d("TTT","${sharePref.isLoad}")
//
//        sharePref.token = "Other token"
//        val token = sharePref.token
    }
}
