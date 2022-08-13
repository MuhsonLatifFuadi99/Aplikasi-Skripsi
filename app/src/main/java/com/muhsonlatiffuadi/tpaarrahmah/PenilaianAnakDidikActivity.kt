package com.muhsonlatiffuadi.tpaarrahmah

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.view.View
import android.view.ViewParent
import android.widget.*
import org.json.JSONException
import org.json.JSONObject
import java.util.ArrayList

class PenilaianAnakDidikActivity : AppCompatActivity() {

    val Katenilai = arrayOf("Pilih Kategori Nilai","Belum Berkembang (BB)","Mulai Berkembang (MB)","Berkembang Sesuai Harapan (BSH)","Berkembang Sangat Baik (BSB)")
    lateinit var katenilai:Spinner

    val Jennilai = arrayOf("Pilih Jenis Nilai","Agama","Kerohanian","Sosial","Moral")
    lateinit var jennilai:Spinner

    val Nilai = arrayOf("Pilih Nilai","20-40","40-60","60-80","80-100")
    lateinit var nilai:Spinner

    val Subtema = arrayOf("Pilih Subtema","Sekolahku","Minumanku","Makananku","Kebersihan")
    lateinit var subtema:Spinner

    val Thakademik = arrayOf("Pilih Thakademik","2020/2021","2021/2022","2022/2023")
    lateinit var thakademik:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penilaian_anak_didik)

        // code: Nama untuk di barnya
        supportActionBar!!.title = "Penilaian Anak Didik"

        //Untuk menampilkan kembali di atas bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

//        val spinner = findViewById<Spinner>(R.id.KategoriNilai)

        katenilai = findViewById<Spinner>(R.id.KategoriNilai)
        spinnerkatenilai()

        jennilai = findViewById<Spinner>(R.id.JenisNilai)
        spinnerjennilai()

        nilai = findViewById<Spinner>(R.id.SpinnerNilai)
        spinnernilai()

        subtema = findViewById<Spinner>(R.id.SpinnerSubtema)
        spinnersubtema()

        thakademik = findViewById<Spinner>(R.id.SpinnerTahunAkademik)
        spinnerthakademik()
    }

        //koding awal coba
//        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Katenilai)
//        spinner.adapter = arrayAdapter
//        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
////                Toast.makeText(applicationContext,""+Katenilai[position],Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//
//            }
//
//        }

//    }


    private fun spinnerjennilai() {
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Jennilai)
        jennilai.adapter = arrayAdapter
        jennilai.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                Toast.makeText(applicationContext,""+Katenilai[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

    private fun spinnerkatenilai() {
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Katenilai)
        katenilai.adapter = arrayAdapter
        katenilai.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                Toast.makeText(applicationContext,""+Katenilai[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }


    private fun spinnernilai() {
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Nilai)
        nilai.adapter = arrayAdapter
        nilai.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                Toast.makeText(applicationContext,""+Katenilai[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

    private fun spinnersubtema() {
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Subtema)
        subtema.adapter = arrayAdapter
        subtema.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                Toast.makeText(applicationContext,""+Katenilai[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }


    private fun spinnerthakademik() {
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,Thakademik)
        thakademik.adapter = arrayAdapter
        thakademik.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                Toast.makeText(applicationContext,""+Katenilai[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }


    //Untuk mengeksekusi tombol kembali di atas bar
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}