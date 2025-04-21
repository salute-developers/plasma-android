package com.sdds.compose.uikit.interactions

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color

/**
 * "Интерактивный" цвет. Дает возможность определить цвета для каждого [Interaction] из [InteractionSource]
 * @author Малышев Александр on 18.10.2024
 */
@Stable
interface InteractiveColor {

    /**
     * Возвращает цвет [Color] согласно текущему состоянию [InteractionSource]
     */
    @Composable
    fun colorForInteraction(interactionSource: InteractionSource): Color

    /**
     * Возвращает цвет [Color] согласно текущему состоянию [InteractionSource] и набору [stateSet]
     */
    @Composable
    fun colorForInteraction(interactionSource: InteractionSource, stateSet: Set<ValueState>): Color {
        return colorForInteraction(interactionSource)
    }

    /**
     * Возвращает цвет [Color], сохраненный в [State], согласно текущему состоянию [InteractionSource]
     */
    @Composable
    fun colorForInteractionAsState(interactionSource: InteractionSource): State<Color>

    /**
     * Возвращает цвет [Color], сохраненный в [State], согласно текущему состоянию [InteractionSource]
     * и набору [stateSet]
     */
    @Composable
    fun colorForInteractionAsState(interactionSource: InteractionSource, stateSet: Set<ValueState>): State<Color> {
        return rememberUpdatedState(colorForInteraction(interactionSource, stateSet))
    }
}

/**
 * Создает [InteractiveColor] из текущего цвета и позволяет определить дополнитнльные цвета для состояний focused,
 * hovered, pressed.
 * @receiver [Color] текущий цвет
 * @param focused цвет для состояния Interaction.Focus
 * @param hovered цвет для состояния Interaction.Hover
 * @param pressed цвет для состояния Interaction.Press
 */
@Stable
fun Color.asInteractive(
    focused: Color = this,
    hovered: Color = this,
    pressed: Color = this,
    activated: Color = this,
    selected: Color = this,
): InteractiveColor {
    return SimpleInteractiveColor(this, focused, hovered, pressed, activated, selected)
}

/**
 * Создает [InteractiveColor] из текущего цвета и позволяет более гибко определить дополнитнльные цвета для состояний
 * [InteractiveState]
 * @receiver [Color] текущий цвет
 * @param colorStates цвета для каждого стейта
 */
@Stable
fun Color.asInteractive(vararg colorStates: Pair<Set<ValueState>, Color>): InteractiveColor {
    return ColorStateList(colorStates.map { it.first }, colorStates.map { it.second }, this)
}

/**
 * Интерактивные состояния цвета
 */
enum class InteractiveState : ValueState {
    /**
     * Состояние цвета в фокусе
     */
    Focused,

    /**
     * Состояние цвета в нажатом состоянии
     */
    Pressed,

    /**
     * Состояние цвета при наведении курсором
     */
    Hovered,

    /**
     * Состояние цвета в активном состоянии
     */
    Activated,

    /**
     * Состояние цвета в выбранном состоянии
     */
    Selected,
}

@Immutable
private data class SimpleInteractiveColor(
    val default: Color,
    val focused: Color = default,
    val hovered: Color = default,
    val pressed: Color = default,
    val activated: Color = default,
    val selected: Color = default,
) : InteractiveColor {

    @Composable
    override fun colorForInteraction(interactionSource: InteractionSource): Color {
        val isPressed by interactionSource.collectIsPressedAsState()
        val isHovered by interactionSource.collectIsHoveredAsState()
        val isFocused by interactionSource.collectIsFocusedAsState()
        val isActivated by interactionSource.collectIsActivatedAsState()
        val isSelected by interactionSource.collectIsSelectedAsState()
        return when {
            isPressed -> pressed
            isHovered -> hovered
            isFocused -> focused
            isActivated -> activated
            isSelected -> selected
            else -> default
        }
    }

    @Composable
    override fun colorForInteractionAsState(interactionSource: InteractionSource): State<Color> {
        return rememberUpdatedState(newValue = colorForInteraction(interactionSource))
    }
}

@Immutable
private class ColorStateList(
    states: List<Set<ValueState>>,
    values: List<Color>,
    default: Color,
) : StatefulValue<Color>(states, values, default), InteractiveColor {

    @Composable
    override fun colorForInteraction(interactionSource: InteractionSource): Color {
        return getValue(interactionSource)
    }

    @Composable
    override fun colorForInteraction(interactionSource: InteractionSource, stateSet: Set<ValueState>): Color {
        return getValue(interactionSource, stateSet)
    }

    @Composable
    override fun colorForInteractionAsState(interactionSource: InteractionSource): State<Color> {
        return getValueAsState(interactionSource)
    }
}
