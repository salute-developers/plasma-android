package com.sdds.compose.uikit.motion.components.splitter

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.divider.DividerMotionStyle
import com.sdds.compose.uikit.motion.components.divider.DividerMotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [SplitterMotionStyle]
 */
val LocalSplitterMotionStyle = compositionLocalOf { SplitterMotionStyle.builder().style() }

/**
 * Стиль анимаций [Splitter]
 */
@Stable
interface SplitterMotionStyle : DividerMotionStyle {

    /**
     * Анимация изменения кисти линий ручки
     */
    val handleColor: MotionProperty<InteractiveColor>

    companion object {

        /**
         * Возвращает [SplitterMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): SplitterMotionStyleBuilder = SplitterMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [Splitter]
 */
@Stable
interface SplitterMotionStyleBuilder : DividerMotionStyleBuilder {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    override fun backgroundColor(backgroundColor: MotionProperty<Brush>): SplitterMotionStyleBuilder

    /**
     * Устанавливает анимацию изменения кисти линий ручки
     */
    fun handleColor(handleColor: MotionProperty<InteractiveColor>): SplitterMotionStyleBuilder

    override fun style(): SplitterMotionStyle
}

@Immutable
private class SplitterMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
    override val handleColor: MotionProperty<InteractiveColor>,
) : SplitterMotionStyle {

    class Builder : SplitterMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null
        private var handleColor: MotionProperty<InteractiveColor>? = null

        override fun backgroundColor(backgroundColor: MotionProperty<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun handleColor(handleColor: MotionProperty<InteractiveColor>) = apply {
            this.handleColor = handleColor
        }

        override fun style(): SplitterMotionStyle {
            return SplitterMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
                handleColor = handleColor ?: noMotion(),
            )
        }
    }
}
