package com.nanamare.domain.repository

import com.nanamare.domain.model.TestModel

interface TestRepository {
    suspend fun requestTest(): TestModel
}