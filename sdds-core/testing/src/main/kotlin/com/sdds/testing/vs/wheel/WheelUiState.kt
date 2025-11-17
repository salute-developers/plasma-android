package com.sdds.testing.vs.wheel

import com.sdds.testing.vs.UiState
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
 * @property hasInfiniteScroll Флаг бесконечной прокрутки.
 * @property controlsDisplayMode Режим отображения кнопок управления
 */
data class WheelUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val itemLabel: String = "Label",
    val itemTextAfter: String = "",
    val description: String = "",
    val hasControls: Boolean = true,
    val wheelCount: Int = 2,
    val visibleItemsCount: Int = 5,
    val separatorType: WheelSeparatorType = WheelSeparatorType.DOTS,
    val hasInfiniteScroll: Boolean = true,
    val controlsDisplayMode: WheelControlsDisplayMode = WheelControlsDisplayMode.ALWAYS,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Типы разделителей между элементами колеса.
 */
enum class WheelSeparatorType {
    NONE,
    DIVIDER,
    DOTS,
}

/**
 * Преобразует [WheelSeparatorType] в значение, понятное компоненту [Wheel].
 *
 * @return Константа из [Wheel], соответствующая выбранному типу разделителя.
 */
fun WheelSeparatorType.toSeparatorType(): Int {
    return when (this) {
        WheelSeparatorType.NONE -> Wheel.SEPARATOR_TYPE_NONE
        WheelSeparatorType.DIVIDER -> Wheel.SEPARATOR_TYPE_DIVIDER
        WheelSeparatorType.DOTS -> Wheel.SEPARATOR_TYPE_DOTS
    }
}

/**
 * Режим отображения кнопок управления колесом
 */
enum class WheelControlsDisplayMode {
    ALWAYS,
    IF_ACTIVE,
}

/**
 * Преобразует [WheelControlsDisplayMode] в значения, которые поддерживает [Wheel]
 */
fun WheelControlsDisplayMode.toDisplayMode(): Int {
    return when (this) {
        WheelControlsDisplayMode.ALWAYS -> Wheel.CONTROLS_DISPLAY_MODE_ALWAYS
        WheelControlsDisplayMode.IF_ACTIVE -> Wheel.CONTROLS_DISPLAY_MODE_IF_ACTIVE
    }
}
