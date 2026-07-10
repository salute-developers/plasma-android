package com.sdds.compose.uikit.motion.components.common

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * Описывает анимационные (motion) свойства для элемента
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface CheckableMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета основного текста (label)
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля основного текста (label)
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета описания (description)
     */
    val descriptionColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля описания (description)
     */
    val descriptionStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета бордера
     */
    val toggleBorderColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета фона
     */
    val backgroundColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [CheckableMotionStyle].
         */
        fun builder(): CheckableMotionStyleBuilder = CheckableMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [CheckableMotionStyle].
 */
@Stable
interface CheckableMotionStyleBuilder : MotionStyleBuilder<CheckableMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    fun labelColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    fun labelStyle(style: MotionProperty<TextStyle>): CheckableMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета description.
     */
    fun descriptionColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля description.
     */
    fun descriptionStyle(style: MotionProperty<TextStyle>): CheckableMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета бордера неподвижной части
     */
    fun toggleBorderColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона
     */
    fun backgroundColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder
}

@Immutable
private class CheckableMotionStyleImpl(
    override val labelColor: MotionProperty<Brush>,
    override val descriptionColor: MotionProperty<Brush>,
    override val toggleBorderColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val descriptionStyle: MotionProperty<TextStyle>,
) : CheckableMotionStyle {

    class Builder : CheckableMotionStyleBuilder {
        private var labelColor: MotionProperty<Brush>? = null
        private var descriptionColor: MotionProperty<Brush>? = null
        private var toggleTrackBorderColor: MotionProperty<Brush>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var descriptionStyle: MotionProperty<TextStyle>? = null

        override fun labelColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder = apply {
            this.labelColor = color
        }

        override fun labelStyle(style: MotionProperty<TextStyle>): CheckableMotionStyleBuilder = apply {
            this.labelStyle = style
        }

        override fun descriptionColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder = apply {
            this.descriptionColor = color
        }

        override fun descriptionStyle(style: MotionProperty<TextStyle>): CheckableMotionStyleBuilder = apply {
            this.descriptionStyle = style
        }

        override fun toggleBorderColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder = apply {
            this.toggleTrackBorderColor = color
        }

        override fun backgroundColor(color: MotionProperty<Brush>): CheckableMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun style(): CheckableMotionStyle {
            return CheckableMotionStyleImpl(
                labelColor = labelColor ?: noMotion(),
                descriptionColor = descriptionColor ?: noMotion(),
                toggleBorderColor = toggleTrackBorderColor ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                descriptionStyle = descriptionStyle ?: noMotion(),
            )
        }
    }
}
