package com.sdds.compose.uikit.motion.components.button

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [LinkButtonMotionStyle].
 * Используется для доступа к анимационным свойствам Button внутри Compose-иерархии.
 */
val LocalLinkButtonMotionStyle = compositionLocalOf { LinkButtonMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Button.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface LinkButtonMotionStyle : ButtonMotionStyle {

    companion object {
        /**
         * Создает билдер для построения [LinkButtonMotionStyle].
         */
        fun builder(): LinkButtonMotionStyleBuilder = LinkButtonMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [LinkButtonMotionStyle].
 */
@Stable
interface LinkButtonMotionStyleBuilder : ButtonMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    override fun backgroundColor(background: MotionProperty<Brush>): LinkButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    override fun labelColor(label: MotionProperty<Brush>): LinkButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    override fun labelStyle(label: MotionProperty<TextStyle>): LinkButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета value.
     */
    override fun valueColor(value: MotionProperty<Brush>): LinkButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля value.
     */
    override fun valueStyle(value: MotionProperty<TextStyle>): LinkButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета иконки.
     */
    override fun iconColor(icon: MotionProperty<Brush>): LinkButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета спиннера.
     */
    override fun spinnerColor(spinner: MotionProperty<Color>): LinkButtonMotionStyleBuilder

    override fun style(): LinkButtonMotionStyle
}

@Immutable
private class LinkButtonMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val valueColor: MotionProperty<Brush>,
    override val iconColor: MotionProperty<Brush>,
    override val spinnerColor: MotionProperty<Color>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val valueStyle: MotionProperty<TextStyle>,
) : LinkButtonMotionStyle {

    class Builder : LinkButtonMotionStyleBuilder {
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

        override fun style(): LinkButtonMotionStyle {
            return LinkButtonMotionStyleImpl(
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
