package com.sdds.compose.uikit.motion.components.badge

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.common.IconTextMotionStyle
import com.sdds.compose.uikit.motion.components.common.IconTextMotionStyleBuilder
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
interface IconBadgeMotionStyle : IconTextMotionStyle {

    /**
     * Анимационное свойство цвета фона IconBadge.
     */
    val backgroundColor: MotionProperty<Brush>

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
interface IconBadgeMotionStyleBuilder : IconTextMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(background: MotionProperty<Brush>): IconBadgeMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    override fun startContentColor(startContent: MotionProperty<Brush>): IconBadgeMotionStyleBuilder

    override fun style(): IconBadgeMotionStyle
}

@Immutable
private class IconBadgeMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val startContentColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val contentColor: MotionProperty<Brush>,
    override val endContentColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
) : IconBadgeMotionStyle {

    class Builder : IconBadgeMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var startContent: MotionProperty<Brush>? = null
        private var labelColor: MotionProperty<Brush>? = null
        private var contentColor: MotionProperty<Brush>? = null
        private var endContentColor: MotionProperty<Brush>? = null

        private var labelStyle: MotionProperty<TextStyle>? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun labelColor(label: MotionProperty<Brush>): IconTextMotionStyleBuilder = apply {
            this.labelColor = null
        }

        override fun labelStyle(label: MotionProperty<TextStyle>): IconTextMotionStyleBuilder = apply {
            this.labelStyle = null
        }

        override fun contentColor(content: MotionProperty<Brush>): IconTextMotionStyleBuilder = apply {
            this.contentColor = null
        }

        override fun startContentColor(startContent: MotionProperty<Brush>) = apply {
            this.startContent = startContent
        }

        override fun endContentColor(endContent: MotionProperty<Brush>): IconTextMotionStyleBuilder = apply {
            this.endContentColor = null
        }

        override fun style(): IconBadgeMotionStyle {
            return IconBadgeMotionStyleImpl(
                backgroundColor = background ?: noMotion(),
                startContentColor = startContent ?: noMotion(),
                labelColor = noMotion(),
                contentColor = noMotion(),
                endContentColor = noMotion(),
                labelStyle = noMotion(),
            )
        }
    }
}
