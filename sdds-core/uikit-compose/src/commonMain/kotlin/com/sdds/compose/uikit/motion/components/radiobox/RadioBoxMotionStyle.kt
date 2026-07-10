package com.sdds.compose.uikit.motion.components.radiobox

import androidx.compose.animation.core.snap
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.motion.MotionProperty
import com.sdds.compose.uikit.motion.TransitionMotionProperty
import com.sdds.compose.uikit.motion.changes
import com.sdds.compose.uikit.motion.components.common.CheckableMotionStyle
import com.sdds.compose.uikit.motion.components.common.CheckableMotionStyleBuilder
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.noMotion
import com.sdds.compose.uikit.motion.transition

/**
 * CompositionLocal, предоставляющий текущий [RadioBoxMotionStyle].
 * Используется для доступа к анимационным свойствам RadioBox внутри Compose-иерархии.
 */
val LocalRadioBoxMotionStyle = compositionLocalOf { RadioBoxMotionStyle.builder().style() }

/**
 * Описывает анимационные (motion) свойства для элемента RadioBox.
 * Содержит набор [MotionProperty], определяющих поведение цветов и вложенных компонентов
 * при различных состояниях (например, выбран, нажат и т.д.).
 */
@Stable
interface RadioBoxMotionStyle : CheckableMotionStyle {

    /**
     * Анимационное свойство контрола RadioBox.
     */
    val toggleColor: MotionProperty<Brush>

    /**
     * Анимационное свойство цвета центральной иконки RadioBox.
     */
    val toggleIconColor: MotionProperty<Brush>

    /**
     * Анимация высоты иконки.
     */
    val toggleIconHeight: MotionProperty<Dp>

    /**
     * Анимация ширины иконки.
     */
    val toggleIconWidth: MotionProperty<Dp>

    /**
     * Transition для изменения alpha цвета иконки (toggleIcon).
     */
    val toggleIconAlphaTransition: TransitionMotionProperty<Float>

    companion object {
        /**
         * Создает билдер для построения [RadioBoxMotionStyle].
         */
        fun builder(): RadioBoxMotionStyleBuilder = RadioBoxMotionStyleImpl.Builder()
    }
}

/**
 * Билдер для поэтапной конфигурации [RadioBoxMotionStyle].
 */
@Stable
interface RadioBoxMotionStyleBuilder : CheckableMotionStyleBuilder {

    /**
     * Устанавливает анимационное свойство цвета label.
     */
    override fun labelColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля label.
     */
    override fun labelStyle(style: MotionProperty<TextStyle>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета description.
     */
    override fun descriptionColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство стиля description.
     */
    override fun descriptionStyle(style: MotionProperty<TextStyle>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство подвижного элемента переключателя (thumb) RadioBox.
     */
    fun toggleColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета неподвижного элемента переключателя (track) RadioBox.
     */
    fun toggleIconColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета бордера неподвижной части RadioBox.
     */
    override fun toggleBorderColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимационное свойство цвета фона RadioBox.
     */
    override fun backgroundColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимацию высоты иконки.
     */
    fun toggleIconHeight(toggleIconHeight: MotionProperty<Dp>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает анимацию ширины иконки.
     */
    fun toggleIconWidth(toggleIconWidth: MotionProperty<Dp>): RadioBoxMotionStyleBuilder

    /**
     * Устанавливает Transition для изменения alpha цвета иконки (toggleIcon).
     */
    fun toggleIconAlphaTransition(transition: TransitionMotionProperty<Float>): RadioBoxMotionStyleBuilder

    override fun style(): RadioBoxMotionStyle
}

@Immutable
private class RadioBoxMotionStyleImpl(
    override val labelColor: MotionProperty<Brush>,
    override val descriptionColor: MotionProperty<Brush>,
    override val toggleColor: MotionProperty<Brush>,
    override val toggleIconColor: MotionProperty<Brush>,
    override val toggleBorderColor: MotionProperty<Brush>,
    override val backgroundColor: MotionProperty<Brush>,
    override val labelStyle: MotionProperty<TextStyle>,
    override val descriptionStyle: MotionProperty<TextStyle>,
    override val toggleIconHeight: MotionProperty<Dp>,
    override val toggleIconWidth: MotionProperty<Dp>,
    override val toggleIconAlphaTransition: TransitionMotionProperty<Float>,
) : RadioBoxMotionStyle {

    class Builder : RadioBoxMotionStyleBuilder {
        private var labelColor: MotionProperty<Brush>? = null
        private var descriptionColor: MotionProperty<Brush>? = null
        private var toggleThumbColor: MotionProperty<Brush>? = null
        private var toggleTrackColor: MotionProperty<Brush>? = null
        private var toggleTrackBorderColor: MotionProperty<Brush>? = null
        private var backgroundColor: MotionProperty<Brush>? = null

        private var labelStyle: MotionProperty<TextStyle>? = null
        private var descriptionStyle: MotionProperty<TextStyle>? = null
        private var toggleIconHeight: MotionProperty<Dp>? = null
        private var toggleIconWidth: MotionProperty<Dp>? = null

        private var toggleIconAlphaTransition: TransitionMotionProperty<Float>? = null

        override fun labelColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder = apply {
            this.labelColor = color
        }

        override fun labelStyle(style: MotionProperty<TextStyle>): RadioBoxMotionStyleBuilder = apply {
            this.labelStyle = style
        }

        override fun descriptionColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder = apply {
            this.descriptionColor = color
        }

        override fun descriptionStyle(style: MotionProperty<TextStyle>): RadioBoxMotionStyleBuilder = apply {
            this.descriptionStyle = style
        }

        override fun toggleColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder = apply {
            this.toggleThumbColor = color
        }

        override fun toggleIconColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder = apply {
            this.toggleTrackColor = color
        }

        override fun toggleBorderColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder = apply {
            this.toggleTrackBorderColor = color
        }

        override fun backgroundColor(color: MotionProperty<Brush>): RadioBoxMotionStyleBuilder = apply {
            this.backgroundColor = color
        }

        override fun toggleIconHeight(toggleIconHeight: MotionProperty<Dp>): RadioBoxMotionStyleBuilder = apply {
            this.toggleIconHeight = toggleIconHeight
        }

        override fun toggleIconWidth(toggleIconWidth: MotionProperty<Dp>): RadioBoxMotionStyleBuilder = apply {
            this.toggleIconWidth = toggleIconWidth
        }

        override fun toggleIconAlphaTransition(
            transition: TransitionMotionProperty<Float>,
        ): RadioBoxMotionStyleBuilder = apply {
            this.toggleIconAlphaTransition = transition
        }

        override fun style(): RadioBoxMotionStyle {
            return RadioBoxMotionStyleImpl(
                labelColor = labelColor ?: noMotion(),
                descriptionColor = descriptionColor ?: noMotion(),
                toggleColor = toggleThumbColor ?: RadioBoxBrushTransitionMotion,
                toggleIconColor = toggleTrackColor ?: RadioBoxBrushTransitionMotion,
                toggleBorderColor = toggleTrackBorderColor ?: RadioBoxBrushTransitionMotion,
                backgroundColor = backgroundColor ?: noMotion(),
                labelStyle = labelStyle ?: noMotion(),
                descriptionStyle = descriptionStyle ?: noMotion(),
                toggleIconHeight = toggleIconHeight ?: RadioBoxDpTransitionMotion,
                toggleIconWidth = toggleIconWidth ?: RadioBoxDpTransitionMotion,
                toggleIconAlphaTransition = toggleIconAlphaTransition ?: RadioBoxAlphaTransitionMotion,
            )
        }
    }
}

private val RadioBoxBrushTransitionMotion = transition<Brush>(
    label = "RadioBoxBrushTransition",
) {
    segment {
        condition { state -> state changes RadioBoxStates.Checked }
    } changesWith { finite(tween(200)) }

    segment {} changesWith { finite(snap()) }
}

private val RadioBoxAlphaTransitionMotion = transition<Float>(
    label = "RadioBoxFloatTransition",
) {
    segment {
        condition { state -> state changes RadioBoxStates.Checked }
    } changesWith { finite(tween(200)) }

    segment {} changesWith { finite(snap()) }
}

private val RadioBoxDpTransitionMotion = transition<Dp>(
    label = "RadioBoxDpTransition",
) {
    segment {
        condition { state -> state changes RadioBoxStates.Checked }
    } changesWith { finite(tween(200)) }

    segment {} changesWith { finite(snap()) }
}
