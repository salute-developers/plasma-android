package com.sdds.compose.uikit.motion.components.chip

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
 * CompositionLocal, предоставляющий текущий [ChipMotionStyle].
 * Используется для доступа к анимационным свойствам Chip внутри Compose-иерархии.
 */
val LocalChipMotionStyle = compositionLocalOf { ChipMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Chip.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface ChipMotionStyle : IconTextMotionStyle {

    /**
     * Анимационное свойство цвета фона Chip.
     */
    val backgroundColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [ChipMotionStyle].
         */
        fun builder(): ChipMotionStyleBuilder = ChipMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [ChipMotionStyle].
 */
@Stable
interface ChipMotionStyleBuilder : IconTextMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(background: MotionProperty<Brush>): ChipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    override fun labelColor(label: MotionProperty<Brush>): ChipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    override fun labelStyle(label: MotionProperty<TextStyle>): ChipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    override fun contentColor(content: MotionProperty<Brush>): ChipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета начального контента.
     */
    override fun startContentColor(startContent: MotionProperty<Brush>): ChipMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета конечного контента.
     */
    override fun endContentColor(endContent: MotionProperty<Brush>): ChipMotionStyleBuilder

    override fun style(): ChipMotionStyle
}

@Immutable
private class ChipMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val labelColor: MotionProperty<Brush>,
    override val contentColor: MotionProperty<Brush>,
    override val startContentColor: MotionProperty<Brush>,
    override val endContentColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
) : ChipMotionStyle {

    class Builder : ChipMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null
        private var label: MotionProperty<Brush>? = null
        private var content: MotionProperty<Brush>? = null
        private var startContent: MotionProperty<Brush>? = null
        private var endContent: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null

        override fun backgroundColor(background: MotionProperty<Brush>): ChipMotionStyleBuilder = apply {
            this.background = background
        }

        override fun labelColor(label: MotionProperty<Brush>): ChipMotionStyleBuilder = apply {
            this.label = label
        }

        override fun labelStyle(label: MotionProperty<TextStyle>): ChipMotionStyleBuilder = apply {
            this.labelStyle = label
        }

        override fun contentColor(content: MotionProperty<Brush>): ChipMotionStyleBuilder = apply {
            this.content = content
        }

        override fun startContentColor(startContent: MotionProperty<Brush>): ChipMotionStyleBuilder = apply {
            this.startContent = startContent
        }

        override fun endContentColor(endContent: MotionProperty<Brush>): ChipMotionStyleBuilder = apply {
            this.endContent = endContent
        }

        override fun style(): ChipMotionStyle {
            return ChipMotionStyleImpl(
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
