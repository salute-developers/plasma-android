package com.sdds.testing.vs.codefield

import android.os.Parcelable
import com.sdds.compose.uikit.CodeFieldCaptionAlignment
import com.sdds.testing.vs.UiState
import com.sdds.uikit.CodeField
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента CodeField
 * @property variant стиль варианта компонента
 */
@Parcelize
data class CodeFieldUiState(
    override val variant: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 4,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val captionAlignment: CodeField.CaptionAlignment = CodeField.CaptionAlignment.Center,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
