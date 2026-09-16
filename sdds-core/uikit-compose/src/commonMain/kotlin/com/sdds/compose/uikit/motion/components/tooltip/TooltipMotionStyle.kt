package com.sdds.compose.uikit.motion.components.tooltip

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.Tooltip
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.popover.PopoverMotionStyle
import com.sdds.compose.uikit.motion.components.popover.PopoverMotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [TooltipMotionStyle].
 */
val LocalTooltipMotionStyle = compositionLocalOf { TooltipMotionStyle.builder().style() }

/**
 * Описывает анимационные свойства [Tooltip].
 */
@Stable
interface TooltipMotionStyle : PopoverMotionStyle {

    /**
     * Анимация изменения кисти текста.
     */
    val textColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста.
     */
    val textStyle: MotionProperty<TextStyle>

    /**
     * Анимация изменения кисти контента на старте.
     */
    val contentStartColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета заголовка (title) Cell.
     */

    companion object {
        /**
         * Создает билдер для построения [TooltipMotionStyle].
         */
        fun builder(): TooltipMotionStyleBuilder = TooltipMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [TooltipMotionStyle].
 */
@Stable
interface TooltipMotionStyleBuilder : PopoverMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета текста Tooltip.
     */
    fun textColor(color: MotionProperty<Brush>): TooltipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля title.
     */
    fun textStyle(style: MotionProperty<TextStyle>): TooltipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета контента на старте Tooltip.
     */
    fun contentStartColor(color: MotionProperty<Brush>): TooltipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона Tooltip.
     */
    override fun backgroundColor(background: MotionProperty<Brush>): TooltipMotionStyleBuilder

    override fun style(): TooltipMotionStyle
}

@Immutable
private class TooltipMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val textColor: MotionProperty<Brush>,
    override val contentStartColor: MotionProperty<Brush>,
    override val textStyle: MotionProperty<TextStyle>,
) : TooltipMotionStyle {

    class Builder : TooltipMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var textColor: MotionProperty<Brush>? = null
        private var textStyle: MotionProperty<TextStyle>? = null
        private var contentStartColor: MotionProperty<Brush>? = null

        override fun textColor(color: MotionProperty<Brush>) = apply {
            this.textColor = color
        }

        override fun textStyle(style: MotionProperty<TextStyle>) = apply {
            this.textStyle = style
        }

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.backgroundColor = background
        }

        override fun contentStartColor(color: MotionProperty<Brush>) = apply {
            this.contentStartColor = color
        }

        override fun style(): TooltipMotionStyle = TooltipMotionStyleImpl(
            backgroundColor = backgroundColor ?: noMotion(),
            textColor = textColor ?: noMotion(),
            contentStartColor = contentStartColor ?: noMotion(),
            textStyle = textStyle ?: noMotion(),
        )
    }
}
