package com.sdds.compose.uikit.internal.focusselector

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * CompositionLocal c [FocusSelectorMode]
 */
val LocalFocusSelectorMode = compositionLocalOf<FocusSelectorMode> { FocusSelectorMode.Border() }

/**
 * Режим работы селектора фокуса
 */
@Immutable
sealed class FocusSelectorMode {

    /**
     * Селектор фокуса отсутствует
     */
    object None : FocusSelectorMode()

    /**
     * Селектор в виде обводки вокруг компонента
     *
     * @property borderStroke настройки бордера
     * @property strokePadding отступ бордера от границы компонента
     *
     * @see BorderStroke
     */
    data class Border(
        val borderStroke: BorderStroke = BorderStroke(DEFAULT_STROKE_WIDTH.dp, Color.Gray),
        val strokePadding: Dp = DEFAULT_STROKE_PADDING.dp,
    ) : FocusSelectorMode()

    /**
     * Селектор, увеличивающий компонент
     *
     * @property scale на сколько будет увеличен компонент в фокусе
     */
    data class Scale(val scale: Float = DEFAULT_SCALE_FACTOR) : FocusSelectorMode()

    internal val FocusSelectorMode.isEnabled: Boolean
        get() = this !is None

    internal val FocusSelectorMode.isDisabled: Boolean
        get() = !isEnabled

    private companion object {
        const val DEFAULT_SCALE_FACTOR = 1.05f
        const val DEFAULT_STROKE_WIDTH = 2
        const val DEFAULT_STROKE_PADDING = 2
    }
}
