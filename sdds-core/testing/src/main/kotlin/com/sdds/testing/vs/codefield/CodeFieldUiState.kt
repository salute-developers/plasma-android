package com.sdds.testing.vs.codefield

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.CodeField
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента CodeField
 * @property variant стиль варианта компонента
 * @property errorItem обработка некорректного символа
 * @property codeLength длина кода
 * @property hidden скрытие введенных символов
 * @property caption подпись
 * @property captionAlignment выравнивание подписи
 * @see CodeField.CaptionAlignment
 */
@Parcelize
data class CodeFieldUiState(
    override val variant: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 6,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val captionAlignment: CodeField.CaptionAlignment = CodeField.CaptionAlignment.Center,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
