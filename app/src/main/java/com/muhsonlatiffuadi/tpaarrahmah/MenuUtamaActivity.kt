package com.muhsonlatiffuadi.tpaarrahmah

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhsonlatiffuadi.tpaarrahmah.ProfileActivity
import com.muhsonlatiffuadi.tpaarrahmah.databinding.ActivityMenuUtamaBinding

class MenuUtamaActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMenuUtamaBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMenuUtamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("app",Context.MODE_PRIVATE)

        binding.tvTampilNama.text = sharedPreferences.getString("username","Kosong")

        binding.btLogout.setOnClickListener {
            sharedPreferences.edit().clear().commit()
            finish()
        }

        binding.Penilaian.setOnClickListener {
            val i =Intent(this@MenuUtamaActivity,PenilaianAnakDidikActivity::class.java)
            startActivity(i)
        }

        binding.Profile.setOnClickListener {
            val i =Intent(this@MenuUtamaActivity, ProfileActivity::class.java)
            startActivity(i)
        }

        binding.DataPesertaDidik.setOnClickListener {
            val i =Intent(this@MenuUtamaActivity,DataPesertaDidikActivity::class.java)
            startActivity(i)
        }

        binding.Laporan.setOnClickListener {
            val i =Intent(this@MenuUtamaActivity,LaporanActivity::class.java)
            startActivity(i)
        }
    }
}