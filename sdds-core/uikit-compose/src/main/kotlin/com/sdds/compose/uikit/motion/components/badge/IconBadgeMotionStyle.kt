package com.sdds.compose.uikit.motion.components.badge

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [IconBadgeMotionStyle].
 * Используется для доступа к анимационным свойствам IconBadge внутри Compose-иерархии.
 */
val LocalIconBadgeMotionStyle = compositionLocalOf { IconBadgeMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента IconBadge.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface IconBadgeMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета фона IconBadge.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в начале IconBadge.
     */
    val startContentColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [IconBadgeMotionStyle].
         */
        fun builder(): IconBadgeMotionStyleBuilder = IconBadgeMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [IconBadgeMotionStyle].
 */
@Stable
interface IconBadgeMotionStyleBuilder : MotionStyleBuilder<IconBadgeMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(background: MotionProperty<Brush>): IconBadgeMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    fun startContentColor(startContent: MotionProperty<Brush>): IconBadgeMotionStyleBuilder
}

@Immutable
private class IconBadgeMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val startContentColor: MotionProperty<Brush>,
) : IconBadgeMotionStyle {

    class Builder : IconBadgeMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var startContent: MotionProperty<Brush>? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun startContentColor(startContent: MotionProperty<Brush>) = apply {
            this.startContent = startContent
        }

        override fun style(): IconBadgeMotionStyle {
            return IconBadgeMotionStyleImpl(
                backgroundColor = background ?: noMotion(),
                startContentColor = startContent ?: noMotion(),
            )
        }
    }
}
