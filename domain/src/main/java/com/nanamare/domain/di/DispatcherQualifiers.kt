package com.nanamare.domain.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val dispatcher: Dispatchers)

enum class Dispatchers {
    IO, Main
}