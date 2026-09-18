package com.sdds.compose.uikit.motion.components.progressbar

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [CircularProgressBarMotionStyle]
 */
val LocalCircularProgressBarMotionStyle = compositionLocalOf { CircularProgressBarMotionStyle.builder().style() }

/**
 * Стиль анимаций [CircularProgressBar]
 */
@Stable
interface CircularProgressBarMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val trackColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти индикатора
     */
    val indicatorColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти надписи
     */
    val valueColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти суффикса надписи
     */
    val valueSuffixColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля надписи (value)
     */
    val valueStyle: MotionProperty<TextStyle>

    companion object {

        /**
         * Возвращает [CircularProgressBarMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): CircularProgressBarMotionStyleBuilder = CircularProgressBarMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [CircularProgressBar]
 */
@Stable
interface CircularProgressBarMotionStyleBuilder : MotionStyleBuilder<CircularProgressBarMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun trackColor(backgroundColor: MotionProperty<Brush>): CircularProgressBarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета индикатора
     */
    fun indicatorColor(indicatorColor: MotionProperty<Brush>): CircularProgressBarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета надписи
     */
    fun valueColor(valueColor: MotionProperty<Brush>): CircularProgressBarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета суффикса надписи
     */
    fun valueSuffixColor(valueSuffixColor: MotionProperty<Brush>): CircularProgressBarMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля надписи (value)
     */
    fun valueStyle(style: MotionProperty<TextStyle>): CircularProgressBarMotionStyleBuilder
}

@Immutable
private class CircularProgressBarMotionStyleImpl(
    override val trackColor: MotionProperty<Brush>,
    override val indicatorColor: MotionProperty<Brush>,
    override val valueColor: MotionProperty<Brush>,
    override val valueSuffixColor: MotionProperty<Brush>,
    override val valueStyle: MotionProperty<TextStyle>,
) : CircularProgressBarMotionStyle {

    class Builder : CircularProgressBarMotionStyleBuilder {
        private var trackColor: MotionProperty<Brush>? = null
        private var indicatorColor: MotionProperty<Brush>? = null
        private var valueColor: MotionProperty<Brush>? = null
        private var valueSuffixColor: MotionProperty<Brush>? = null
        private var valueStyle: MotionProperty<TextStyle>? = null

        override fun trackColor(backgroundColor: MotionProperty<Brush>) = apply {
            this.trackColor = backgroundColor
        }

        override fun indicatorColor(indicatorColor: MotionProperty<Brush>) = apply {
            this.indicatorColor = indicatorColor
        }

        override fun valueColor(valueColor: MotionProperty<Brush>) = apply {
            this.valueColor = valueColor
        }

        override fun valueSuffixColor(valueSuffixColor: MotionProperty<Brush>) = apply {
            this.valueSuffixColor = valueSuffixColor
        }

        override fun valueStyle(style: MotionProperty<TextStyle>) = apply {
            this.valueStyle = style
        }

        override fun style(): CircularProgressBarMotionStyle {
            return CircularProgressBarMotionStyleImpl(
                trackColor = trackColor ?: noMotion(),
                indicatorColor = indicatorColor ?: noMotion(),
                valueColor = valueColor ?: noMotion(),
                valueSuffixColor = valueSuffixColor ?: noMotion(),
                valueStyle = valueStyle ?: noMotion(),
            )
        }
    }
}
