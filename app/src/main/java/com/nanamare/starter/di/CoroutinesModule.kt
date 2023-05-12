package com.nanamare.starter.di

import com.nanamare.domain.di.Dispatcher
import com.nanamare.domain.di.Dispatchers.IO
import com.nanamare.domain.di.Dispatchers.Main
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers

@InstallIn(SingletonComponent::class)
@Module
class CoroutinesModule {

    @Dispatcher(IO)
    @Provides
    fun providesIoDispatcher() = Dispatchers.IO

    @Dispatcher(Main)
    @Provides
    fun providesMainImmediateDispatcher() = Dispatchers.Main.immediate
}