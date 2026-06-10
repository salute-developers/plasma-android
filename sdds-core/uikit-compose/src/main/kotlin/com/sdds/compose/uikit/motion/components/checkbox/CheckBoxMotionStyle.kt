package com.sdds.compose.uikit.motion.components.checkbox

import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.components.common.CheckableMotionStyle
import com.sdds.compose.uikit.motion.components.common.CheckableMotionStyleBuilder
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.noMotion
import com.sdds.compose.uikit.motion.transition

/**
 * CompositionLocal, предоставляющий текущий [CheckBoxMotionStyle].
 * Используется для доступа к анимационным свойствам CheckBox внутри Compose-иерархии.
 */
val LocalCheckBoxMotionStyle = compositionLocalOf { CheckBoxMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента CheckBox.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface CheckBoxMotionStyle : CheckableMotionStyle {

    /**
     * Анимационное свойство контрола CheckBox.
     */
    val toggleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета центральной иконки CheckBox.
     */
    val toggleIconColor: MotionProperty<Brush>

    companion object {
        /**
         * Создает билдер для построения [CheckBoxMotionStyle].
         */
        fun builder(): CheckBoxMotionStyleBuilder = CheckBoxMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [CheckBoxMotionStyle].
 */
@Stable
interface CheckBoxMotionStyleBuilder : CheckableMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    override fun labelColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    override fun labelStyle(style: MotionProperty<TextStyle>): CheckBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета description.
     */
    override fun descriptionColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля description.
     */
    override fun descriptionStyle(style: MotionProperty<TextStyle>): CheckBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство подвижного элемента переключателя (thumb) CheckBox.
     */
    fun toggleColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета неподвижного элемента переключателя (track) CheckBox.
     */
    fun toggleIconColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета бордера неподвижной части CheckBox.
     */
    override fun toggleBorderColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона CheckBox.
     */
    override fun backgroundColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder

    override fun style(): CheckBoxMotionStyle
}

@Immutable
private class CheckBoxMotionStyleImpl(
    override val labelColor: MotionProperty<Brush>,
    override val descriptionColor: MotionProperty<Brush>,
    override val toggleColor: MotionProperty<Brush>,
    override val toggleIconColor: MotionProperty<Brush>,
    override val toggleBorderColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val descriptionStyle: MotionProperty<TextStyle>,
) : CheckBoxMotionStyle {

    class Builder : CheckBoxMotionStyleBuilder {
        private var labelColor: MotionProperty<Brush>? = null
        private var descriptionColor: MotionProperty<Brush>? = null
        private var toggleThumbColor: MotionProperty<Brush>? = null
        private var toggleTrackColor: MotionProperty<Brush>? = null
        private var toggleTrackBorderColor: MotionProperty<Brush>? = null
        private var backgroundColor: MotionProperty<Brush>? = null

        private var labelStyle: MotionProperty<TextStyle>? = null
        private var descriptionStyle: MotionProperty<TextStyle>? = null

        override fun labelColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder = apply {
            this.labelColor = color
        }

        override fun labelStyle(style: MotionProperty<TextStyle>): CheckBoxMotionStyleBuilder = apply {
            this.labelStyle = style
        }

        override fun descriptionColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder = apply {
            this.descriptionColor = color
        }

        override fun descriptionStyle(style: MotionProperty<TextStyle>): CheckBoxMotionStyleBuilder = apply {
            this.descriptionStyle = style
        }

        override fun toggleColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder = apply {
            this.toggleThumbColor = color
        }

        override fun toggleIconColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder = apply {
            this.toggleTrackColor = color
        }

        override fun toggleBorderColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder = apply {
            this.toggleTrackBorderColor = color
        }

        override fun backgroundColor(color: MotionProperty<Brush>): CheckBoxMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun style(): CheckBoxMotionStyle {
            return CheckBoxMotionStyleImpl(
                labelColor = labelColor ?: noMotion(),
                descriptionColor = descriptionColor ?: noMotion(),
                toggleColor = toggleThumbColor ?: noMotion(),
                toggleIconColor = toggleTrackColor ?: noMotion(),
                toggleBorderColor = toggleTrackBorderColor ?: noMotion(),
                backgroundColor = backgroundColor ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                descriptionStyle = descriptionStyle ?: noMotion(),
            )
        }
    }
}

private val CheckBoxBrushTransitionMotion = transition<Brush> (label = "CheckBoxTransition") {
    segment {
        condition { state -> state changes CheckBoxStates.Checked }
    } changesWith { finite(tween(200)) }

    segment {} changesWith { finite(snap()) }
}

private val DefaultCheckBoxMotionStyle = CheckBoxMotionStyle.builder()
    .toggleColor(CheckBoxBrushTransitionMotion)
    .toggleIconColor(CheckBoxBrushTransitionMotion)
    .toggleBorderColor(CheckBoxBrushTransitionMotion)
    .style()
