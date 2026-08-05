package com.sdds.compose.uikit.motion.components.skeleton

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [TextSkeletonMotionStyle]
 */
val LocalTextSkeletonMotionStyle = compositionLocalOf { TextSkeletonMotionStyle.builder().style() }

/**
 * Стиль анимаций [TextSkeleton]
 */
@Stable
interface TextSkeletonMotionStyle : RectSkeletonMotionStyle {

    /**
     * Анимационное свойство стиля текста
     */
    val textStyle: MotionProperty<TextStyle>

    companion object {

        /**
         * Возвращает [TextSkeletonMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): TextSkeletonMotionStyleBuilder = TextSkeletonMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [TextSkeleton]
 */
@Stable
interface TextSkeletonMotionStyleBuilder : RectSkeletonMotionStyleBuilder {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    override fun gradientBrush(brush: MotionProperty<Brush>): TextSkeletonMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля текста.
     */
    fun textStyle(textStyle: MotionProperty<TextStyle>): TextSkeletonMotionStyleBuilder

    override fun style(): TextSkeletonMotionStyle
}

@Immutable
private class TextSkeletonMotionStyleImpl(
    override val gradientBrush: MotionProperty<Brush>,
    override val textStyle: MotionProperty<TextStyle>,
) : TextSkeletonMotionStyle {

    class Builder : TextSkeletonMotionStyleBuilder {
        private var gradientBrush: MotionProperty<Brush>? = null
        private var textStyle: MotionProperty<TextStyle>? = null

        override fun gradientBrush(brush: MotionProperty<Brush>) = apply {
            this.gradientBrush = brush
        }

        override fun textStyle(textStyle: MotionProperty<TextStyle>) = apply {
            this.textStyle = textStyle
        }

        override fun style(): TextSkeletonMotionStyle {
            return TextSkeletonMotionStyleImpl(
                gradientBrush = gradientBrush ?: noMotion(),
                textStyle = textStyle ?: noMotion(),
            )
        }
    }
}
