package com.sdds.compose.uikit.motion.components.icontext

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
 * CompositionLocal, предоставляющий текущий [IconTextMotionStyle].
 * Используется для доступа к анимационным свойствам IconText внутри Compose-иерархии.
 */
internal val LocalIconTextMotionStyle = compositionLocalOf { IconTextMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента IconText.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface IconTextMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета основного текста (label) IconText.
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля основного текста (label) Badge.
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета контента (как в начале,  так и в конце) IconText.
     */
    val contentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в начале IconText.
     */
    val startContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета контента, расположенного в конце IconText.
     */
    val endContentColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [IconTextMotionStyle].
         */
        fun builder(): IconTextMotionStyleBuilder = IconTextMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [IconTextMotionStyle].
 */
@Stable
interface IconTextMotionStyleBuilder : MotionStyleBuilder<IconTextMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    fun labelColor(label: MotionProperty<Brush>): IconTextMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    fun labelStyle(label: MotionProperty<TextStyle>): IconTextMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    fun contentColor(content: MotionProperty<Brush>): IconTextMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    fun startContentColor(startContent: MotionProperty<Brush>): IconTextMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета конечного контента.
     */
    fun endContentColor(endContent: MotionProperty<Brush>): IconTextMotionStyleBuilder
}

@Immutable
private class IconTextMotionStyleImpl(
    override val labelColor: MotionProperty<Brush>,
    override val contentColor: MotionProperty<Brush>,
    override val startContentColor: MotionProperty<Brush>,
    override val endContentColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
) : IconTextMotionStyle {

    class Builder : IconTextMotionStyleBuilder {
        private var label: MotionProperty<Brush>? = null
        private var content: MotionProperty<Brush>? = null
        private var startContent: MotionProperty<Brush>? = null
        private var endContent: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null

        override fun labelColor(label: MotionProperty<Brush>): IconTextMotionStyleBuilder = apply {
            this.label = label
        }

        override fun contentColor(content: MotionProperty<Brush>): IconTextMotionStyleBuilder = apply {
            this.content = content
        }

        override fun startContentColor(startContent: MotionProperty<Brush>): IconTextMotionStyleBuilder = apply {
            this.startContent = startContent
        }

        override fun endContentColor(endContent: MotionProperty<Brush>): IconTextMotionStyleBuilder = apply {
            this.endContent = endContent
        }

        override fun labelStyle(label: MotionProperty<TextStyle>): IconTextMotionStyleBuilder = apply {
            this.labelStyle = label
        }

        override fun style(): IconTextMotionStyle {
            return IconTextMotionStyleImpl(
                labelColor = label ?: noMotion(),
                contentColor = content ?: noMotion(),
                startContentColor = startContent ?: noMotion(),
                endContentColor = endContent ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
            )
        }
    }
}
