package com.muhsonlatiffuadi.tpaarrahmah.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.annotations.SerializedName
import com.muhsonlatiffuadi.tpaarrahmah.DataPersertaDidik.DetailPesertaDidikActivity
import com.muhsonlatiffuadi.tpaarrahmah.DataPesertaDidikActivity
import com.muhsonlatiffuadi.tpaarrahmah.R
import com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru.DataItem
import com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru.ResponsePesertaDidik
import com.muhsonlatiffuadi.tpaarrahmah.model.PesertaDidik
import com.muhsonlatiffuadi.tpaarrahmah.model.PesertaDidikResponse
import kotlinx.android.synthetic.main.activity_data_peserta_didik.view.*
import kotlinx.android.synthetic.main.item_data.view.*
import java.util.*
import kotlin.collections.ArrayList

// adapter untuk menampilkan ReyclerView
class PesertaDidikAdapter( private val list: ArrayList<DataItem>): RecyclerView.Adapter<PesertaDidikAdapter.PesertaDidikViewHolder>(){
//    val array = ArrayList<DataItem>()
    inner class PesertaDidikViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(dataItem: DataItem){
                        with(itemView){

                tvNamaPesertaDidik.text = dataItem.namaLengkap
                            tvnamalembaga.text = dataItem.lembaga.namaLembaga
                            tvagama.text = dataItem.agama.namaAgama
                            tvalamat.text = dataItem.alamat



                            cvitem.setOnClickListener{
                                //Access view by using `it`
                                val intent = Intent(context, DetailPesertaDidikActivity::class.java)
                                intent.putExtra("nama",dataItem.namaLengkap)
                                intent.putExtra("lembaga",dataItem.lembaga.namaLembaga)
                                intent.putExtra("agama",dataItem.agama)
                                intent.putExtra("alamat",dataItem.alamat)

                                context.startActivity(intent)
                            }

               }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PesertaDidikViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return PesertaDidikViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PesertaDidikViewHolder, position: Int) {
        holder.bind(list[position])
    }



}

