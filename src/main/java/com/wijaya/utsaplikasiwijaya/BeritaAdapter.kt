package com.wijaya.utsaplikasiwijaya

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BeritaAdapter(private val context: Context, private val berita: List<Berita>, val listener: (Berita) -> Unit)
    : RecyclerView.Adapter<BeritaAdapter.BeritaViewHolder>(){
    // Setiap elemen individual dalam daftar ditentukan oleh objek pemegang tampilan. jadi viewholder disini berfungsi sebagai itu
    class BeritaViewHolder(view: View): RecyclerView.ViewHolder(view) {

        // menentukan isi setiap attribut

        val foto = view.findViewById<ImageView>(R.id.img_item)
        val nama = view.findViewById<TextView>(R.id.tvnama)
        val detil = view.findViewById<TextView>(R.id.tvdetil)

        fun bindView(berita: Berita, listener: (Berita) -> Unit){
            foto.setImageResource(berita.foto)
            nama.text = berita.nama
            detil.text = berita.detil
            itemView.setOnClickListener{
                listener(berita)
            }
        }
    }

        // onCreateViewHolder(): RecyclerView memanggil metode ini setiap kali perlu membuat ViewHolder baru. Metode ini membuat serta menginisialisasi ViewHolder dan View-nya yang diatribusikan, tetapi tidak mengisi konten tampilan—ViewHolder belum terikat dengan data tertentu.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaViewHolder {
        return BeritaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_row, parent, false)
        )
    }

    // onBindViewHolder(): RecyclerView memanggil metode ini untuk mengatribusikan ViewHolder dengan data. Metode ini mengambil data yang sesuai dan menggunakan data tersebut untuk mengisi tata letak pemegang tampilan
    override fun onBindViewHolder(holder: BeritaViewHolder, position: Int) {
        holder.bindView(berita[position], listener)
    }

    // getItemCount(): RecyclerView memanggil metode ini untuk mendapatkan ukuran set data. Misalnya, dalam aplikasi buku alamat, ukuran mungkin berupa jumlah total alamat.
    override fun getItemCount(): Int = berita.size
    }