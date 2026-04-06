package com.sdds.compose.uikit.components.tabs

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import com.sdds.compose.uikit.components.counter.CounterMotionStyle
import com.sdds.compose.uikit.internal.common.FillStyle
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.MotionStyle
import com.sdds.compose.uikit.motion.MotionStyleBuilder
import com.sdds.compose.uikit.motion.noMotion

val LocalTabItemMotionStyle = compositionLocalOf { TabItemMotionStyle.builder().style() }

@Stable
interface TabItemMotionStyle : MotionStyle {

    val backgroundFillStyle: MotionProperty<FillStyle>

    val labelFillStyle: MotionProperty<FillStyle>

    val valueFillStyle: MotionProperty<FillStyle>

    val startContentFillStyle: MotionProperty<FillStyle>

    val endContentFillStyle: MotionProperty<FillStyle>

    val actionFillStyle: MotionProperty<FillStyle>

    val counterMotionStyle: CounterMotionStyle?

    companion object {
        fun builder(): TabItemMotionStyleBuilder = TabItemMotionStyleImpl.Builder()
    }
}

@Stable
interface TabItemMotionStyleBuilder : MotionStyleBuilder<TabItemMotionStyle> {

    fun backgroundFillStyle(background: MotionProperty<FillStyle>): TabItemMotionStyleBuilder

    fun labelFillStyle(label: MotionProperty<FillStyle>): TabItemMotionStyleBuilder

    fun valueFillStyle(value: MotionProperty<FillStyle>): TabItemMotionStyleBuilder

    fun startContentFillStyle(startContent: MotionProperty<FillStyle>): TabItemMotionStyleBuilder

    fun endContentFillStyle(endContent: MotionProperty<FillStyle>): TabItemMotionStyleBuilder

    fun actionFillStyle(action: MotionProperty<FillStyle>): TabItemMotionStyleBuilder

    fun counterMotionStyle(style: CounterMotionStyle): TabItemMotionStyleBuilder
}

@Immutable
private class TabItemMotionStyleImpl(
    override val backgroundFillStyle: MotionProperty<FillStyle>,
    override val labelFillStyle: MotionProperty<FillStyle>,
    override val valueFillStyle: MotionProperty<FillStyle>,
    override val startContentFillStyle: MotionProperty<FillStyle>,
    override val endContentFillStyle: MotionProperty<FillStyle>,
    override val actionFillStyle: MotionProperty<FillStyle>,
    override val counterMotionStyle: CounterMotionStyle?,
) : TabItemMotionStyle {

    class Builder : TabItemMotionStyleBuilder {
        private var background: MotionProperty<FillStyle>? = null
        private var label: MotionProperty<FillStyle>? = null
        private var value: MotionProperty<FillStyle>? = null
        private var startContent: MotionProperty<FillStyle>? = null
        private var endContent: MotionProperty<FillStyle>? = null
        private var action: MotionProperty<FillStyle>? = null
        private var counterMotionStyle: CounterMotionStyle? = null

        override fun backgroundFillStyle(background: MotionProperty<FillStyle>) = apply {
            this.background = background
        }

        override fun labelFillStyle(label: MotionProperty<FillStyle>) = apply {
            this.label = label
        }

        override fun valueFillStyle(value: MotionProperty<FillStyle>) = apply {
            this.value = value
        }

        override fun startContentFillStyle(startContent: MotionProperty<FillStyle>) = apply {
            this.startContent = startContent
        }

        override fun endContentFillStyle(endContent: MotionProperty<FillStyle>) = apply {
            this.endContent = endContent
        }

        override fun actionFillStyle(action: MotionProperty<FillStyle>) = apply {
            this.action = action
        }

        override fun counterMotionStyle(style: CounterMotionStyle) = apply {
            this.counterMotionStyle = style
        }

        override fun style(): TabItemMotionStyle {
            return TabItemMotionStyleImpl(
                backgroundFillStyle = background ?: noMotion(),
                labelFillStyle = label ?: noMotion(),
                counterMotionStyle = counterMotionStyle,
                valueFillStyle = value ?: noMotion(),
                startContentFillStyle = startContent ?: noMotion(),
                endContentFillStyle = endContent ?: noMotion(),
                actionFillStyle = action ?: noMotion()
            )
        }

    }
}
