package com.sdds.compose.uikit.motion.components.spinner

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [SpinnerMotionStyle]
 */
val LocalSpinnerMotionStyle = compositionLocalOf { SpinnerMotionStyle.builder().style() }

/**
 * Стиль анимаций [Spinner]
 */
@Stable
interface SpinnerMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимация изменения начального цвета полосы спиннера
     */
    val startColor: MotionProperty<InteractiveColor>

    /**
     * Анимация изменения конечного цвета полосы спиннера
     */
    val endColor: MotionProperty<InteractiveColor>

    companion object {

        /**
         * Возвращает [SpinnerMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): SpinnerMotionStyleBuilder = SpinnerMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [Spinner]
 */
@Stable
interface SpinnerMotionStyleBuilder : MotionStyleBuilder<SpinnerMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun backgroundColor(backgroundColor: MotionProperty<Brush>): SpinnerMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения начального цвета полосы спиннера
     */
    fun startColor(startColor: MotionProperty<InteractiveColor>): SpinnerMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения конечного цвета полосы спиннера
     */
    fun endColor(endColor: MotionProperty<InteractiveColor>): SpinnerMotionStyleBuilder
}

@Immutable
private class SpinnerMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val startColor: MotionProperty<InteractiveColor>,
    override val endColor: MotionProperty<InteractiveColor>,
) : SpinnerMotionStyle {

    class Builder : SpinnerMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var startColor: MotionProperty<InteractiveColor>? = null
        private var endColor: MotionProperty<InteractiveColor>? = null

        override fun backgroundColor(backgroundColor: MotionProperty<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun startColor(startColor: MotionProperty<InteractiveColor>) = apply {
            this.startColor = startColor
        }

        override fun endColor(endColor: MotionProperty<InteractiveColor>) = apply {
            this.endColor = endColor
        }

        override fun style(): SpinnerMotionStyle {
            return SpinnerMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
                startColor = startColor ?: noMotion(),
                endColor = endColor ?: noMotion(),
            )
        }
    }
}
