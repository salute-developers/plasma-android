package com.sdds.compose.uikit.motion.components.toolbar

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [ToolBarMotionStyle]
 */
val LocalToolBarMotionStyle = compositionLocalOf { ToolBarMotionStyle.builder().style() }

/**
 * Стиль анимаций [ToolBar]
 */
@Stable
interface ToolBarMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val background: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [ToolBarMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): ToolBarMotionStyleBuilder = ToolBarMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [ToolBar]
 */
@Stable
interface ToolBarMotionStyleBuilder : MotionStyleBuilder<ToolBarMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun background(background: MotionProperty<Brush>): ToolBarMotionStyleBuilder
}

@Immutable
private class ToolBarMotionStyleImpl(
    override val background: MotionProperty<Brush>,
) : ToolBarMotionStyle {

    class Builder : ToolBarMotionStyleBuilder {
        private var background: MotionProperty<Brush>? = null

        override fun background(background: MotionProperty<Brush>) = apply {
            this.background = background
        }

        override fun style(): ToolBarMotionStyle {
            return ToolBarMotionStyleImpl(
                background = background ?: noMotion(),
            )
        }
    }
}
