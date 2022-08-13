package com.muhsonlatiffuadi.tpaarrahmah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhsonlatiffuadi.tpaarrahmah.adapter.PesertaDidikAdapter
import com.muhsonlatiffuadi.tpaarrahmah.api.RetrofitClient
import com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru.DataItem
import com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru.ResponsePesertaDidik

import kotlinx.android.synthetic.main.activity_data_peserta_didik.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataPesertaDidikActivity : AppCompatActivity() {


    private var arraylist = ArrayList<DataItem>()

    private lateinit var pesertaDidikAdapter: PesertaDidikAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_peserta_didik)

        // code: Nama "title" untuk di barnya
        //supportActionBar!!.title = "Data Peserta Didik"

        //Untuk menampilkan kembali di atas bar
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        pesertaDidikAdapter = PesertaDidikAdapter( arraylist)

        rvDataPesertaDidik.setHasFixedSize(true)
        rvDataPesertaDidik.layoutManager = LinearLayoutManager(this)


       dataFromApi()



    }

    private fun dataFromApi() {

        rvDataPesertaDidik.setHasFixedSize(true)
        rvDataPesertaDidik.layoutManager = LinearLayoutManager(this)

        RetrofitClient.endpoint.getPesertaDidik().enqueue(object : Callback<ResponsePesertaDidik>{
            override fun onResponse(
                call: Call<ResponsePesertaDidik>,
                response: Response<ResponsePesertaDidik>
            ) {

                val responsePesertaDidik = response.body()?.data
                responsePesertaDidik?.let { arraylist.addAll(it) }


                val adapter = PesertaDidikAdapter(arraylist)
                rvDataPesertaDidik.adapter= adapter
//                tvResponseCode.text = responsePesertaDidik.toString()
//                val myToast = Toast.makeText(applicationContext,""+response.body(),Toast.LENGTH_SHORT)
//                myToast.show()
            }

            override fun onFailure(call: Call<ResponsePesertaDidik>, t: Throwable) {

                val myToast = Toast.makeText(applicationContext,"toast message with gravity"+t,Toast.LENGTH_SHORT)
                myToast.show()

            }

        })
    }


    //Untuk mengeksekusi tombol kembali di atas bar
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

}



