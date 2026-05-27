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
 * CompositionLocal, предоставляющий текущий [IconButtonMotionStyle].
 * Используется для доступа к анимационным свойствам Button внутри Compose-иерархии.
 */
val LocalIconButtonMotionStyle = compositionLocalOf { IconButtonMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Button.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface IconButtonMotionStyle : ButtonMotionStyle {

    companion object {
        /**
         * Создает билдер для построения [IconButtonMotionStyle].
         */
        fun builder(): IconButtonMotionStyleBuilder = IconButtonMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [IconButtonMotionStyle].
 */
@Stable
interface IconButtonMotionStyleBuilder : ButtonMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    override fun backgroundColor(background: MotionProperty<Brush>): IconButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета иконки.
     */
    override fun iconColor(icon: MotionProperty<Brush>): IconButtonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета спиннера.
     */
    override fun spinnerColor(spinner: MotionProperty<Color>): IconButtonMotionStyleBuilder

    override fun style(): IconButtonMotionStyle
}

@Immutable
private class IconButtonMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val valueColor: MotionProperty<Brush>,
    override val iconColor: MotionProperty<Brush>,
    override val spinnerColor: MotionProperty<Color>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val valueStyle: MotionProperty<TextStyle>,
) : IconButtonMotionStyle {

    class Builder : IconButtonMotionStyleBuilder {
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

        override fun style(): IconButtonMotionStyle {
            return IconButtonMotionStyleImpl(
                backgroundColor = background ?: noMotion(),
                labelColor = noMotion(),
                valueColor = noMotion(),
                iconColor = icon ?: noMotion(),
                spinnerColor = spinner ?: noMotion(),
                labelStyle = noMotion(),
                valueStyle = noMotion(),
            )
        }
    }
}
