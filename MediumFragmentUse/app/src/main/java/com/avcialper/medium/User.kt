package com.avcialper.medium

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class User(val username: String, val password: Int) : Parcelable {

}