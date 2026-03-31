package com.sdds.compose.uikit.fs

import com.sdds.compose.uikit.internal.focusselector.FocusSelectorIncreaseScale
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorScaleNone

/**
 * Вспомогательный объект для создания
 * Scale фокус-селектора
 */
object FocusSelectorScales {

    /**
     * Выключает FocusSelectorScale
     */
    fun none(): FocusSelectorScale = FocusSelectorScaleNone

    /**
     * Включает FocusSelectorScale
     * @param scale значение, на которое
     * будет скорректирован размер объекта
     */
    fun byFactor(
        scale: Float = DEFAULT_SCALE_FACTOR,
    ): FocusSelectorScale = FocusSelectorIncreaseScale(scale)
}

private const val DEFAULT_SCALE_FACTOR = 0.05f
