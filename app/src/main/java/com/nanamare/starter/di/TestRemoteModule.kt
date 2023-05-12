package com.nanamare.starter.di

import com.nanamare.data.source.remote.TestApi
import com.nanamare.data.source.remote.repository.TestRepositoryImpl
import com.nanamare.domain.repository.TestRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface TestRepositoryModule {

    @Singleton
    @Binds
    fun provideTestRepository(testRepositoryImpl: TestRepositoryImpl): TestRepository

}

@InstallIn(SingletonComponent::class)
@Module
class TestRemoteModule {

    @Provides
    @Singleton
    fun provideTestApi(@Named("retrofit") retrofit: Retrofit): TestApi = retrofit.create()

}
