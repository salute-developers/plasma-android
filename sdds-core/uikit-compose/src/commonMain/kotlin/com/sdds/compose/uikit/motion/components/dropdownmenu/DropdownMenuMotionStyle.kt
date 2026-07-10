package com.sdds.compose.uikit.motion.components.dropdownmenu

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import com.sdds.compose.uikit.DropdownMenu
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder

/**
 * CompositionLocal, предоставляющий текущий [DropdownMenuMotionStyle].
 */
val LocalDropdownMenuMotionStyle = compositionLocalOf { DropdownMenuMotionStyle.builder().style() }

/**
 * Описывает анимационные свойства [DropdownMenu].
 */
@Stable
interface DropdownMenuMotionStyle : MotionStyle {

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
interface DropdownMenuMotionStyleBuilder : MotionStyleBuilder<DropdownMenuMotionStyle>

@Immutable
private class DropdownMenuMotionStyleImpl : DropdownMenuMotionStyle {

    class Builder : DropdownMenuMotionStyleBuilder {
        override fun style(): DropdownMenuMotionStyle = DropdownMenuMotionStyleImpl()
    }
}
