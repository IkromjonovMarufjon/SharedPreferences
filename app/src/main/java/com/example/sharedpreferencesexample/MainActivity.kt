package com.example.sharedpreferencesexample

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sharedpreferencesexample.sharePref.SharePrefSecond

class MainActivity : AppCompatActivity() {

    lateinit var  pref : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pref = this.getSharedPreferences("example.xml", Context.MODE_PRIVATE)
        pref.registerOnSharedPreferenceChangeListener { sharedPreferences, key ->
            // ...
        }

        /*val pref = this.getSharedPreferences("example.xml", Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putInt("kalitInt",10)
        editor.putString("kalitString","Dasturlash.net")
        editor.apply()*/


        /*SharePrefSecond.getInstance().apply {
            saveToken("Dasturlash.net")
            Log.d("TTT",getToken())
        }*/
    }

    override fun onDestroy() {
        super.onDestroy()
        pref.unregisterOnSharedPreferenceChangeListener { sharedPreferences, key ->
            // ...
        }
    }
}

/*




    }
}
*/

