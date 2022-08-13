package com.muhsonlatiffuadi.tpaarrahmah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.muhsonlatiffuadi.tpaarrahmah.databinding.ActivityCeklisPenilaianBinding

class CeklisPenilaianActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCeklisPenilaianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCeklisPenilaianBinding.inflate(layoutInflater)

        // code: Nama untuk di barnya
        //supportActionBar!!.title = "Penilaian"

        //Untuk menampilkan kembali di atas bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val view = binding.root
        setContentView(view)

        val spinner: Spinner = findViewById(R.id.spinner)

        // Create an ArrayAdapter using the string array and a default spinner layout
        // Buat ArrayAdapter menggunakan larik string dan tata letak spinner default
        ArrayAdapter.createFromResource(
            this,
            R.array.Languages,
            android.R.layout.simple_spinner_item
        ).also { adapter ->

            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }


    //Untuk mengeksekusi tombol kembali di atas bar
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

}