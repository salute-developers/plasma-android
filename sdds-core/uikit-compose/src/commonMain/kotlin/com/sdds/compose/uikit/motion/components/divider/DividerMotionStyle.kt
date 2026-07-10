package com.sdds.compose.uikit.motion.components.divider

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal для стиля [DividerMotionStyle]
 */
val LocalDividerMotionStyle = compositionLocalOf { DividerMotionStyle.builder().style() }

/**
 * Стиль анимаций [Divider]
 */
@Stable
interface DividerMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val backgroundColor: MotionProperty<Brush>

    companion object {

        /**
         * Возвращает [DividerMotionStyleBuilder] для построения стиля анимаций
         */
        fun builder(): DividerMotionStyleBuilder = DividerMotionStyleImpl.Builder()
    }
}

/**
 * Builder стиля анимации [Divider]
 */
@Stable
interface DividerMotionStyleBuilder : MotionStyleBuilder<DividerMotionStyle> {

    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun backgroundColor(backgroundColor: MotionProperty<Brush>): DividerMotionStyleBuilder
}

@Immutable
private class DividerMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
) : DividerMotionStyle {

    class Builder : DividerMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null

        override fun backgroundColor(backgroundColor: MotionProperty<Brush>) = apply {
            this.backgroundColor = backgroundColor
        }

        override fun style(): DividerMotionStyle {
            return DividerMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
            )
        }
    }
}
