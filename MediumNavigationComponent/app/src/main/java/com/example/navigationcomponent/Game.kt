package com.example.navigationcomponent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(val name: String, val releaseDate: Int) : Parcelable {
}