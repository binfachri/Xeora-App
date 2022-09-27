package com.miqdad.xeoraapp.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miqdad.xeoraapp.R

class DzikirAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>) : // constructor untuk mendistribukan data
    RecyclerView.Adapter<DzikirAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // inisialisasi view dari layout row_item_dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvLafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemah: TextView = view.findViewById(R.id.tv_terjemahan)
    }

    // digunakan untuk menampilkan data sesuai dengan view yang ada/
    //sesuai dengan posisi data didalam layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_detail_pagi, parent, false)
    )

    override fun onBindViewHolder(holder: DzikirAdapter.MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvLafaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemah.text = listDzikirDoa[position].terjemah
    }

    override fun getItemCount() = listDzikirDoa.size
}