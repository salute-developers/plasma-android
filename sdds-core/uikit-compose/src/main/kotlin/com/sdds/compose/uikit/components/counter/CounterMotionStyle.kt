package com.sdds.compose.uikit.components.counter

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

val LocalCounterMotionStyle = compositionLocalOf { CounterMotionStyle.builder().style() }

@Stable
interface CounterMotionStyle : MotionStyle {

    val backgroundColor: MotionProperty<Color>

    val textColor: MotionProperty<Color>

    companion object {
        fun builder(): CounterMotionStyleBuilder = CounterMotionStyleImpl.Builder()
    }
}

@Stable
interface CounterMotionStyleBuilder : MotionStyleBuilder<CounterMotionStyle> {

    fun backgroundColor(background: MotionProperty<Color>): CounterMotionStyleBuilder

    fun textColor(textColor: MotionProperty<Color>): CounterMotionStyleBuilder
}

@Immutable
private class CounterMotionStyleImpl(
    override val backgroundColor: MotionProperty<Color>,
    override val textColor: MotionProperty<Color>
) : CounterMotionStyle {

    class Builder : CounterMotionStyleBuilder {
        private var backgroundColor: MotionProperty<Color>? = null
        private var textColor: MotionProperty<Color>? = null
        override fun backgroundColor(background: MotionProperty<Color>) = apply {
            this.backgroundColor = background
        }

        override fun textColor(textColor: MotionProperty<Color>) = apply {
            this.textColor = textColor
        }

        override fun style(): CounterMotionStyle {
            return CounterMotionStyleImpl(
                backgroundColor = backgroundColor ?: noMotion(),
                textColor = textColor ?: noMotion(),
            )
        }

    }
}
