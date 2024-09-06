package com.sdds.playground.sandbox.textfield

import androidx.annotation.StyleRes
import com.sdds.playground.sandbox.R
import com.sdds.uikit.TextField

/**
 * Состояние [TextField]
 * @property variant стиль варианта компонента
 * @property state состояние поля
 * @property labelType тип заголовка
 * @property labelText текст заголовка
 * @property placeholderText текст-заглушка
 * @property captionText текст-подпись
 * @property icon иконка слева
 * @property action иконка справа
 * @property enabled включен ли компонент
 * @property readOnly режим "только для чтения"
 */
internal data class TextFieldUiState(
    val variant: TextFieldVariant = TextFieldVariant.TextFieldL,
    val state: TextField.FieldState = TextField.FieldState.Default,
    val labelType: TextField.LabelType = TextField.LabelType.Outer,
    val labelText: String = "Label",
    val placeholderText: String = "Placeholder",
    val captionText: String = "Caption",
    val icon: Boolean = true,
    val action: Boolean = true,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
)

/**
 * Стиль варианта компонента [TextField]
 * @property styleRes ресурс стиля варианта
 */
internal enum class TextFieldVariant(@StyleRes val styleRes: Int) {
    TextFieldL(R.style.Theme_Sandbox_ComponentOverlays_TextFieldL),
    TextFieldM(R.style.Theme_Sandbox_ComponentOverlays_TextFieldM),
    TextFieldS(R.style.Theme_Sandbox_ComponentOverlays_TextFieldS),
    TextFieldXS(R.style.Theme_Sandbox_ComponentOverlays_TextFieldXS),
}
