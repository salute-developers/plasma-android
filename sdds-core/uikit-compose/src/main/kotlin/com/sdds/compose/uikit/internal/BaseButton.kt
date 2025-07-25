package com.sdds.compose.uikit.internal

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.sdds.compose.uikit.ButtonColors
import com.sdds.compose.uikit.ButtonDimensions
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.internal.common.surface

/**
 * Базовая кнопка
 */
@Composable
internal fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: Shape,
    colors: ButtonColors,
    loadingAlpha: Float,
    dimensions: ButtonDimensions,
    disabledAlpha: Float,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit,
) {
    val backgroundColor = colors.backgroundColor.colorForInteraction(interactionSource)
    val spinnerColor = colors.spinnerColor.colorForInteraction(interactionSource)
    val isFocused = interactionSource.collectIsFocusedAsState()
    Box(
        modifier = modifier
            .focusSelector(LocalFocusSelectorSettings.current, shape) { isFocused.value }
            .defaultMinSize(dimensions.minWidth, dimensions.height)
            .height(dimensions.height)
            .surface(
                shape = shape,
                onClick = onClick,
                backgroundColor = { SolidColor(backgroundColor) },
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_BUTTON_ALPHA else disabledAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            )
            .zIndex(if (isFocused.value) 1f else 0f)
            .padding(dimensions.paddingStart, 0.dp, dimensions.paddingEnd, 0.dp),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            modifier = Modifier.alpha(if (loading) loadingAlpha else ENABLED_BUTTON_ALPHA),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            content = content,
        )

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
    iconColor: Color,
    contentDescription: String? = null,
) {
    if (marginStart.value > 0) {
        Spacer(modifier = Modifier.width(marginStart))
    }
    Icon(
        painter = icon,
        contentDescription = contentDescription,
        modifier = Modifier.requiredSize(size),
        tint = iconColor,
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
    spacing: ButtonSpacing,
    value: String?,
) {
    if (!value.isNullOrEmpty()) {
        val widthModifier = if (spacing == ButtonSpacing.SpaceBetween) {
            modifier.fillMaxWidth().weight(1f, false)
        } else {
            modifier
        }
        Row(
            horizontalArrangement = when (spacing) {
                ButtonSpacing.Packed -> Arrangement.Center
                ButtonSpacing.SpaceBetween -> Arrangement.SpaceBetween
            },
            modifier = widthModifier,
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

private const val ENABLED_BUTTON_ALPHA = 1f
