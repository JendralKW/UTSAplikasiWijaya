package com.wijaya.utsaplikasiwijaya

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

// mendeklarasikan setiap attribut yaitu foto, nama , dan detil.
// Parcelable adalah Antarmuka Android-saja. Ini memungkinkan pengembang untuk membuat serial kelas sehingga propertinya dengan mudah ditransfer dari satu aktivitas ke aktivitas lainnya.

@Parcelize
data class Berita(
    val foto: Int,
    val nama: String,
    val detil: String
) : Parcelable
