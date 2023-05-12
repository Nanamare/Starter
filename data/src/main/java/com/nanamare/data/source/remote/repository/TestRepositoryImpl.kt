package com.nanamare.data.source.remote.repository

import com.nanamare.data.model.mapper.toDomain
import com.nanamare.data.source.remote.TestApi
import com.nanamare.domain.repository.TestRepository
import retrofit2.await
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(private val testApi: TestApi) : TestRepository {

    override suspend fun requestTest() = testApi.requestTest().await().toDomain()

}