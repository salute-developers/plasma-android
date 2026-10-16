package com.sdds.compose.uikit.motion.components.avatar
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
 * CompositionLocal для стиля [AvatarMotionStyle]
 */
val LocalAvatarMotionStyle = compositionLocalOf { AvatarMotionStyle.builder().style() }

/**
 * Стиль анимаций [Avatar]
 */
@Stable
interface AvatarMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val backgroundColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти иконки действия
     */
    val actionColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти фона иконки действия
     */
    val actionScrimColor: MotionProperty<Brush>

    /**
     * Анимация изменения кисти текста
     */
    val textColor: MotionProperty<Brush>

    /**
     * Анимация изменения стиля текста
     */
    val textStyle: MotionProperty<TextStyle>

    companion object {

        /**
         * Возвращает [AvatarMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): AvatarMotionStyleBuilder = AvatarMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [Avatar]
 */
@Stable
interface AvatarMotionStyleBuilder : MotionStyleBuilder<AvatarMotionStyle> {

    /**
     * Устанавливает анимацию изменения кисти фона
     */
    fun backgroundColor(color: MotionProperty<Brush>): AvatarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти иконки действия
     */
    fun actionColor(color: MotionProperty<Brush>): AvatarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти фона иконки действия
     */
    fun actionScrimColor(color: MotionProperty<Brush>): AvatarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти текста
     */
    fun textColor(color: MotionProperty<Brush>): AvatarMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения стиля текста
     */
    fun textStyle(style: MotionProperty<TextStyle>): AvatarMotionStyleBuilder
}

@Immutable
private class AvatarMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val actionColor: MotionProperty<Brush>,
    override val actionScrimColor: MotionProperty<Brush>,
    override val textColor: MotionProperty<Brush>,
    override val textStyle: MotionProperty<TextStyle>,
) : AvatarMotionStyle {

    class Builder : AvatarMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var actionColor: MotionProperty<Brush>? = null
        private var actionScrimColor: MotionProperty<Brush>? = null
        private var textColor: MotionProperty<Brush>? = null
        private var textStyle: MotionProperty<TextStyle>? = null

        override fun backgroundColor(color: MotionProperty<Brush>) = apply {
            this.backgroundColor = color
        }

        override fun actionColor(color: MotionProperty<Brush>) = apply {
            this.actionColor = color
        }

        override fun actionScrimColor(color: MotionProperty<Brush>) = apply {
            this.actionScrimColor = color
        }

        override fun textColor(color: MotionProperty<Brush>) = apply {
            this.textColor = color
        }

        override fun textStyle(style: MotionProperty<TextStyle>) = apply {
            this.textStyle = style
        }

        override fun style(): AvatarMotionStyle {
            return AvatarMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
                actionColor = actionColor ?: noMotion(),
                actionScrimColor = actionScrimColor ?: noMotion(),
                textColor = textColor ?: noMotion(),
                textStyle = textStyle ?: noMotion(),
            )
        }
    }
}
