package com.muhsonlatiffuadi.tpaarrahmah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LaporanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_laporan)
    }
}