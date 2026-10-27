package com.sdds.compose.uikit.motion.components.note

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
 * CompositionLocal, предоставляющий текущий [NoteMotionStyle].
 * Используется для доступа к анимационным свойствам Note внутри Compose-иерархии.
 */
val LocalNoteMotionStyle = compositionLocalOf { NoteMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Note.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface NoteMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета заголовка (title) Note.
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля заголовка (title) Note.
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета текста (label) Note.
     */
    val textColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста (label) Note.
     */
    val textStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета contentAfterColor Note.
     */
    val contentAfterColor: MotionProperty<Brush>

    /**
     * Анимационное свойство иконки contentBefore Note.
     */
    val contentBeforeColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета иконки закрытия Note.
     */
    val closeColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета фона Note.
     */
    val backgroundColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [NoteMotionStyle].
         */
        fun builder(): NoteMotionStyleBuilder = NoteMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [NoteMotionStyle].
 */
@Stable
interface NoteMotionStyleBuilder : MotionStyleBuilder<NoteMotionStyle> {

    /**
     * Устанавливает анимационное свойство цвета title.
     */
    fun titleColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля title.
     */
    fun titleStyle(style: MotionProperty<TextStyle>): NoteMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета text.
     */
    fun textColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля text.
     */
    fun textStyle(style: MotionProperty<TextStyle>): NoteMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета contentAfterColor.
     */
    fun contentAfterColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета contentBeforeColor.
     */
    fun contentBeforeColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета иконки закрытия в начале.
     */
    fun closeColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона.
     */
    fun backgroundColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder
}

@Immutable
private class NoteMotionStyleImpl(
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val textColor: MotionProperty<Brush>,
    override val textStyle: MotionProperty<TextStyle>,
    override val contentAfterColor: MotionProperty<Brush>,
    override val contentBeforeColor: MotionProperty<Brush>,
    override val closeColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
) : NoteMotionStyle {

    class Builder : NoteMotionStyleBuilder {
        private var textColor: MotionProperty<Brush>? = null
        private var titleColor: MotionProperty<Brush>? = null
        private var contentAfterColor: MotionProperty<Brush>? = null
        private var contentBeforeColor: MotionProperty<Brush>? = null
        private var closeColor: MotionProperty<Brush>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var textStyle: MotionProperty<TextStyle>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null

        override fun titleColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder = apply {
            this.titleColor = color
        }

        override fun titleStyle(style: MotionProperty<TextStyle>): NoteMotionStyleBuilder = apply {
            this.titleStyle = style
        }

        override fun textColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder = apply {
            this.textColor = color
        }

        override fun textStyle(style: MotionProperty<TextStyle>): NoteMotionStyleBuilder = apply {
            this.textStyle = style
        }

        override fun contentAfterColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder = apply {
            this.contentAfterColor = color
        }

        override fun contentBeforeColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder = apply {
            this.contentBeforeColor = color
        }

        override fun closeColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder = apply {
            this.closeColor = color
        }

        override fun backgroundColor(color: MotionProperty<Brush>): NoteMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun style(): NoteMotionStyle {
            return NoteMotionStyleImpl(
                textColor = textColor ?: noMotion(),
                textStyle = textStyle ?: noMotion(),
                titleColor = titleColor ?: noMotion(),
                titleStyle = titleStyle ?: noMotion(),
                contentAfterColor = contentAfterColor ?: noMotion(),
                contentBeforeColor = contentBeforeColor ?: noMotion(),
                closeColor = closeColor ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
            )
        }
    }
}
