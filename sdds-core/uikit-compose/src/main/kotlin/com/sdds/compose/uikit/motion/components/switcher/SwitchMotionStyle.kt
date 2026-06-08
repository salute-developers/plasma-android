package com.sdds.compose.uikit.motion.components.switcher

import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.TransitionMotionProperty
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.components.common.CheckableMotionStyle
import com.sdds.compose.uikit.motion.components.common.CheckableMotionStyleBuilder
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.noMotion
import com.sdds.compose.uikit.motion.transition

/**
 * CompositionLocal, предоставляющий текущий [SwitchMotionStyle].
 * Используется для доступа к анимационным свойствам Switch внутри Compose-иерархии.
 */
val LocalSwitchMotionStyle = compositionLocalOf { SwitchMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента Switch.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface SwitchMotionStyle : CheckableMotionStyle {

    /**
     * Анимационное свойство подвижного элемента переключателя (thumb) Switch.
     */
    val toggleThumbColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета неподвижного элемента переключателя (track) Switch.
     */
    val toggleTrackColor: MotionProperty<Brush>

    /**
     * Transition для изменения положения переключателя (thumb).
     */
    val thumbPositionTransition: TransitionMotionProperty<Float>

    companion object {
        /**
         * Создает билдер для построения [SwitchMotionStyle].
         */
        fun builder(): SwitchMotionStyleBuilder = SwitchMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [SwitchMotionStyle].
 */
@Stable
interface SwitchMotionStyleBuilder : CheckableMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    override fun labelColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    override fun labelStyle(style: MotionProperty<TextStyle>): SwitchMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета description.
     */
    override fun descriptionColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля description.
     */
    override fun descriptionStyle(style: MotionProperty<TextStyle>): SwitchMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство подвижного элемента переключателя (thumb) Switch.
     */
    fun toggleThumbColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета неподвижного элемента переключателя (track) Switch.
     */
    fun toggleTrackColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета бордера неподвижной части Switch.
     */
    override fun toggleBorderColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона Switch.
     */
    override fun backgroundColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder

    /**
     * Устанавливает Transition для изменения изменения положения переключателя (thumb).
     */
    fun thumbPositionTransition(transition: TransitionMotionProperty<Float>): SwitchMotionStyleBuilder
    override fun style(): SwitchMotionStyle
}

@Immutable
private class SwitchMotionStyleImpl(
    override val labelColor: MotionProperty<Brush>,
    override val descriptionColor: MotionProperty<Brush>,
    override val toggleThumbColor: MotionProperty<Brush>,
    override val toggleTrackColor: MotionProperty<Brush>,
    override val toggleBorderColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val descriptionStyle: MotionProperty<TextStyle>,
    override val thumbPositionTransition: TransitionMotionProperty<Float>,
) : SwitchMotionStyle {

    class Builder : SwitchMotionStyleBuilder {
        private var labelColor: MotionProperty<Brush>? = null
        private var descriptionColor: MotionProperty<Brush>? = null
        private var toggleThumbColor: MotionProperty<Brush>? = null
        private var toggleTrackColor: MotionProperty<Brush>? = null
        private var toggleTrackBorderColor: MotionProperty<Brush>? = null
        private var backgroundColor: MotionProperty<Brush>? = null

        private var labelStyle: MotionProperty<TextStyle>? = null
        private var descriptionStyle: MotionProperty<TextStyle>? = null
        private var thumbPositionTransition: TransitionMotionProperty<Float>? = null

        override fun labelColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder = apply {
            this.labelColor = color
        }

        override fun labelStyle(style: MotionProperty<TextStyle>): SwitchMotionStyleBuilder = apply {
            this.labelStyle = style
        }

        override fun descriptionColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder = apply {
            this.descriptionColor = color
        }

        override fun descriptionStyle(style: MotionProperty<TextStyle>): SwitchMotionStyleBuilder = apply {
            this.descriptionStyle = style
        }

        override fun toggleThumbColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder = apply {
            this.toggleThumbColor = color
        }

        override fun toggleTrackColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder = apply {
            this.toggleTrackColor = color
        }

        override fun toggleBorderColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder = apply {
            this.toggleTrackBorderColor = color
        }

        override fun backgroundColor(color: MotionProperty<Brush>): SwitchMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun thumbPositionTransition(transition: TransitionMotionProperty<Float>): SwitchMotionStyleBuilder =
            apply {
                this.thumbPositionTransition = transition
            }

        override fun style(): SwitchMotionStyle {
            return SwitchMotionStyleImpl(
                labelColor = labelColor ?: noMotion(),
                descriptionColor = descriptionColor ?: noMotion(),
                toggleThumbColor = toggleThumbColor ?: noMotion(),
                toggleTrackColor = toggleTrackColor ?: noMotion(),
                toggleBorderColor = toggleTrackBorderColor ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                descriptionStyle = descriptionStyle ?: noMotion(),
                thumbPositionTransition = ThumpPositionTransitionMotion,
            )
        }
    }
}

private val ThumpPositionTransitionMotion = transition<Float>(
    label = "SwitchFloatTransition",
) {
    segment {
        condition { state -> state changes SwitchStates.Checked }
    } changesWith { finite(tween(200)) }

    segment {} changesWith { finite(snap()) }
}
