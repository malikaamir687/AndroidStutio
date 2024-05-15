package com.example.lazy.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Contact(
   @DrawableRes val picId: Int,
   @StringRes val nameId: Int,
   val messageId: String,
  val phoneId: String

   )
