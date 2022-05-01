package com.khusinov.fragment_newinstance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()

        val supportFragmentManager = supportFragmentManager
        supportFragmentManager.beginTransaction().add(R.id.container, firstFragment)
            .commit()
    }
}