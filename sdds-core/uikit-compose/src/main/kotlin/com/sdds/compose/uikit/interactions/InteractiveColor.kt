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
import androidx.compose.runtime.remember
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
     * Возвращает цвет [Color], сохраненный в [State], согласно текущему состоянию [InteractionSource]
     */
    @Composable
    fun colorForInteractionAsState(interactionSource: InteractionSource): State<Color>
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
): InteractiveColor {
    return SimpleInteractiveColor(this, focused, hovered, pressed)
}

/**
 * Создает [InteractiveColor] из текущего цвета и позволяет более гибко определить дополнитнльные цвета для состояний
 * [InteractiveState]
 * @receiver [Color] текущий цвет
 * @param colorStates цвета для каждого стейта
 */
@Stable
fun Color.asInteractive(vararg colorStates: Pair<Set<InteractiveState>, Color>): InteractiveColor {
    return ColorStateList(this, colorStates.associate { it.first to it.second })
}

/**
 * Интерактивные состояния цвета
 */
enum class InteractiveState {
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
}

@Immutable
private data class SimpleInteractiveColor(
    val default: Color,
    val focused: Color = default,
    val hovered: Color = default,
    val pressed: Color = default,
) : InteractiveColor {

    @Composable
    override fun colorForInteraction(interactionSource: InteractionSource): Color {
        val isPressed by interactionSource.collectIsPressedAsState()
        val isHovered by interactionSource.collectIsHoveredAsState()
        val isFocused by interactionSource.collectIsFocusedAsState()
        return when {
            isPressed -> pressed
            isHovered -> hovered
            isFocused -> focused
            else -> default
        }
    }

    @Composable
    override fun colorForInteractionAsState(interactionSource: InteractionSource): State<Color> {
        return rememberUpdatedState(newValue = colorForInteraction(interactionSource))
    }
}

@Immutable
private data class ColorStateList(
    val default: Color,
    val colorStates: Map<Set<InteractiveState>, Color> = emptyMap(),
) : InteractiveColor {

    @Composable
    override fun colorForInteraction(interactionSource: InteractionSource): Color {
        val isPressed by interactionSource.collectIsPressedAsState()
        val isHovered by interactionSource.collectIsHoveredAsState()
        val isFocused by interactionSource.collectIsFocusedAsState()
        val stateSet = remember(isPressed, isFocused, isHovered) {
            HashSet<InteractiveState>().apply {
                if (isPressed) add(InteractiveState.Pressed)
                if (isFocused) add(InteractiveState.Focused)
                if (isHovered) add(InteractiveState.Hovered)
            }
        }
        return colorStates[stateSet] ?: default
    }

    @Composable
    override fun colorForInteractionAsState(interactionSource: InteractionSource): State<Color> {
        return rememberUpdatedState(newValue = colorForInteraction(interactionSource))
    }
}
