package com.nanamare.starter.provider

import androidx.annotation.StringRes

interface ResourceProvider {
    fun getString(@StringRes id: Int): String
}