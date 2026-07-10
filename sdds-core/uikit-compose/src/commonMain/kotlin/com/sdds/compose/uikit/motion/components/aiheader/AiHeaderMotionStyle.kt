package com.sdds.compose.uikit.motion.components.aiheader

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [AiHeaderMotionStyle].
 * Используется для доступа к анимационным свойствам AiHeader внутри Compose-иерархии.
 */
val LocalAiHeaderMotionStyle = compositionLocalOf { AiHeaderMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для компонента [com.sdds.compose.uikit.ai.AiHeader].
 */
@Stable
interface AiHeaderMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета заголовка.
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля заголовка.
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета подзаголовка.
     */
    val subtitleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля подзаголовка.
     */
    val subtitleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета разделителя.
     */
    val dividerColor: MotionProperty<Brush>

    /**
     * Анимационное свойство внешнего отступа слева.
     */
    val paddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство внешнего отступа справа.
     */
    val paddingEnd: MotionProperty<Dp>

    /**
     * Анимационное свойство внешнего отступа сверху.
     */
    val paddingTop: MotionProperty<Dp>

    /**
     * Анимационное свойство внешнего отступа снизу.
     */
    val paddingBottom: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа текстового блока слева.
     */
    val textPaddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа текстового блока справа.
     */
    val textPaddingEnd: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа текстового блока сверху.
     */
    val textPaddingTop: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа текстового блока снизу.
     */
    val textPaddingBottom: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа между заголовком и подзаголовком.
     */
    val subtitlePadding: MotionProperty<Dp>

    /**
     * Анимационное свойство толщины линии разделителя.
     */
    val dividerThickness: MotionProperty<Dp>

    companion object {
        /**
         * Создаёт билдер для [AiHeaderMotionStyle].
         */
        fun builder(): AiHeaderMotionStyleBuilder = AiHeaderMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [AiHeaderMotionStyle].
 */
@Stable
interface AiHeaderMotionStyleBuilder : MotionStyleBuilder<AiHeaderMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета заголовка.
     */
    fun titleColor(color: MotionProperty<Brush>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля заголовка.
     */
    fun titleStyle(style: MotionProperty<TextStyle>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета подзаголовка.
     */
    fun subtitleColor(color: MotionProperty<Brush>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля подзаголовка.
     */
    fun subtitleStyle(style: MotionProperty<TextStyle>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(color: MotionProperty<Brush>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета разделителя.
     */
    fun dividerColor(color: MotionProperty<Brush>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа слева.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа справа.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа сверху.
     */
    fun paddingTop(paddingTop: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа снизу.
     */
    fun paddingBottom(paddingBottom: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового блока слева.
     */
    fun textPaddingStart(textPaddingStart: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового блока справа.
     */
    fun textPaddingEnd(textPaddingEnd: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового блока сверху.
     */
    fun textPaddingTop(textPaddingTop: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового блока снизу.
     */
    fun textPaddingBottom(textPaddingBottom: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство отступа между заголовком и подзаголовком.
     */
    fun subtitlePadding(subtitlePadding: MotionProperty<Dp>): AiHeaderMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство толщины линии разделителя.
     */
    fun dividerThickness(dividerThickness: MotionProperty<Dp>): AiHeaderMotionStyleBuilder
}

@Immutable
private class AiHeaderMotionStyleImpl(
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val subtitleColor: MotionProperty<Brush>,
    override val subtitleStyle: MotionProperty<TextStyle>,
    override val backgroundColor: MotionProperty<Brush>,
    override val dividerColor: MotionProperty<Brush>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
    override val textPaddingStart: MotionProperty<Dp>,
    override val textPaddingEnd: MotionProperty<Dp>,
    override val textPaddingTop: MotionProperty<Dp>,
    override val textPaddingBottom: MotionProperty<Dp>,
    override val subtitlePadding: MotionProperty<Dp>,
    override val dividerThickness: MotionProperty<Dp>,
) : AiHeaderMotionStyle {

    class Builder : AiHeaderMotionStyleBuilder {
        private var titleColor: MotionProperty<Brush>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null
        private var subtitleColor: MotionProperty<Brush>? = null
        private var subtitleStyle: MotionProperty<TextStyle>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var dividerColor: MotionProperty<Brush>? = null
        private var paddingStart: MotionProperty<Dp>? = null
        private var paddingEnd: MotionProperty<Dp>? = null
        private var paddingTop: MotionProperty<Dp>? = null
        private var paddingBottom: MotionProperty<Dp>? = null
        private var textPaddingStart: MotionProperty<Dp>? = null
        private var textPaddingEnd: MotionProperty<Dp>? = null
        private var textPaddingTop: MotionProperty<Dp>? = null
        private var textPaddingBottom: MotionProperty<Dp>? = null
        private var subtitlePadding: MotionProperty<Dp>? = null
        private var dividerThickness: MotionProperty<Dp>? = null

        override fun titleColor(color: MotionProperty<Brush>) = apply { this.titleColor = color }
        override fun titleStyle(style: MotionProperty<TextStyle>) = apply { this.titleStyle = style }
        override fun subtitleColor(color: MotionProperty<Brush>) = apply { this.subtitleColor = color }
        override fun subtitleStyle(style: MotionProperty<TextStyle>) = apply { this.subtitleStyle = style }
        override fun backgroundColor(color: MotionProperty<Brush>) = apply { this.backgroundColor = color }
        override fun dividerColor(color: MotionProperty<Brush>) = apply { this.dividerColor = color }
        override fun paddingStart(paddingStart: MotionProperty<Dp>) = apply { this.paddingStart = paddingStart }
        override fun paddingEnd(paddingEnd: MotionProperty<Dp>) = apply { this.paddingEnd = paddingEnd }
        override fun paddingTop(paddingTop: MotionProperty<Dp>) = apply { this.paddingTop = paddingTop }
        override fun paddingBottom(paddingBottom: MotionProperty<Dp>) = apply { this.paddingBottom = paddingBottom }
        override fun textPaddingStart(textPaddingStart: MotionProperty<Dp>) = apply {
            this.textPaddingStart = textPaddingStart
        }
        override fun textPaddingEnd(textPaddingEnd: MotionProperty<Dp>) = apply {
            this.textPaddingEnd = textPaddingEnd
        }
        override fun textPaddingTop(textPaddingTop: MotionProperty<Dp>) = apply {
            this.textPaddingTop = textPaddingTop
        }
        override fun textPaddingBottom(textPaddingBottom: MotionProperty<Dp>) = apply {
            this.textPaddingBottom = textPaddingBottom
        }
        override fun subtitlePadding(subtitlePadding: MotionProperty<Dp>) = apply {
            this.subtitlePadding = subtitlePadding
        }
        override fun dividerThickness(dividerThickness: MotionProperty<Dp>) = apply {
            this.dividerThickness = dividerThickness
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): AiHeaderMotionStyle = AiHeaderMotionStyleImpl(
            titleColor = titleColor ?: noMotion(),
            titleStyle = titleStyle ?: noMotion(),
            subtitleColor = subtitleColor ?: noMotion(),
            subtitleStyle = subtitleStyle ?: noMotion(),
            backgroundColor = backgroundColor ?: noMotion(),
            dividerColor = dividerColor ?: noMotion(),
            paddingStart = paddingStart ?: noMotion(),
            paddingEnd = paddingEnd ?: noMotion(),
            paddingTop = paddingTop ?: noMotion(),
            paddingBottom = paddingBottom ?: noMotion(),
            textPaddingStart = textPaddingStart ?: noMotion(),
            textPaddingEnd = textPaddingEnd ?: noMotion(),
            textPaddingTop = textPaddingTop ?: noMotion(),
            textPaddingBottom = textPaddingBottom ?: noMotion(),
            subtitlePadding = subtitlePadding ?: noMotion(),
            dividerThickness = dividerThickness ?: noMotion(),
        )
    }
}
