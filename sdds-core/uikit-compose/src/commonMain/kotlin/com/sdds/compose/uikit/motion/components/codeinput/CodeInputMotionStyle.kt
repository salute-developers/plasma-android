package com.sdds.compose.uikit.motion.components.codeinput

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
 * CompositionLocal для стиля [CodeInputMotionStyle]
 */
val LocalCodeInputMotionStyle = compositionLocalOf { CodeInputMotionStyle.builder().style() }

/**
 * Стиль анимаций [CodeInput]
 */
@Stable
interface CodeInputMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти вводимого кода.
     */
    val codeColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти подписи.
     */
    val captionColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти обводки.
     */
    val strokeColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти фона кодовой ячейки.
     */
    val fieldColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля вводимого кода.
     */
    val codeStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство стиля подписи.
     */
    val captionStyle: MotionProperty<TextStyle>

    companion object {

        /**
         * Возвращает [CodeInputMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): CodeInputMotionStyleBuilder = CodeInputMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [CodeInput]
 */
@Stable
interface CodeInputMotionStyleBuilder : MotionStyleBuilder<CodeInputMotionStyle> {

    /**
     * Устанавливает анимацию изменения кисти вводимого кода.
     */
    fun codeColor(color: MotionProperty<Brush>): CodeInputMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти подписи.
     */
    fun captionColor(color: MotionProperty<Brush>): CodeInputMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти обводки.
     */
    fun strokeColor(color: MotionProperty<Brush>): CodeInputMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти фона кодовой ячейки.
     */
    fun fieldColor(color: MotionProperty<Brush>): CodeInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля вводимого кода.
     */
    fun codeStyle(style: MotionProperty<TextStyle>): CodeInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля подписи.
     */
    fun captionStyle(style: MotionProperty<TextStyle>): CodeInputMotionStyleBuilder
}

@Immutable
private class CodeInputMotionStyleImpl(
    override val codeColor: MotionProperty<Brush>,
    override val captionColor: MotionProperty<Brush>,
    override val strokeColor: MotionProperty<Brush>,
    override val fieldColor: MotionProperty<Brush>,
    override val codeStyle: MotionProperty<TextStyle>,
    override val captionStyle: MotionProperty<TextStyle>,
) : CodeInputMotionStyle {

    class Builder : CodeInputMotionStyleBuilder {
        private var codeColor: MotionProperty<Brush>? = null
        private var captionColor: MotionProperty<Brush>? = null
        private var strokeColor: MotionProperty<Brush>? = null
        private var fieldColor: MotionProperty<Brush>? = null
        private var codeStyle: MotionProperty<TextStyle>? = null
        private var captionStyle: MotionProperty<TextStyle>? = null

        override fun codeColor(color: MotionProperty<Brush>) = apply {
            this.codeColor = color
        }

        override fun captionColor(color: MotionProperty<Brush>) = apply {
            this.captionColor = color
        }

        override fun strokeColor(color: MotionProperty<Brush>) = apply {
            this.strokeColor = color
        }

        override fun fieldColor(color: MotionProperty<Brush>) = apply {
            this.fieldColor = color
        }

        override fun codeStyle(style: MotionProperty<TextStyle>) = apply {
            this.codeStyle = style
        }

        override fun captionStyle(style: MotionProperty<TextStyle>) = apply {
            this.captionStyle = style
        }

        override fun style(): CodeInputMotionStyle {
            return CodeInputMotionStyleImpl(
                codeColor = codeColor ?: noMotion(),
                captionColor = captionColor ?: noMotion(),
                strokeColor = strokeColor ?: noMotion(),
                fieldColor = fieldColor ?: noMotion(),
                codeStyle = codeStyle ?: noMotion(),
                captionStyle = captionStyle ?: noMotion(),
            )
        }
    }
}
