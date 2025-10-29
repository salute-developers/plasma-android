package com.sdds.playground.sandbox.wheel.compose

import com.sdds.compose.uikit.WheelSeparator
import com.sdds.playground.sandbox.core.compose.UiState
import com.sdds.uikit.Wheel

/**
 * Состояние компонента [Wheel].
 *
 * @property variant Вариант отображения.
 * @property itemLabel Заголовок элемента.
 * @property itemTextAfter Текст после значения.
 * @property description Описание колеса.
 * @property hasControls Флаг отображения кнопок управления.
 * @property wheelCount Количество колес.
 * @property visibleItemsCount Количество видимых элементов.
 * @property separatorType Тип разделителя между элементами.
 */
data class WheelUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemLabel: String = "Label",
    val itemTextAfter: String = "",
    val description: String = "",
    val hasControls: Boolean = true,
    val wheelCount: Int = 2,
    val visibleItemsCount: Int = 3,
    val separatorType: WheelSeparator = WheelSeparator.Dots,
) : UiState {

    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}
