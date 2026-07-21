package com.sdds.plasma.homeds.motion.numberpanel

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
 * CompositionLocal, предоставляющий текущий [NumberPanelMotionStyle].
 * Используется для доступа к анимационным свойствам NumberPanel внутри Compose-иерархии.
 */
val LocalNumberPanelMotionStyle = compositionLocalOf { NumberPanelMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента NumberPanel.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface NumberPanelMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета целой части числа в NumberPanel.
     */
    val valueColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета дробной части числа в NumberPanel.
     */
    val fractionColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета иконки в NumberPanel.
     */
    val iconColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста целой части числа в NumberPanel.
     */
    val valueStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство стиля текста разделительного знака числа в NumberPanel.
     */
    val separatorStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство стиля текста целой части числа в NumberPanel.
     */
    val fractionStyle: MotionProperty<TextStyle>

    companion object {
        /**
         * Создает билдер для построения [NumberPanelMotionStyle].
         */
        fun builder(): NumberPanelMotionStyleBuilder = NumberPanelMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [NumberPanelMotionStyle].
 */
@Stable
interface NumberPanelMotionStyleBuilder : MotionStyleBuilder<NumberPanelMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета целой части числа в NumberPanel.
     */
    fun valueColor(color: MotionProperty<Brush>): NumberPanelMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста целой части числа в NumberPanel.
     */
    fun valueStyle(style: MotionProperty<TextStyle>): NumberPanelMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета дробной части числа в NumberPanel.
     */
    fun fractionColor(color: MotionProperty<Brush>): NumberPanelMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста дробной части числа в NumberPanel.
     */
    fun fractionStyle(style: MotionProperty<TextStyle>): NumberPanelMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста разделительного знака числа в NumberPanel.
     */
    fun separatorStyle(style: MotionProperty<TextStyle>): NumberPanelMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета иконки в NumberPanel.
     */
    fun iconColor(color: MotionProperty<Brush>): NumberPanelMotionStyleBuilder
}

@Immutable
private class NumberPanelMotionStyleImpl(
    override val valueColor: MotionProperty<Brush>,
    override val fractionColor: MotionProperty<Brush>,
    override val valueStyle: MotionProperty<TextStyle>,
    override val fractionStyle: MotionProperty<TextStyle>,
    override val separatorStyle: MotionProperty<TextStyle>,
    override val iconColor: MotionProperty<Brush>,
) : NumberPanelMotionStyle {

    class Builder : NumberPanelMotionStyleBuilder {
        private var valueColor: MotionProperty<Brush>? = null
        private var valueStyle: MotionProperty<TextStyle>? = null
        private var fractionColor: MotionProperty<Brush>? = null
        private var iconColor: MotionProperty<Brush>? = null
        private var fractionStyle: MotionProperty<TextStyle>? = null
        private var separatorStyle: MotionProperty<TextStyle>? = null

        override fun valueColor(color: MotionProperty<Brush>): NumberPanelMotionStyleBuilder = apply {
            this.valueColor = color
        }

        override fun fractionColor(color: MotionProperty<Brush>): NumberPanelMotionStyleBuilder = apply {
            this.fractionColor = color
        }

        override fun iconColor(color: MotionProperty<Brush>): NumberPanelMotionStyleBuilder = apply {
            this.iconColor = color
        }

        override fun valueStyle(style: MotionProperty<TextStyle>): NumberPanelMotionStyleBuilder = apply {
            this.valueStyle = style
        }

        override fun fractionStyle(style: MotionProperty<TextStyle>): NumberPanelMotionStyleBuilder = apply {
            this.fractionStyle = style
        }

        override fun separatorStyle(style: MotionProperty<TextStyle>): NumberPanelMotionStyleBuilder = apply {
            this.separatorStyle = style
        }

        override fun style(): NumberPanelMotionStyle {
            return NumberPanelMotionStyleImpl(
                valueColor = valueColor ?: noMotion(),
                fractionColor = fractionColor ?: noMotion(),
                iconColor = iconColor ?: noMotion(),
                valueStyle = valueStyle ?: noMotion(),
                fractionStyle = fractionStyle ?: noMotion(),
                separatorStyle = separatorStyle ?: noMotion(),
            )
        }
    }
}
