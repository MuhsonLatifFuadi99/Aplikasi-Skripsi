package com.muhsonlatiffuadi.tpaarrahmah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//         code: Nama "title" untuk di barnya
        supportActionBar!!.title = "Akun Saya"

//        Untuk menampilkan kembali di atas bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }

    //Untuk mengeksekusi tombol kembali di atas bar
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}