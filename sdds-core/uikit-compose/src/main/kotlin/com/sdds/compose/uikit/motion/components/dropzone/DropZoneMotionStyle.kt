package com.sdds.compose.uikit.motion.components.dropzone

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
 * CompositionLocal для [DropZoneMotionStyle].
 */
val LocalDropZoneMotionStyle = compositionLocalOf {
    DropZoneMotionStyle.builder().style()
}

/**
 * Стиль анимаций [DropZone].
 */
@Stable
interface DropZoneMotionStyle : MotionStyle {

    /**
     * Анимационное свойство цвета заголовка (title).
     */
    val titleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля заголовка (title).
     */
    val titleStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета описания (description).
     */
    val descriptionColor: MotionProperty<Brush>

    /**
     * Анимационное свойство стиля описания (description).
     */
    val descriptionStyle: MotionProperty<TextStyle>

    /**
     * Анимационное свойство цвета фона.
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета иконки.
     */
    val iconColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета бордера.
     */
    val borderColor: MotionProperty<Brush>

    companion object {
        /**
         * Возвращает builder [DropZoneMotionStyle].
         */
        fun builder(): DropZoneMotionStyleBuilder = DefaultDropZoneMotionStyle.Builder()
    }
}

/**
 * Builder [DropZoneMotionStyle].
 */
interface DropZoneMotionStyleBuilder : MotionStyleBuilder<DropZoneMotionStyle> {
    /**
     * Устанавливает анимацию фона.
     */
    fun background(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder

    /**
     * Устанавливает анимацию фона.
     */
    fun borderColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder

    /**
     * Устанавливает анимацию icon/start кисти.
     */
    fun iconColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета title.
     */
    fun titleColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля title.
     */
    fun titleStyle(style: MotionProperty<TextStyle>): DropZoneMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета description.
     */
    fun descriptionColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля description.
     */
    fun descriptionStyle(style: MotionProperty<TextStyle>): DropZoneMotionStyleBuilder
}

@Immutable
private data class DefaultDropZoneMotionStyle(
    override val titleColor: MotionProperty<Brush>,
    override val titleStyle: MotionProperty<TextStyle>,
    override val descriptionColor: MotionProperty<Brush>,
    override val descriptionStyle: MotionProperty<TextStyle>,
    override val backgroundColor: MotionProperty<Brush>,
    override val iconColor: MotionProperty<Brush>,
    override val borderColor: MotionProperty<Brush>,
) : DropZoneMotionStyle {
    class Builder : DropZoneMotionStyleBuilder {
        private var titleColor: MotionProperty<Brush>? = null
        private var titleStyle: MotionProperty<TextStyle>? = null
        private var descriptionColor: MotionProperty<Brush>? = null
        private var descriptionStyle: MotionProperty<TextStyle>? = null
        private var backgroundColor: MotionProperty<Brush>? = null
        private var iconColor: MotionProperty<Brush>? = null
        private var borderColor: MotionProperty<Brush>? = null

        override fun background(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun borderColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder = apply {
            this.borderColor = color
        }

        override fun iconColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder = apply {
            this.iconColor = color
        }

        override fun titleColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder = apply {
            this.titleColor = color
        }

        override fun titleStyle(style: MotionProperty<TextStyle>): DropZoneMotionStyleBuilder = apply {
            this.titleStyle = style
        }

        override fun descriptionColor(color: MotionProperty<Brush>): DropZoneMotionStyleBuilder = apply {
            this.descriptionColor = color
        }

        override fun descriptionStyle(style: MotionProperty<TextStyle>): DropZoneMotionStyleBuilder = apply {
            this.descriptionStyle = style
        }

        override fun style(): DropZoneMotionStyle {
            return DefaultDropZoneMotionStyle(
                titleColor = titleColor ?: noMotion(),
                titleStyle = titleStyle ?: noMotion(),
                descriptionColor = descriptionColor ?: noMotion(),
                descriptionStyle = descriptionStyle ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
                iconColor = iconColor ?: noMotion(),
                borderColor = borderColor ?: noMotion(),
            )
        }
    }
}
