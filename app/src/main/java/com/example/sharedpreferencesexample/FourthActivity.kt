package com.example.sharedpreferencesexample

import `in`.co.ophio.secure.core.KeyStoreKeyGenerator
import `in`.co.ophio.secure.core.ObscuredPreferencesBuilder
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val key = KeyStoreKeyGenerator.get(application,application.packageName).loadOrGenerateKeys()

        val sharedPreferences = ObscuredPreferencesBuilder()
            .setApplication(application)
            .obfuscateValue(true)
            .obfuscateKey(true)
            .setSharePrefFileName("PREFS_NAME")
            .setSecret(key) //secret key we generated in step 1.
            .createSharedPrefs()

        sharedPreferences.edit().putInt("examp",10).apply()
        val amount = sharedPreferences.getInt("examp",0)
        Log.d("TTT","amount = $amount")


    }
}
