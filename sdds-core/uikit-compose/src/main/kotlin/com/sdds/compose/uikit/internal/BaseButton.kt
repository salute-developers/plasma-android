package com.sdds.compose.uikit.internal

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonColors
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LocalTint
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.internal.common.surface

/**
 * Базовая кнопка
 */
@Composable
internal fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: CornerBasedShape,
    colors: ButtonColors,
    spinnerMode: Button.SpinnerMode,
    dimensions: Button.Dimensions,
    enabledAlpha: Float,
    disabledAlpha: Float,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val contentColor = colors.contentColor.colorForInteraction(interactionSource)
    val backgroundColor = colors.backgroundColor.colorForInteraction(interactionSource)
    val spinnerColor = colors.spinnerColor.colorForInteraction(interactionSource)
    Box(
        modifier = modifier
            .defaultMinSize(dimensions.minWidth, dimensions.height)
            .height(dimensions.height)
            .surface(
                shape = shape,
                onClick = onClick,
                backgroundColor = { SolidColor(backgroundColor) },
                indication = indication,
                enabled = enabled,
                alpha = { if (it) enabledAlpha else disabledAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            )
            .padding(dimensions.paddings.start, 0.dp, dimensions.paddings.end, 0.dp),
        contentAlignment = Alignment.Center,
    ) {
        CompositionLocalProvider(LocalTint provides contentColor) {
            Row(
                modifier = Modifier.alpha(if (loading) spinnerMode.contentAlpha else enabledAlpha),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                content = content,
            )
        }

        if (loading && enabled) {
            BaseSpinner(
                tint = spinnerColor,
                modifier = Modifier.size(dimensions.spinnerSize),
                strokeWidth = dimensions.spinnerStrokeWidth,
            )
        }
    }
}

/**
 * Иконка кнопки. Умеет подставлять отступы в начале и в конце.
 *
 */
@Composable
internal fun RowScope.ButtonIcon(
    icon: Painter,
    size: Dp,
    marginStart: Dp = 0.dp,
    marginEnd: Dp = 0.dp,
) {
    if (marginStart.value > 0) {
        Spacer(modifier = Modifier.width(marginStart))
    }
    Icon(
        painter = icon,
        contentDescription = null,
        modifier = Modifier.requiredSize(size),
    )
    if (marginEnd.value > 0) {
        Spacer(modifier = Modifier.width(marginEnd))
    }
}

/**
 * Composable для отображение текстов в кнопке
 */
@Composable
internal fun RowScope.ButtonText(
    label: String,
    labelTextStyle: TextStyle,
    labelColor: Color,
    valueTextStyle: TextStyle,
    valueColor: Color,
    modifier: Modifier = Modifier,
    valueMargin: Dp,
    spacing: Button.Spacing,
    value: String?,
) {
    if (value != null) {
        Row(
            horizontalArrangement = when (spacing) {
                Button.Spacing.Packed -> Arrangement.Center
                Button.Spacing.SpaceBetween -> Arrangement.SpaceBetween
            },
            modifier = modifier.weight(1f, spacing == Button.Spacing.SpaceBetween),
        ) {
            Text(
                text = label,
                style = labelTextStyle.copy(color = labelColor),
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )

            Spacer(modifier = Modifier.width(valueMargin))

            Text(
                text = value,
                style = valueTextStyle.copy(color = valueColor),
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )
        }
    } else {
        Text(
            text = label,
            modifier = modifier.weight(1f, false),
            style = labelTextStyle.copy(color = labelColor),
            softWrap = false,
            overflow = TextOverflow.Ellipsis,
        )
    }
}
