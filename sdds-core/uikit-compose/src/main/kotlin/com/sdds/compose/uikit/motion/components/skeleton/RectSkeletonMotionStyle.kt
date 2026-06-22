package com.sdds.compose.uikit.motion.components.skeleton

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [RectSkeletonMotionStyle]
 */
val LocalRectSkeletonMotionStyle = compositionLocalOf { RectSkeletonMotionStyle.builder().style() }

/**
 * Стиль анимаций [RectSkeleton]
 */
@Stable
interface RectSkeletonMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val gradientBrush: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [RectSkeletonMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): RectSkeletonMotionStyleBuilder = RectSkeletonMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [RectSkeleton]
 */
@Stable
interface RectSkeletonMotionStyleBuilder : MotionStyleBuilder<RectSkeletonMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun gradientBrush(brush: MotionProperty<Brush>): RectSkeletonMotionStyleBuilder
}

@Immutable
private class RectSkeletonMotionStyleImpl(
    override val gradientBrush: MotionProperty<Brush>,
) : RectSkeletonMotionStyle {

    class Builder : RectSkeletonMotionStyleBuilder {
        private var gradientBrush: MotionProperty<Brush>? = null

        override fun gradientBrush(brush: MotionProperty<Brush>) = apply {
            this.gradientBrush = brush
        }

        override fun style(): RectSkeletonMotionStyle {
            return RectSkeletonMotionStyleImpl(
                gradientBrush = gradientBrush ?: noMotion(),
            )
        }
    }
}
