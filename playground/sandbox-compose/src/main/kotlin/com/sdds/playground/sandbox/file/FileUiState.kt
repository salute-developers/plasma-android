package com.sdds.playground.sandbox.file

import com.sdds.compose.uikit.FileActionPlacement
import com.sdds.playground.sandbox.core.compose.UiState

internal data class FileUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "Label",
    val description: String = "Description",
    val isLoading: Boolean = false,
    val hasContentStart: Boolean = true,
    val contentType: FileContentType = FileContentType.Icon,
    val actionPlacement: FileActionPlacement = FileActionPlacement.End,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

internal enum class FileContentType {
    Icon, Image
}
