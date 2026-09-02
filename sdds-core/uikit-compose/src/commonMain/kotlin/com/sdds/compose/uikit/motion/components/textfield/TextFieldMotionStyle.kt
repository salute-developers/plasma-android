package com.sdds.compose.uikit.motion.components.textfield

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
 * CompositionLocal, предоставляющий текущий [TextFieldMotionStyle].
 * Используется для доступа к анимационным свойствам TextField внутри Compose-иерархии.
 */
val LocalTextFieldMotionStyle = compositionLocalOf { TextFieldMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента TextField.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface TextFieldMotionStyle : MotionStyle {

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета label.
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Устанавливает анимационное свойство стиля optional.
     */
    val optionalStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета optional.
     */
    val optionalColor: MotionProperty<Brush>

    /**
     * Устанавливает анимационное свойство стиля value.
     */
    val valueStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета value.
     */
    val valueColor: MotionProperty<Brush>

    /**
     * Устанавливает анимационное свойство стиля caption.
     */
    val captionStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета caption.
     */
    val captionColor: MotionProperty<Brush>

    /**
     * Устанавливает анимационное свойство стиля counter.
     */
    val counterStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета counter.
     */
    val counterColor: MotionProperty<Brush>

    /**
     * Устанавливает анимационное свойство стиля placeholder.
     */
    val placeholderStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета placeholder.
     */
    val placeholderColor: MotionProperty<Brush>

    /**
     * Устанавливает анимационное свойство стиля prefix.
     */
    val prefixStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета prefix.
     */
    val prefixColor: MotionProperty<Brush>

    /**
     * Устанавливает анимационное свойство стиля suffix.
     */
    val suffixStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета suffix.
     */
    val suffixColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета divider.
     */
    val dividerColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета background.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета startContent.
     */
    val startContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета endContent.
     */
    val endContentColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета indicator.
     */
    val indicatorColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета бордера(обводки).
     */
    val strokeColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [TextFieldMotionStyle].
         */
        fun builder(): TextFieldMotionStyleBuilder = TextFieldMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [TextFieldMotionStyle].
 */
@Stable
interface TextFieldMotionStyleBuilder : MotionStyleBuilder<TextFieldMotionStyle> {

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    fun labelStyle(label: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    fun labelColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля optional.
     */
    fun optionalStyle(optional: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета optional.
     */
    fun optionalColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля value.
     */
    fun valueStyle(value: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета value.
     */
    fun valueColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля caption.
     */
    fun captionStyle(caption: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета caption.
     */
    fun captionColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля counter.
     */
    fun counterStyle(counter: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета counter.
     */
    fun counterColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля placeholder.
     */
    fun placeholderStyle(placeholder: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета placeholder.
     */
    fun placeholderColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля prefix.
     */
    fun prefixStyle(prefix: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета prefix.
     */
    fun prefixColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля suffix.
     */
    fun suffixStyle(suffix: MotionProperty<TextStyle>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета suffix.
     */
    fun suffixColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета divider.
     */
    fun dividerColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета background.
     */
    fun backgroundColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета startContent.
     */
    fun startContentColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета endContent.
     */
    fun endContentColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета indicator.
     */
    fun indicatorColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета бордера (обводки).
     */
    fun strokeColor(color: MotionProperty<Brush>): TextFieldMotionStyleBuilder

    override fun style(): TextFieldMotionStyle
}

@Immutable
private class TextFieldMotionStyleImpl(
    override val labelStyle: MotionProperty<TextStyle>,
    override val valueStyle: MotionProperty<TextStyle>,
    override val optionalStyle: MotionProperty<TextStyle>,
    override val captionStyle: MotionProperty<TextStyle>,
    override val counterStyle: MotionProperty<TextStyle>,
    override val placeholderStyle: MotionProperty<TextStyle>,
    override val prefixStyle: MotionProperty<TextStyle>,
    override val suffixStyle: MotionProperty<TextStyle>,
    override val labelColor: MotionProperty<Brush>,
    override val optionalColor: MotionProperty<Brush>,
    override val valueColor: MotionProperty<Brush>,
    override val captionColor: MotionProperty<Brush>,
    override val counterColor: MotionProperty<Brush>,
    override val placeholderColor: MotionProperty<Brush>,
    override val prefixColor: MotionProperty<Brush>,
    override val suffixColor: MotionProperty<Brush>,
    override val dividerColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
    override val startContentColor: MotionProperty<Brush>,
    override val endContentColor: MotionProperty<Brush>,
    override val indicatorColor: MotionProperty<Brush>,
    override val strokeColor: MotionProperty<Brush>,
) : TextFieldMotionStyle {

    class Builder : TextFieldMotionStyleBuilder {
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var valueStyle: MotionProperty<TextStyle>? = null
        private var optionalStyle: MotionProperty<TextStyle>? = null
        private var captionStyle: MotionProperty<TextStyle>? = null
        private var counterStyle: MotionProperty<TextStyle>? = null
        private var placeholderStyle: MotionProperty<TextStyle>? = null
        private var prefixStyle: MotionProperty<TextStyle>? = null
        private var suffixStyle: MotionProperty<TextStyle>? = null

        private var labelColor: MotionProperty<Brush>? = null
        private var optionalColor: MotionProperty<Brush>? = null
        private var valueColor: MotionProperty<Brush>? = null
        private var captionColor: MotionProperty<Brush>? = null
        private var counterColor: MotionProperty<Brush>? = null
        private var placeholderColor: MotionProperty<Brush>? = null
        private var prefixColor: MotionProperty<Brush>? = null
        private var suffixColor: MotionProperty<Brush>? = null
        private var dividerColor: MotionProperty<Brush>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var startContentColor: MotionProperty<Brush>? = null
        private var endContentColor: MotionProperty<Brush>? = null
        private var indicatorColor: MotionProperty<Brush>? = null
        private var strokeColor: MotionProperty<Brush>? = null

        override fun labelStyle(label: MotionProperty<TextStyle>) = apply {
            this.labelStyle = label
        }

        override fun labelColor(color: MotionProperty<Brush>) = apply {
            this.labelColor = color
        }

        override fun optionalStyle(optional: MotionProperty<TextStyle>) = apply {
            this.optionalStyle = optional
        }

        override fun optionalColor(color: MotionProperty<Brush>) = apply {
            this.optionalColor = color
        }

        override fun valueStyle(value: MotionProperty<TextStyle>) = apply {
            this.valueStyle = value
        }

        override fun valueColor(color: MotionProperty<Brush>) = apply {
            this.valueColor = color
        }

        override fun captionStyle(caption: MotionProperty<TextStyle>) = apply {
            this.captionStyle = caption
        }

        override fun captionColor(color: MotionProperty<Brush>) = apply {
            this.captionColor = color
        }

        override fun counterStyle(counter: MotionProperty<TextStyle>) = apply {
            this.counterStyle = counter
        }

        override fun counterColor(color: MotionProperty<Brush>) = apply {
            this.counterColor = color
        }

        override fun placeholderStyle(placeholder: MotionProperty<TextStyle>) = apply {
            this.placeholderStyle = placeholder
        }

        override fun placeholderColor(color: MotionProperty<Brush>) = apply {
            this.placeholderColor = color
        }

        override fun prefixStyle(prefix: MotionProperty<TextStyle>) = apply {
            this.prefixStyle = prefix
        }

        override fun prefixColor(color: MotionProperty<Brush>) = apply {
            this.prefixColor = color
        }

        override fun suffixStyle(suffix: MotionProperty<TextStyle>) = apply {
            this.suffixStyle = suffix
        }

        override fun suffixColor(color: MotionProperty<Brush>) = apply {
            this.suffixColor = color
        }

        override fun dividerColor(color: MotionProperty<Brush>) = apply {
            this.dividerColor = color
        }

        override fun backgroundColor(color: MotionProperty<Brush>) = apply {
            this.backgroundColor = color
        }

        override fun startContentColor(color: MotionProperty<Brush>) = apply {
            this.startContentColor = color
        }

        override fun endContentColor(color: MotionProperty<Brush>) = apply {
            this.endContentColor = color
        }

        override fun indicatorColor(color: MotionProperty<Brush>) = apply {
            this.indicatorColor = color
        }

        override fun strokeColor(color: MotionProperty<Brush>) = apply {
            this.strokeColor = color
        }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): TextFieldMotionStyle {
            return TextFieldMotionStyleImpl(
                labelStyle = labelStyle ?: noMotion(),
                valueStyle = valueStyle ?: noMotion(),
                optionalStyle = optionalStyle ?: noMotion(),
                captionStyle = captionStyle ?: noMotion(),
                counterStyle = counterStyle ?: noMotion(),
                placeholderStyle = placeholderStyle ?: noMotion(),
                prefixStyle = prefixStyle ?: noMotion(),
                suffixStyle = suffixStyle ?: noMotion(),
                labelColor = labelColor ?: noMotion(),
                optionalColor = optionalColor ?: noMotion(),
                valueColor = valueColor ?: noMotion(),
                captionColor = captionColor ?: noMotion(),
                counterColor = counterColor ?: noMotion(),
                placeholderColor = placeholderColor ?: noMotion(),
                prefixColor = prefixColor ?: noMotion(),
                suffixColor = suffixColor ?: noMotion(),
                dividerColor = dividerColor ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
                startContentColor = startContentColor ?: noMotion(),
                endContentColor = endContentColor ?: noMotion(),
                indicatorColor = indicatorColor ?: noMotion(),
                strokeColor = strokeColor ?: noMotion(),
            )
        }
    }
}
