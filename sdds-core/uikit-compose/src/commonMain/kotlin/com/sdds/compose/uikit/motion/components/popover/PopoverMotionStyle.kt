package com.sdds.compose.uikit.motion.components.popover

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [PopoverMotionStyle].
 */
val LocalPopoverMotionStyle = compositionLocalOf { PopoverMotionStyle.builder().style() }

/**
 * Описывает анимационные свойства [Popover].
 */
@Stable
interface PopoverMotionStyle : MotionStyle {

    /**
     * Анимация изменения кисти фона
     */
    val backgroundColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [PopoverMotionStyle].
         */
        fun builder(): PopoverMotionStyleBuilder = PopoverMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [PopoverMotionStyle].
 */
@Stable
interface PopoverMotionStyleBuilder : MotionStyleBuilder<PopoverMotionStyle> {
    /**
     * Устанавливает анимацию изменения цвета фона
     */
    fun backgroundColor(background: MotionProperty<Brush>): PopoverMotionStyleBuilder
}

@Immutable
private class PopoverMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
) : PopoverMotionStyle {

    class Builder : PopoverMotionStyleBuilder {

        private var backgroundColor: MotionProperty<Brush>? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.backgroundColor = background
        }

        override fun style(): PopoverMotionStyle {
            return PopoverMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
            )
        }
    }
}
