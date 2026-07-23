package com.sdds.compose.uikit.motion.components.popover

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import com.sdds.compose.uikit.Popover
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder

/**
 * CompositionLocal, предоставляющий текущий [PopoverMotionStyle].
 */
val LocalPopoverMotionStyle = compositionLocalOf { PopoverMotionStyle.builder().style() }

/**
 * Описывает анимационные свойства [Popover].
 */
@Stable
interface PopoverMotionStyle : MotionStyle {

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
interface PopoverMotionStyleBuilder : MotionStyleBuilder<PopoverMotionStyle>

@Immutable
private class PopoverMotionStyleImpl : PopoverMotionStyle {

    class Builder : PopoverMotionStyleBuilder {
        override fun style(): PopoverMotionStyle = PopoverMotionStyleImpl()
    }
}
