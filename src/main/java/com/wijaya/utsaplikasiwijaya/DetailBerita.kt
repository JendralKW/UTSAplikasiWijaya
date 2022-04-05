package com.wijaya.utsaplikasiwijaya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailBerita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_berita)

        // membuat button kembali ke rumah
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Intent merupakan mekanisme untuk melakukan sebuah action dan komunikasi antar komponen aplikasi. jadi disini intent menghubungkan mading" atribut jika diklik akan terdapat aksi
    val berita = intent.getParcelableExtra<Berita>(MainActivity.INTENT_PARCELABLE)

    val foto = findViewById<ImageView>(R.id.img_item_photo)
    val nama = findViewById<TextView>(R.id.tv_item_name)
    val detil = findViewById<TextView>(R.id.tv_item_detil)

        foto.setImageResource(berita?.foto!!)
        nama.text = berita.nama
        detil.text = berita.detil

    }

    // mengaktifkan button kembali
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}