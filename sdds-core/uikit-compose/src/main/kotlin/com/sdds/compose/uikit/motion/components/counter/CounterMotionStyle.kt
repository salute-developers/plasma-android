package com.sdds.compose.uikit.motion.components.counter

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [CounterMotionStyle]
 */
val LocalCounterMotionStyle = compositionLocalOf { CounterMotionStyle.builder().style() }

/**
 * Стиль анимаций [Counter]
 */
@Stable
interface CounterMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val backgroundBrush: MotionProperty<Brush>

    /**
     * Анимация изменения кисти текста
     */
    val textBrush: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [CounterMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): CounterMotionStyleBuilder = CounterMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [Counter]
 */
@Stable
interface CounterMotionStyleBuilder : MotionStyleBuilder<CounterMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun backgroundBrush(background: MotionProperty<Brush>): CounterMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета текста
     */
    fun textBrush(textColor: MotionProperty<Brush>): CounterMotionStyleBuilder
}

@Immutable
private class CounterMotionStyleImpl(
    override val backgroundBrush: MotionProperty<Brush>,
    override val textBrush: MotionProperty<Brush>,
) : CounterMotionStyle {

    class Builder : CounterMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var textColor: MotionProperty<Brush>? = null
        override fun backgroundBrush(background: MotionProperty<Brush>) = apply {
            this.backgroundColor = background
        }

        override fun textBrush(textColor: MotionProperty<Brush>) = apply {
            this.textColor = textColor
        }

        override fun style(): CounterMotionStyle {
            return CounterMotionStyleImpl(
                backgroundBrush = backgroundColor ?: noMotion(),
                textBrush = textColor ?: noMotion(),
            )
        }
    }
}
