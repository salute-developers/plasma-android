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
 * @property enabled возможность взаимодействия с компонентом
 * @property captionAlignment выравнивание подписи
 * @see CodeField.CaptionAlignment
 * @property charValidateBehavior сценарий обработки некорректного символа
 * @property codeValidateBehavior сценарий обработки некорректного кода
 */
@Parcelize
data class CodeFieldUiState(
    override val variant: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 6,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val enabled: Boolean = true,
    val captionAlignment: CodeField.CaptionAlignment = CodeField.CaptionAlignment.Center,
    val charValidateBehavior: CodeField.CharErrorBehavior = CodeField.CharErrorBehavior.Remove,
    val codeValidateBehavior: CodeField.CodeErrorBehavior = CodeField.CodeErrorBehavior.Remove,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
