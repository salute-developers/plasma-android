package com.sdds.compose.uikit.internal.common

import androidx.compose.foundation.Indication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.Role

/**
 * Модификатор, позволяющий применять форму, бэкграунд и кликабельность
 * Полезен при создании таких компонентов, как chip, badge и т.д.
 *
 * @param shape форма компонента
 * @param backgroundColor цвет бэкграунда
 * @param indication индикация нажатия
 * @param onClick обработчик нажатий
 * @param role тип элемента для Accesabillity
 * @param enabled включен ли компонент
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param interactionSource источник взаимодействий
 */
internal fun Modifier.surface(
    shape: CornerBasedShape = RoundedCornerShape(25),
    backgroundColor: Brush,
    indication: Indication? = null,
    onClick: (() -> Unit)? = null,
    role: Role? = null,
    enabled: Boolean = true,
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
    interactionSource: MutableInteractionSource,
): Modifier {
    val clickableModifier = onClick?.let {
        Modifier.clickable(
            interactionSource = interactionSource,
            indication = indication,
            enabled = enabled,
            role = role,
            onClick = onClick,
        )
    } ?: Modifier

    return clip(shape)
        .then(clickableModifier)
        .graphicsLayer { alpha = if (enabled) enabledAlpha else disabledAlpha }
        .background(backgroundColor)
}
