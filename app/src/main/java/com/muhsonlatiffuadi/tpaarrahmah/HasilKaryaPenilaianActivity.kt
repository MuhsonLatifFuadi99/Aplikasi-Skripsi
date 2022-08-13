package com.muhsonlatiffuadi.tpaarrahmah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HasilKaryaPenilaianActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var imageView: ImageView

    companion object{
        val IMAGE_REQUEST_CODE =100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_karya_penilaian)


//        // code: Nama untuk di barnya
//        //supportActionBar!!.title = "Hasil Karya"
//
//        //Untuk menampilkan kembali di atas bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//
//        button = findViewById(R.id.bt_image)
//        imageView = findViewById(R.id.imvImage)
//
//        button.setOnClickListener {
//            pickImageGalery()
//            /*Press Alt + Enter*/
        }
    }

//    private fun pickImageGalery() {
//        val intent = Intent(Intent.ACTION_PICK)
//        intent.type = "image/*"
//        startActivityForResult(intent, IMAGE_REQUEST_CODE)
//    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK){
//            imageView.setImageURI(data?.data)
//        }
//    }

//    //Untuk mengeksekusi tombol kembali di atas bar
//    override fun onSupportNavigateUp(): Boolean {
//        finish()
//        return super.onSupportNavigateUp()
//    }
//
//}
