package com.nanamare.data.model.mapper

import com.nanamare.data.model.TestResponse
import com.nanamare.domain.model.TestModel

fun TestResponse.toDomain() = TestModel(statusCode, description)