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
