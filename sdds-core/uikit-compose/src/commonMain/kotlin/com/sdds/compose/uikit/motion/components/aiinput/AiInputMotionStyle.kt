package com.sdds.compose.uikit.motion.components.aiinput

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
 * CompositionLocal, предоставляющий текущий [AiInputMotionStyle].
 */
val LocalAiInputMotionStyle = compositionLocalOf { AiInputMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для компонента [com.sdds.compose.uikit.ai.AiInput].
 */
@Stable
interface AiInputMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета вводимого текста.
     */
    val inputColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета placeholder.
     */
    val placeholderColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета курсора.
     */
    val cursorColor: MotionProperty<Brush>

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
     * Анимационное свойство внутреннего отступа текстового поля слева.
     */
    val textFieldPaddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа текстового поля справа.
     */
    val textFieldPaddingEnd: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа текстового поля сверху.
     */
    val textFieldPaddingTop: MotionProperty<Dp>

    /**
     * Анимационное свойство внутреннего отступа текстового поля снизу.
     */
    val textFieldPaddingBottom: MotionProperty<Dp>

    /**
     * Анимационное свойство нижнего отступа области контента.
     */
    val contentPadding: MotionProperty<Dp>

    /**
     * Анимационное свойство расстояния между элементами области контента.
     */
    val contentSpacing: MotionProperty<Dp>

    /**
     * Анимационное свойство типографики вводимого текста.
     */
    val inputStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство типографики placeholder.
     */
    val placeholderStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство отступа скроллбара от текстового поля (слева от скроллбара).
     */
    val scrollBarPaddingStart: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа скроллбара от верхней границы.
     */
    val scrollBarPaddingTop: MotionProperty<Dp>

    /**
     * Анимационное свойство отступа скроллбара от нижней границы.
     */
    val scrollBarPaddingBottom: MotionProperty<Dp>

    companion object {
        /**
         * Создаёт билдер для [AiInputMotionStyle].
         */
        fun builder(): AiInputMotionStyleBuilder = AiInputMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [AiInputMotionStyle].
 */
@Stable
interface AiInputMotionStyleBuilder : MotionStyleBuilder<AiInputMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(color: MotionProperty<Brush>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета вводимого текста.
     */
    fun inputColor(color: MotionProperty<Brush>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета placeholder.
     */
    fun placeholderColor(color: MotionProperty<Brush>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета курсора.
     */
    fun cursorColor(color: MotionProperty<Brush>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа слева.
     */
    fun paddingStart(paddingStart: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа справа.
     */
    fun paddingEnd(paddingEnd: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа сверху.
     */
    fun paddingTop(paddingTop: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внешнего отступа снизу.
     */
    fun paddingBottom(paddingBottom: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового поля слева.
     */
    fun textFieldPaddingStart(textFieldPaddingStart: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового поля справа.
     */
    fun textFieldPaddingEnd(textFieldPaddingEnd: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового поля сверху.
     */
    fun textFieldPaddingTop(textFieldPaddingTop: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство внутреннего отступа текстового поля снизу.
     */
    fun textFieldPaddingBottom(textFieldPaddingBottom: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство нижнего отступа области контента.
     */
    fun contentPadding(contentPadding: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство расстояния между элементами области контента.
     */
    fun contentSpacing(contentSpacing: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство типографики вводимого текста.
     */
    fun inputStyle(inputStyle: MotionProperty<TextStyle>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство типографики placeholder.
     */
    fun placeholderStyle(placeholderStyle: MotionProperty<TextStyle>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство отступа скроллбара от текстового поля (слева от скроллбара).
     */
    fun scrollBarPaddingStart(scrollBarPaddingStart: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство отступа скроллбара от верхней границы.
     */
    fun scrollBarPaddingTop(scrollBarPaddingTop: MotionProperty<Dp>): AiInputMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство отступа скроллбара от нижней границы.
     */
    fun scrollBarPaddingBottom(scrollBarPaddingBottom: MotionProperty<Dp>): AiInputMotionStyleBuilder
}

@Immutable
private class AiInputMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val inputColor: MotionProperty<Brush>,
    override val placeholderColor: MotionProperty<Brush>,
    override val cursorColor: MotionProperty<Brush>,
    override val paddingStart: MotionProperty<Dp>,
    override val paddingEnd: MotionProperty<Dp>,
    override val paddingTop: MotionProperty<Dp>,
    override val paddingBottom: MotionProperty<Dp>,
    override val textFieldPaddingStart: MotionProperty<Dp>,
    override val textFieldPaddingEnd: MotionProperty<Dp>,
    override val textFieldPaddingTop: MotionProperty<Dp>,
    override val textFieldPaddingBottom: MotionProperty<Dp>,
    override val contentPadding: MotionProperty<Dp>,
    override val contentSpacing: MotionProperty<Dp>,
    override val inputStyle: MotionProperty<TextStyle>,
    override val placeholderStyle: MotionProperty<TextStyle>,
    override val scrollBarPaddingStart: MotionProperty<Dp>,
    override val scrollBarPaddingTop: MotionProperty<Dp>,
    override val scrollBarPaddingBottom: MotionProperty<Dp>,
) : AiInputMotionStyle {

    class Builder : AiInputMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var inputColor: MotionProperty<Brush>? = null
        private var placeholderColor: MotionProperty<Brush>? = null
        private var cursorColor: MotionProperty<Brush>? = null
        private var paddingStart: MotionProperty<Dp>? = null
        private var paddingEnd: MotionProperty<Dp>? = null
        private var paddingTop: MotionProperty<Dp>? = null
        private var paddingBottom: MotionProperty<Dp>? = null
        private var textFieldPaddingStart: MotionProperty<Dp>? = null
        private var textFieldPaddingEnd: MotionProperty<Dp>? = null
        private var textFieldPaddingTop: MotionProperty<Dp>? = null
        private var textFieldPaddingBottom: MotionProperty<Dp>? = null
        private var contentPadding: MotionProperty<Dp>? = null
        private var contentSpacing: MotionProperty<Dp>? = null
        private var inputStyle: MotionProperty<TextStyle>? = null
        private var placeholderStyle: MotionProperty<TextStyle>? = null
        private var scrollBarPaddingStart: MotionProperty<Dp>? = null
        private var scrollBarPaddingTop: MotionProperty<Dp>? = null
        private var scrollBarPaddingBottom: MotionProperty<Dp>? = null

        override fun backgroundColor(color: MotionProperty<Brush>) =
            apply { this.backgroundColor = color }

        override fun inputColor(color: MotionProperty<Brush>) =
            apply { this.inputColor = color }

        override fun placeholderColor(color: MotionProperty<Brush>) =
            apply { this.placeholderColor = color }

        override fun cursorColor(color: MotionProperty<Brush>) =
            apply { this.cursorColor = color }

        override fun paddingStart(paddingStart: MotionProperty<Dp>) =
            apply { this.paddingStart = paddingStart }

        override fun paddingEnd(paddingEnd: MotionProperty<Dp>) =
            apply { this.paddingEnd = paddingEnd }

        override fun paddingTop(paddingTop: MotionProperty<Dp>) =
            apply { this.paddingTop = paddingTop }

        override fun paddingBottom(paddingBottom: MotionProperty<Dp>) =
            apply { this.paddingBottom = paddingBottom }

        override fun textFieldPaddingStart(textFieldPaddingStart: MotionProperty<Dp>) =
            apply { this.textFieldPaddingStart = textFieldPaddingStart }

        override fun textFieldPaddingEnd(textFieldPaddingEnd: MotionProperty<Dp>) =
            apply { this.textFieldPaddingEnd = textFieldPaddingEnd }

        override fun textFieldPaddingTop(textFieldPaddingTop: MotionProperty<Dp>) =
            apply { this.textFieldPaddingTop = textFieldPaddingTop }

        override fun textFieldPaddingBottom(textFieldPaddingBottom: MotionProperty<Dp>) =
            apply { this.textFieldPaddingBottom = textFieldPaddingBottom }

        override fun contentPadding(contentPadding: MotionProperty<Dp>) =
            apply { this.contentPadding = contentPadding }

        override fun contentSpacing(contentSpacing: MotionProperty<Dp>) =
            apply { this.contentSpacing = contentSpacing }

        override fun inputStyle(inputStyle: MotionProperty<TextStyle>) =
            apply { this.inputStyle = inputStyle }

        override fun placeholderStyle(placeholderStyle: MotionProperty<TextStyle>) =
            apply { this.placeholderStyle = placeholderStyle }

        override fun scrollBarPaddingStart(scrollBarPaddingStart: MotionProperty<Dp>) =
            apply { this.scrollBarPaddingStart = scrollBarPaddingStart }

        override fun scrollBarPaddingTop(scrollBarPaddingTop: MotionProperty<Dp>) =
            apply { this.scrollBarPaddingTop = scrollBarPaddingTop }

        override fun scrollBarPaddingBottom(scrollBarPaddingBottom: MotionProperty<Dp>) =
            apply { this.scrollBarPaddingBottom = scrollBarPaddingBottom }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): AiInputMotionStyle = AiInputMotionStyleImpl(
            backgroundColor = backgroundColor ?: noMotion(),
            inputColor = inputColor ?: noMotion(),
            placeholderColor = placeholderColor ?: noMotion(),
            cursorColor = cursorColor ?: noMotion(),
            paddingStart = paddingStart ?: noMotion(),
            paddingEnd = paddingEnd ?: noMotion(),
            paddingTop = paddingTop ?: noMotion(),
            paddingBottom = paddingBottom ?: noMotion(),
            textFieldPaddingStart = textFieldPaddingStart ?: noMotion(),
            textFieldPaddingEnd = textFieldPaddingEnd ?: noMotion(),
            textFieldPaddingTop = textFieldPaddingTop ?: noMotion(),
            textFieldPaddingBottom = textFieldPaddingBottom ?: noMotion(),
            contentPadding = contentPadding ?: noMotion(),
            contentSpacing = contentSpacing ?: noMotion(),
            inputStyle = inputStyle ?: noMotion(),
            placeholderStyle = placeholderStyle ?: noMotion(),
            scrollBarPaddingStart = scrollBarPaddingStart ?: noMotion(),
            scrollBarPaddingTop = scrollBarPaddingTop ?: noMotion(),
            scrollBarPaddingBottom = scrollBarPaddingBottom ?: noMotion(),
        )
    }
}
