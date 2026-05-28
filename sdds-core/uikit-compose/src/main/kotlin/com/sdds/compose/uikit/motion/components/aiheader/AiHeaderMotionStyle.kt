package com.sdds.compose.uikit.motion.components.aiheader

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
 * CompositionLocal, предоставляющий текущий [AiHeaderMotionStyle].
 * Используется для доступа к анимационным свойствам AiHeader внутри Compose-иерархии.
 */
val LocalAiHeaderMotionStyle = compositionLocalOf { AiHeaderMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для компонента [com.sdds.compose.uikit.AiHeader].
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
}

@Immutable
private class AiHeaderMotionStyleImpl(
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val subtitleColor: MotionProperty<Brush>,
    override val subtitleStyle: MotionProperty<TextStyle>,
    override val backgroundColor: MotionProperty<Brush>,
    override val dividerColor: MotionProperty<Brush>,
) : AiHeaderMotionStyle {

    class Builder : AiHeaderMotionStyleBuilder {
        private var titleColor: MotionProperty<Brush>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null
        private var subtitleColor: MotionProperty<Brush>? = null
        private var subtitleStyle: MotionProperty<TextStyle>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var dividerColor: MotionProperty<Brush>? = null

        override fun titleColor(color: MotionProperty<Brush>) = apply { this.titleColor = color }
        override fun titleStyle(style: MotionProperty<TextStyle>) = apply { this.titleStyle = style }
        override fun subtitleColor(color: MotionProperty<Brush>) = apply { this.subtitleColor = color }
        override fun subtitleStyle(style: MotionProperty<TextStyle>) = apply { this.subtitleStyle = style }
        override fun backgroundColor(color: MotionProperty<Brush>) = apply { this.backgroundColor = color }
        override fun dividerColor(color: MotionProperty<Brush>) = apply { this.dividerColor = color }

        override fun style(): AiHeaderMotionStyle = AiHeaderMotionStyleImpl(
            titleColor = titleColor ?: noMotion(),
            titleStyle = titleStyle ?: noMotion(),
            subtitleColor = subtitleColor ?: noMotion(),
            subtitleStyle = subtitleStyle ?: noMotion(),
            backgroundColor = backgroundColor ?: noMotion(),
            dividerColor = dividerColor ?: noMotion(),
        )
    }
}
