package com.sdds.compose.uikit.motion.components.button

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.common.CommonButtonMotionStyle
import com.sdds.compose.uikit.motion.components.common.CommonButtonMotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [ButtonMotionStyle].
 * Используется для доступа к анимационным свойствам Button внутри Compose-иерархии.
 */
val LocalButtonMotionStyle = compositionLocalOf { ButtonMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Button.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface ButtonMotionStyle : CommonButtonMotionStyle {

    /**
     * Анимационное свойство цвета контента, расположенного в начале Button.
     */
    val iconColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в конце Button.
     */
    val spinnerColor: MotionProperty<Color>

    companion object {
        /**
         * Создает билдер для построения [ButtonMotionStyle].
         */
        fun builder(): ButtonMotionStyleBuilder = ButtonMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [ButtonMotionStyle].
 */
@Stable
interface ButtonMotionStyleBuilder : CommonButtonMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    override fun backgroundColor(background: MotionProperty<Brush>): ButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    override fun labelColor(label: MotionProperty<Brush>): ButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    override fun labelStyle(label: MotionProperty<TextStyle>): ButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета value.
     */
    override fun valueColor(value: MotionProperty<Brush>): ButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля value.
     */
    override fun valueStyle(value: MotionProperty<TextStyle>): ButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета иконки.
     */
    fun iconColor(icon: MotionProperty<Brush>): ButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета спиннера.
     */
    fun spinnerColor(spinner: MotionProperty<Color>): ButtonMotionStyleBuilder

    override fun style(): ButtonMotionStyle
}

@Immutable
private class ButtonMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val valueColor: MotionProperty<Brush>,
    override val iconColor: MotionProperty<Brush>,
    override val spinnerColor: MotionProperty<Color>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val valueStyle: MotionProperty<TextStyle>,
) : ButtonMotionStyle {

    class Builder : ButtonMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var label: MotionProperty<Brush>? = null
        private var value: MotionProperty<Brush>? = null
        private var icon: MotionProperty<Brush>? = null
        private var spinner: MotionProperty<Color>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var valueStyle: MotionProperty<TextStyle>? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun labelColor(label: MotionProperty<Brush>) = apply {
            this.label = label
        }

        override fun labelStyle(label: MotionProperty<TextStyle>) = apply {
            this.labelStyle = label
        }

        override fun valueColor(value: MotionProperty<Brush>) = apply {
            this.value = value
        }

        override fun valueStyle(value: MotionProperty<TextStyle>) = apply {
            this.valueStyle = value
        }

        override fun iconColor(icon: MotionProperty<Brush>) = apply {
            this.icon = icon
        }

        override fun spinnerColor(spinner: MotionProperty<Color>) = apply {
            this.spinner = spinner
        }

        override fun style(): ButtonMotionStyle {
            return ButtonMotionStyleImpl(
                backgroundColor = background ?: noMotion(),
                labelColor = label ?: noMotion(),
                valueColor = value ?: noMotion(),
                iconColor = icon ?: noMotion(),
                spinnerColor = spinner ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                valueStyle = valueStyle ?: noMotion(),
            )
        }
    }
}
