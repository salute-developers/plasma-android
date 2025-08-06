package com.sdds.playground.sandbox.loader.compose

import com.sdds.compose.uikit.LoaderType
import com.sdds.playground.sandbox.core.compose.UiState

internal data class LoaderUiState(
    override val variant: String = "",
    val progress: Float = 0.5f,
    val trackEnabled: Boolean = true,
    val loaderType: LoaderType = LoaderType.Progress,
) : UiState {

    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
