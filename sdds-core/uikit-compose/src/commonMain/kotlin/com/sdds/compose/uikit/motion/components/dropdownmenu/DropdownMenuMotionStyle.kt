package com.sdds.compose.uikit.motion.components.dropdownmenu

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.components.popover.PopoverMotionStyle
import com.sdds.compose.uikit.motion.components.popover.PopoverMotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

/**
 * CompositionLocal, предоставляющий текущий [DropdownMenuMotionStyle].
 */
val LocalDropdownMenuMotionStyle = compositionLocalOf { DropdownMenuMotionStyle.builder().style() }

/**
 * Описывает анимационные свойства [DropdownMenu].
 */
@Stable
interface DropdownMenuMotionStyle : PopoverMotionStyle {

    companion object {
        /**
         * Создает билдер для построения [DropdownMenuMotionStyle].
         */
        fun builder(): DropdownMenuMotionStyleBuilder = DropdownMenuMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [DropdownMenuMotionStyle].
 */
@Stable
interface DropdownMenuMotionStyleBuilder : PopoverMotionStyleBuilder {
    /**
     * Устанавливает анимационное свойство цвета фона DropdownMenu.
     */
    override fun backgroundColor(background: MotionProperty<Brush>): DropdownMenuMotionStyleBuilder
    override fun style(): DropdownMenuMotionStyle
}

@Immutable
private class DropdownMenuMotionStyleImpl(
    override val backgroundColor: MotionProperty<Brush>,
) : DropdownMenuMotionStyle {

    class Builder : DropdownMenuMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Brush>? = null

        override fun backgroundColor(background: MotionProperty<Brush>) = apply {
            this.backgroundColor = background
        }
        override fun style(): DropdownMenuMotionStyle = DropdownMenuMotionStyleImpl(
            backgroundColor = backgroundColor ?: noMotion(),
        )
    }
}
