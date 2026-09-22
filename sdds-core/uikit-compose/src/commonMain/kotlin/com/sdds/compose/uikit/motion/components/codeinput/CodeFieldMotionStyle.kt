package com.sdds.compose.uikit.motion.components.codeField

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.codeinput.CodeInputMotionStyle
import com.sdds.compose.uikit.motion.components.codeinput.CodeInputMotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [CodeFieldMotionStyle]
 */
val LocalCodeFieldMotionStyle = compositionLocalOf { CodeFieldMotionStyle.builder().style() }

/**
 * Стиль анимаций [CodeField]
 */
@Stable
interface CodeFieldMotionStyle : CodeInputMotionStyle {

    /**
     * Анимация изменения кисти курсора.
     */
    val cursorColor: MotionProperty<Brush>

    /**
     * Анимация изменения заливки точки.
     */
    val dotColor: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [CodeFieldMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): CodeFieldMotionStyleBuilder = CodeFieldMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [CodeField]
 */
@Stable
interface CodeFieldMotionStyleBuilder : CodeInputMotionStyleBuilder {

    /**
     * Устанавливает анимацию изменения кисти вводимого кода.
     */
    override fun codeColor(color: MotionProperty<Brush>): CodeFieldMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти подписи.
     */
    override fun captionColor(color: MotionProperty<Brush>): CodeFieldMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти обводки.
     */
    override fun strokeColor(color: MotionProperty<Brush>): CodeFieldMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти фона кодовой ячейки.
     */
    override fun fieldColor(color: MotionProperty<Brush>): CodeFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля вводимого кода.
     */
    override fun codeStyle(style: MotionProperty<TextStyle>): CodeFieldMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля подписи.
     */
    override fun captionStyle(style: MotionProperty<TextStyle>): CodeFieldMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти курсора.
     */
    fun cursorColor(color: MotionProperty<Brush>): CodeFieldMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения заливки точки.
     */
    fun dotColor(color: MotionProperty<Brush>): CodeFieldMotionStyleBuilder

    override fun style(): CodeFieldMotionStyle
}

@Immutable
private class CodeFieldMotionStyleImpl(
    override val codeColor: MotionProperty<Brush>,
    override val captionColor: MotionProperty<Brush>,
    override val strokeColor: MotionProperty<Brush>,
    override val fieldColor: MotionProperty<Brush>,
    override val cursorColor: MotionProperty<Brush>,
    override val dotColor: MotionProperty<Brush>,
    override val codeStyle: MotionProperty<TextStyle>,
    override val captionStyle: MotionProperty<TextStyle>,
) : CodeFieldMotionStyle {

    class Builder : CodeFieldMotionStyleBuilder {
        private var codeColor: MotionProperty<Brush>? = null
        private var captionColor: MotionProperty<Brush>? = null
        private var strokeColor: MotionProperty<Brush>? = null
        private var fieldColor: MotionProperty<Brush>? = null
        private var dotColor: MotionProperty<Brush>? = null
        private var cursorColor: MotionProperty<Brush>? = null
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

        override fun dotColor(color: MotionProperty<Brush>) = apply {
            this.dotColor = color
        }

        override fun cursorColor(color: MotionProperty<Brush>) = apply {
            this.cursorColor = color
        }

        override fun codeStyle(style: MotionProperty<TextStyle>) = apply {
            this.codeStyle = style
        }

        override fun captionStyle(style: MotionProperty<TextStyle>) = apply {
            this.captionStyle = style
        }

        override fun style(): CodeFieldMotionStyle {
            return CodeFieldMotionStyleImpl(
                codeColor = codeColor ?: noMotion(),
                captionColor = captionColor ?: noMotion(),
                strokeColor = strokeColor ?: noMotion(),
                fieldColor = fieldColor ?: noMotion(),
                codeStyle = codeStyle ?: noMotion(),
                captionStyle = captionStyle ?: noMotion(),
                cursorColor = cursorColor ?: noMotion(),
                dotColor = dotColor ?: noMotion(),
            )
        }
    }
}
