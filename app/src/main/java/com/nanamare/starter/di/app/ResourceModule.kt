package com.nanamare.starter.di.app

import android.content.Context
import com.nanamare.starter.provider.ResourceProvider
import com.nanamare.starter.provider.ResourceProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ResourceModule {

    @Singleton
    @Provides
    fun provideResource(@ApplicationContext context: Context): ResourceProvider =
        ResourceProviderImpl(context)

}