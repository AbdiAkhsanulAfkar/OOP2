package com.example.oop_progres.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.firebase.database.IgnoreExtraProperties
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "tabel_siswa")
data class Siswa(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nim: Int,
    val nama: String,
    val alamat: String
): Parcelable
