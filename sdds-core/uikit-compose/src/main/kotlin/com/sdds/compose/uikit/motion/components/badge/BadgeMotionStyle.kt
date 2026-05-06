package com.sdds.compose.uikit.motion.components.badge

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
 * CompositionLocal, предоставляющий текущий [BadgeMotionStyle].
 * Используется для доступа к анимационным свойствам Badge внутри Compose-иерархии.
 */
val LocalBadgeMotionStyle = compositionLocalOf { BadgeMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Badge.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface BadgeMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета фона Badge.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета основного текста (label) Badge.
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля основного текста (label) Badge.
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета контента (как в начале,  так и в конце) Badge.
     */
    val contentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в начале Badge.
     */
    val startContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в конце Badge.
     */
    val endContentColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [BadgeMotionStyle].
         */
        fun builder(): BadgeMotionStyleBuilder = BadgeMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [BadgeMotionStyle].
 */
@Stable
interface BadgeMotionStyleBuilder : MotionStyleBuilder<BadgeMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(background: MotionProperty<Brush>): BadgeMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    fun labelColor(label: MotionProperty<Brush>): BadgeMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    fun labelStyle(label: MotionProperty<TextStyle>): BadgeMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    fun contentColor(content: MotionProperty<Brush>): BadgeMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    fun startContentColor(startContent: MotionProperty<Brush>): BadgeMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета конечного контента.
     */
    fun endContentColor(endContent: MotionProperty<Brush>): BadgeMotionStyleBuilder
}

@Immutable
private class BadgeMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val contentColor: MotionProperty<Brush>,
    override val startContentColor: MotionProperty<Brush>,
    override val endContentColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
) : BadgeMotionStyle {

    class Builder : BadgeMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var label: MotionProperty<Brush>? = null
        private var content: MotionProperty<Brush>? = null
        private var startContent: MotionProperty<Brush>? = null
        private var endContent: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun labelColor(label: MotionProperty<Brush>) = apply {
            this.label = label
        }

        override fun labelStyle(label: MotionProperty<TextStyle>) = apply {
            this.labelStyle = label
        }

        override fun contentColor(content: MotionProperty<Brush>) = apply {
            this.content = content
        }

        override fun startContentColor(startContent: MotionProperty<Brush>) = apply {
            this.startContent = startContent
        }

        override fun endContentColor(endContent: MotionProperty<Brush>) = apply {
            this.endContent = endContent
        }

        override fun style(): BadgeMotionStyle {
            return BadgeMotionStyleImpl(
                backgroundColor = background ?: noMotion(),
                labelColor = label ?: noMotion(),
                contentColor = content ?: noMotion(),
                startContentColor = startContent ?: noMotion(),
                endContentColor = endContent ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
            )
        }
    }
}
