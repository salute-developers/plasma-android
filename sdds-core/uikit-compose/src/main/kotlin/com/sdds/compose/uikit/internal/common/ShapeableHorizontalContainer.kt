package com.sdds.compose.uikit.internal.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Горизонтальный контейнер, имеющий бэкграунд, форму, отступы и возможность быть кликабельным.
 * Полезен при создании таких компонентов, как chip, badge и т.д.
 *
 * @param modifier модификатор
 * @param onClick обработчик нажатий
 * @param shape форма компонента
 * @param enabledAlpha альфа в состоянии [enabled] == true
 * @param disabledAlpha альфа в состоянии [enabled] == true
 * @param backgroundColor цвет бэкграунда
 * @param verticalAlignment расположение по вертикали
 * @param horizontalArrangement расположение по горизонтали
 * @param startPadding отступ в начале
 * @param endPadding отступ в конце
 * @param enabled включен ли компонент
 * @param interactionSource источник взаимодействий
 * @param content контент чипа
 */
@Composable
internal fun ShapeableHorizontalContainer(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    shape: CornerBasedShape = RoundedCornerShape(25),
    enabledAlpha: Float = 1f,
    disabledAlpha: Float = 0.4f,
    backgroundColor: Brush = SolidColor(Color.Black),
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Center,
    startPadding: Dp = 12.dp,
    endPadding: Dp = 12.dp,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val clickableModifier = onClick?.let {
        Modifier.clickable(
            interactionSource = interactionSource,
            indication = rememberRipple(),
            enabled = enabled,
            role = Role.Button,
            onClick = onClick,
        )
    } ?: Modifier

    Row(
        modifier = modifier
            .clip(shape)
            .then(clickableModifier)
            .alpha(if (enabled) enabledAlpha else disabledAlpha)
            .background(backgroundColor),
        verticalAlignment = verticalAlignment,
        horizontalArrangement = horizontalArrangement,
    ) {
        Spacer(modifier = Modifier.size(startPadding))
        content()
        Spacer(modifier = Modifier.size(endPadding))
    }
}
