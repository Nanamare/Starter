package com.nanamare.starter.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.nanamare.base.util.UiState
import com.nanamare.starter.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.testUiState.onEach { uiState ->
            when (val data = uiState) {
                is UiState.Loading -> Timber.d("Loading invoke")
                is UiState.Error -> Timber.e(data.exception)
                is UiState.Success -> Timber.d(data.toString())
            }
        }.launchIn(lifecycleScope)
    }

}