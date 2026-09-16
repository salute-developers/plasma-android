package com.sdds.compose.uikit.motion.components.select

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * Стиль переходов SelectItem по умолчанию. Все свойства используют noMotion().
 */
val LocalSelectItemMotionStyle = compositionLocalOf { SelectItemMotionStyle.builder().style() }

/**
 * Переходы заливок [com.sdds.compose.uikit.SelectItem].
 * Форма и размеры переключаются без интерполяции.
 * Вложенные компоненты используют собственные стили переходов.
 */
@Stable
interface SelectItemMotionStyle : MotionStyle {
    /**
     * Анимационное свойство заливки фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство заливки иконки.
     */
    val iconColor: MotionProperty<Brush>

    companion object {
        /**
         * Создаёт билдер стиля переходов.
         */
        fun builder(): SelectItemMotionStyleBuilder = DefaultSelectItemMotionStyle.Builder()
    }
}

/**
 * Билдер переходов SelectItem. Незаданные свойства используют noMotion().
 */
@Stable
interface SelectItemMotionStyleBuilder : MotionStyleBuilder<SelectItemMotionStyle> {
    /**
     * Устанавливает переход заливки фона.
     */
    fun backgroundColor(backgroundColor: MotionProperty<Brush>): SelectItemMotionStyleBuilder

    /**
     * Устанавливает переход заливки иконки.
     */
    fun iconColor(iconColor: MotionProperty<Brush>): SelectItemMotionStyleBuilder

    override fun style(): SelectItemMotionStyle
}

@Immutable
private class DefaultSelectItemMotionStyle(
    override val backgroundColor: MotionProperty<Brush>,
    override val iconColor: MotionProperty<Brush>,
) : SelectItemMotionStyle {
    class Builder : SelectItemMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush> = noMotion()
        private var iconColor: MotionProperty<Brush> = noMotion()

        override fun backgroundColor(backgroundColor: MotionProperty<Brush>): SelectItemMotionStyleBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun iconColor(iconColor: MotionProperty<Brush>): SelectItemMotionStyleBuilder = apply {
            this.iconColor = iconColor
        }

        override fun style(): SelectItemMotionStyle = DefaultSelectItemMotionStyle(
            backgroundColor = backgroundColor,
            iconColor = iconColor,
        )
    }
}
