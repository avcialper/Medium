package com.example.mediumviewbinding

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User(val username: String, val isOnline: Boolean): Parcelable {
}