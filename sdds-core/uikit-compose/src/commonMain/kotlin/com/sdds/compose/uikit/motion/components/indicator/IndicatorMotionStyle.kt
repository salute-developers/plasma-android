package com.sdds.compose.uikit.motion.components.indicator

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [IndicatorMotionStyle]
 */
val LocalIndicatorMotionStyle = compositionLocalOf { IndicatorMotionStyle.builder().style() }

/**
 * Стиль анимаций [Indicator]
 */
@Stable
interface IndicatorMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val background: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [IndicatorMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): IndicatorMotionStyleBuilder = IndicatorMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [Indicator]
 */
@Stable
interface IndicatorMotionStyleBuilder : MotionStyleBuilder<IndicatorMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun background(background: MotionProperty<Brush>): IndicatorMotionStyleBuilder
}

@Immutable
private class IndicatorMotionStyleImpl(
    override val background: MotionProperty<Brush>,
) : IndicatorMotionStyle {

    class Builder : IndicatorMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null

        override fun background(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun style(): IndicatorMotionStyle {
            return IndicatorMotionStyleImpl(
                background = background ?: noMotion(),
            )
        }
    }
}
