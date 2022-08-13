package com.muhsonlatiffuadi.tpaarrahmah

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhsonlatiffuadi.tpaarrahmah.databinding.ActivityMenuUtamaBinding
import com.muhsonlatiffuadi.tpaarrahmah.databinding.ActivityPenilaianHarianBinding

class PenilaianHarianActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPenilaianHarianBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPenilaianHarianBinding.inflate(layoutInflater)

        //Untuk menampilkan kembali di atas bar
        supportActionBar!!.title = "Penilaian"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        setContentView(binding.root)

        binding.btCeklis.setOnClickListener {
            val i = Intent(this@PenilaianHarianActivity,CeklisPenilaianActivity::class.java)
            startActivity(i)

        }

        binding.btAnekdot.setOnClickListener {
            val i = Intent(this@PenilaianHarianActivity,AnekdotPenilaianActivity::class.java)
            startActivity(i)
        }

        binding.btHasilKarya.setOnClickListener {
            val i = Intent(this@PenilaianHarianActivity,HasilKaryaPenilaianActivity::class.java)
            startActivity(i)
        }
    }

    //Untuk mengeksekusi tombol kembali di atas bar
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}