package com.sdds.testing.vs.codeinput

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.CodeField
import kotlinx.parcelize.Parcelize

/**
 * Состояние компонента CodeInput
 * @property variant стиль варианта компонента
 * @property errorItem обработка некорректного символа
 * @property codeLength длина кода
 * @property hidden скрытие введенных символов
 * @property caption подпись
 * @property enabled возможность взаимодействия с компонентом
 * @property captionAlignment выравнивание подписи
 * @see CodeField.CaptionAlignment
 * @property focusGain включение фокусного состояния у ячейки, на которой остановился ввод
 * @property charValidateBehavior сценарий обработки некорректного символа
 * @property codeValidateBehavior сценарий обработки некорректного кода
 */
@Parcelize
data class CodeInputUiState(
    override val variant: String = "",
    val errorItem: String = "q",
    val codeLength: Int = 6,
    val hidden: Boolean = false,
    val caption: String = "Caption",
    val enabled: Boolean = true,
    val captionAlignment: CodeField.CaptionAlignment = CodeField.CaptionAlignment.Center,
    val focusGain: Boolean = true,
    val charValidateBehavior: CodeField.CharErrorBehavior = CodeField.CharErrorBehavior.Remove,
    val codeValidateBehavior: CodeField.CodeErrorBehavior = CodeField.CodeErrorBehavior.Remove,
) : UiState, Parcelable {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}
