package com.sdds.compose.uikit.components.tabs

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import com.sdds.compose.uikit.components.counter.CounterMotionStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

val LocalTabItemMotionStyle = compositionLocalOf { TabItemMotionStyle.builder().style() }

@Stable
interface TabItemMotionStyle : MotionStyle {

    val background: MotionProperty<Color>

    val textColor: MotionProperty<Color>

    val counterMotionStyle: CounterMotionStyle?

    companion object {
        fun builder(): TabItemMotionStyleBuilder = TabItemMotionStyleImpl.Builder()
    }
}

@Stable
interface TabItemMotionStyleBuilder : MotionStyleBuilder<TabItemMotionStyle> {

    fun background(background: MotionProperty<Color>): TabItemMotionStyleBuilder

    fun textColor(textColor: MotionProperty<Color>): TabItemMotionStyleBuilder

    fun counterMotionStyle(style: CounterMotionStyle): TabItemMotionStyleBuilder
}

@Immutable
private class TabItemMotionStyleImpl(
    override val background: MotionProperty<Color>,
    override val textColor: MotionProperty<Color>,
    override val counterMotionStyle: CounterMotionStyle?
) : TabItemMotionStyle {

    class Builder : TabItemMotionStyleBuilder {
        private var background: MotionProperty<Color>? = null
        private var textColor: MotionProperty<Color>? = null
        private var counterMotionStyle: CounterMotionStyle? = null
        override fun background(background: MotionProperty<Color>) = apply {
            this.background = background
        }

        override fun textColor(textColor: MotionProperty<Color>) = apply {
            this.textColor = textColor
        }

        override fun counterMotionStyle(style: CounterMotionStyle) = apply {
            this.counterMotionStyle = style
        }

        override fun style(): TabItemMotionStyle {
            return TabItemMotionStyleImpl(
                background = background ?: noMotion(),
                textColor = textColor ?: noMotion(),
                counterMotionStyle = counterMotionStyle
            )
        }

    }
}
