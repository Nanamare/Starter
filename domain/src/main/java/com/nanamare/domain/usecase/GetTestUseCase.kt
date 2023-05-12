package com.nanamare.domain.usecase

import com.nanamare.domain.di.Dispatcher
import com.nanamare.domain.di.Dispatchers.IO
import com.nanamare.domain.model.TestModel
import com.nanamare.domain.repository.TestRepository
import com.nanamare.domain.usecase.base.NonParamCoroutineUseCase
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class GetTestUseCase @Inject constructor(
    private val testRepository: TestRepository,
    @Dispatcher(IO) private val dispatcher: CoroutineDispatcher
) : NonParamCoroutineUseCase<TestModel>(dispatcher) {

    override suspend fun execute() = testRepository.requestTest()

}