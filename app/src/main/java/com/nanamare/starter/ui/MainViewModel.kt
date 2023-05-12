package com.nanamare.starter.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nanamare.base.util.UiState
import com.nanamare.base.util.toUiState
import com.nanamare.domain.usecase.GetTestUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getTestUseCase: GetTestUseCase
) : ViewModel() {

    val testUiState = flow {
        emit(getTestUseCase().toUiState())
    }.stateIn(viewModelScope, SharingStarted.Lazily, UiState.Loading)

}