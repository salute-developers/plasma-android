package com.sdds.compose.uikit.motion.components.progressbar

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [ProgressBarMotionStyle]
 */
val LocalProgressBarMotionStyle = compositionLocalOf { ProgressBarMotionStyle.builder().style() }

/**
 * Стиль анимаций [ProgressBar]
 */
@Stable
interface ProgressBarMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти индикатора
     */
    val indicatorColor: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [ProgressBarMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): ProgressBarMotionStyleBuilder = ProgressBarMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [ProgressBar]
 */
@Stable
interface ProgressBarMotionStyleBuilder : MotionStyleBuilder<ProgressBarMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun backgroundColor(backgroundColor: MotionProperty<Brush>): ProgressBarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета индикатора
     */
    fun indicatorColor(indicatorColor: MotionProperty<Brush>): ProgressBarMotionStyleBuilder
}

@Immutable
private class ProgressBarMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val indicatorColor: MotionProperty<Brush>,
) : ProgressBarMotionStyle {

    class Builder : ProgressBarMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var indicatorColor: MotionProperty<Brush>? = null

        override fun backgroundColor(backgroundColor: MotionProperty<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun indicatorColor(indicatorColor: MotionProperty<Brush>) = apply {
            this.indicatorColor = indicatorColor
        }

        override fun style(): ProgressBarMotionStyle {
            return ProgressBarMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
                indicatorColor = indicatorColor ?: noMotion(),
            )
        }
    }
}
