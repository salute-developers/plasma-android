package com.sdds.testing.vs.textfield

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.TextField
import kotlinx.parcelize.Parcelize

/**
 * Состояние [TextField]
 * @property variant стиль варианта компонента
 * @property colorVariant цветовое состояние поля
 * @property labelText текст заголовка
 * @property valueText текст значения
 * @property placeholderText текст-заглушка
 * @property captionText текст-подпись
 * @property counterText текст счетчика
 * @property icon иконка слева
 * @property action иконка справа
 * @property enabled включен ли компонент
 * @property readOnly режим "только для чтения"
 * @property hasChips режим поддержки чипов
 * @property chipData данные для чипов
 * @property prefix префикс
 * @property suffix суффикс
 */
@Parcelize
data class TextFieldUiState(
    override val variant: String = "",
    override val appearance: String = "",
    override val colorVariant: String = "",
    val labelText: String = "Label",
    val placeholderText: String = "Placeholder",
    val valueText: String? = null,
    val captionText: String = "Caption",
    val counterText: String = "Counter",
    val icon: Boolean = true,
    val action: Boolean = true,
    val enabled: Boolean = true,
    val readOnly: Boolean = false,
    val hasChips: Boolean = false,
    val chipData: List<ExampleChipData> = emptyList(),
    val prefix: String? = "TB",
    val suffix: String? = "TA",
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }

    override fun updateColorVariant(colorVariant: String): UiState {
        return copy(colorVariant = colorVariant)
    }
}

/**
 * Пример данных для чипа
 * @property text текст чипа
 */
@Parcelize
data class ExampleChipData(
    val text: String,
) : Parcelable
