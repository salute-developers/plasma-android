package com.sdds.compose.uikit.motion.components.file

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
 * CompositionLocal для стиля [FileMotionStyle]
 */
val LocalFileMotionStyle = compositionLocalOf { FileMotionStyle.builder().style() }

/**
 * Стиль анимаций [File]
 */
@Stable
interface FileMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти иконки.
     */
    val iconColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти загловка.
     */
    val labelColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти описания.
     */
    val descriptionColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля заголовка.
     */
    val labelStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство стиля описания.
     */
    val descriptionStyle: MotionProperty<TextStyle>

    companion object {

        /**
         * Возвращает [FileMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): FileMotionStyleBuilder = FileMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [File]
 */
@Stable
interface FileMotionStyleBuilder : MotionStyleBuilder<FileMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета иконки.
     */
    fun iconColor(color: MotionProperty<Brush>): FileMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета фона.
     */
    fun backgroundColor(color: MotionProperty<Brush>): FileMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета заголовка.
     */
    fun labelColor(color: MotionProperty<Brush>): FileMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета описания.
     */
    fun descriptionColor(color: MotionProperty<Brush>): FileMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля заголовка.
     */
    fun labelStyle(style: MotionProperty<TextStyle>): FileMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля описания.
     */
    fun descriptionStyle(style: MotionProperty<TextStyle>): FileMotionStyleBuilder
}

@Immutable
private class FileMotionStyleImpl(
    override val iconColor: MotionProperty<Brush>,
    override val descriptionColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val labelColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
    override val descriptionStyle: MotionProperty<TextStyle>,
) : FileMotionStyle {

    class Builder : FileMotionStyleBuilder {
        private var iconColor: MotionProperty<Brush>? = null
        private var descriptionColor: MotionProperty<Brush>? = null
        private var labelColor: MotionProperty<Brush>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var labelStyle: MotionProperty<TextStyle>? = null
        private var descriptionStyle: MotionProperty<TextStyle>? = null

        override fun iconColor(color: MotionProperty<Brush>) = apply {
            this.iconColor = color
        }

        override fun descriptionColor(color: MotionProperty<Brush>) = apply {
            this.descriptionColor = color
        }

        override fun labelColor(color: MotionProperty<Brush>) = apply {
            this.labelColor = color
        }

        override fun backgroundColor(color: MotionProperty<Brush>) = apply {
            this.backgroundColor = color
        }

        override fun descriptionStyle(style: MotionProperty<TextStyle>) = apply {
            this.descriptionStyle = style
        }

        override fun labelStyle(style: MotionProperty<TextStyle>) = apply {
            this.labelStyle = style
        }

        override fun style(): FileMotionStyle {
            return FileMotionStyleImpl(
                iconColor = iconColor ?: noMotion(),
                labelColor = labelColor ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
                descriptionColor = descriptionColor ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                descriptionStyle = descriptionStyle ?: noMotion(),
            )
        }
    }
}
