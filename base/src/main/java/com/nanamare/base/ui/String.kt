package com.nanamare.base.ui

import androidx.compose.ui.graphics.Color
import java.io.IOException

val String.toColor
    @Throws(IOException::class)
    get() = Color(android.graphics.Color.parseColor(this))