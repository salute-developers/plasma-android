package com.sdds.compose.uikit.motion.components.editable

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
 * CompositionLocal для стиля [EditableMotionStyle]
 */
val LocalEditableMotionStyle = compositionLocalOf { EditableMotionStyle.builder().style() }

/**
 * Стиль анимаций [Editable]
 */
@Stable
interface EditableMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти иконки.
     */
    val iconColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти курсора.
     */
    val cursorColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти текста.
     */
    val textColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля текста.
     */
    val textStyle: MotionProperty<TextStyle>

    companion object {

        /**
         * Возвращает [EditableMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): EditableMotionStyleBuilder = EditableMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [Editable]
 */
@Stable
interface EditableMotionStyleBuilder : MotionStyleBuilder<EditableMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета иконки.
     */
    fun iconColor(color: MotionProperty<Brush>): EditableMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета курсора.
     */
    fun cursorColor(color: MotionProperty<Brush>): EditableMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения цвета текста.
     */
    fun textBrush(color: MotionProperty<Brush>): EditableMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста.
     */
    fun textStyle(style: MotionProperty<TextStyle>): EditableMotionStyleBuilder
}

@Immutable
private class EditableMotionStyleImpl(
    override val iconColor: MotionProperty<Brush>,
    override val textColor: MotionProperty<Brush>,
    override val textStyle: MotionProperty<TextStyle>,
    override val cursorColor: MotionProperty<Brush>,
) : EditableMotionStyle {

    class Builder : EditableMotionStyleBuilder {
        private var iconColor: MotionProperty<Brush>? = null
        private var cursorColor: MotionProperty<Brush>? = null
        private var textColor: MotionProperty<Brush>? = null
        private var textStyle: MotionProperty<TextStyle>? = null

        override fun iconColor(color: MotionProperty<Brush>) = apply {
            this.iconColor = color
        }

        override fun cursorColor(color: MotionProperty<Brush>) = apply {
            this.cursorColor = color
        }

        override fun textBrush(color: MotionProperty<Brush>) = apply {
            this.textColor = color
        }

        override fun textStyle(style: MotionProperty<TextStyle>) = apply {
            this.textStyle = style
        }

        override fun style(): EditableMotionStyle {
            return EditableMotionStyleImpl(
                iconColor = iconColor ?: noMotion(),
                cursorColor = cursorColor ?: noMotion(),
                textColor = textColor ?: noMotion(),
                textStyle = textStyle ?: noMotion(),
            )
        }
    }
}
