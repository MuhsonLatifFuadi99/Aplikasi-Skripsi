package com.muhsonlatiffuadi.tpaarrahmah.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.muhsonlatiffuadi.tpaarrahmah.R
import com.muhsonlatiffuadi.tpaarrahmah.model.PesertaDidik

class DataPesertaDidikAdapter (private val listName: List<String>

) : RecyclerView.Adapter<DataPesertaDidikAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from( parent.context ). inflate( R.layout.item_data, parent, false)
    )

    override fun onBindViewHolder(holder: DataPesertaDidikAdapter.ViewHolder, position: Int) {
        holder.text.text = listName[position]

    }

    override fun getItemCount() = listName.size

    class ViewHolder(view: View): RecyclerView.ViewHolder( view ) {
        val text = view.findViewById<TextView>(R.id.rvDataPesertaDidik)

    }

}
