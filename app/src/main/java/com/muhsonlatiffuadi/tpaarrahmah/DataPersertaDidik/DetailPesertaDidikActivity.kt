package com.muhsonlatiffuadi.tpaarrahmah.DataPersertaDidik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.muhsonlatiffuadi.tpaarrahmah.R
import kotlinx.android.synthetic.main.activity_detail_peserta_didik.*

class DetailPesertaDidikActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_peserta_didik)

        val bundle: Bundle? = intent.extras
        val nama = bundle?.get("nama")
        val lembaga = bundle?.get("lembaga")
        val agama = bundle?.get("agama")
        val alamat = bundle?.get("alamat")

        tvnama.text = nama.toString()

        val toast = Toast.makeText(this, ""+nama +"\n"+ lembaga, Toast.LENGTH_SHORT)
        toast.show()
    }
}