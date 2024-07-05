package com.sdds.compose.uikit.internal

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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Button

/**
 * Базовая кнопка
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    size: Button.Size = Button.Size.M,
    style: Button.Style = Button.Style.Default,
    settingsProvider: Button.ButtonSettingsProvider,
    shape: CornerBasedShape = settingsProvider.shapeFor(size),
    backgroundColor: Color = settingsProvider.backgroundColorFor(style),
    contentColor: Color = settingsProvider.contentColorFor(style),
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    dimensions: Button.Dimensions = Button.Dimensions(),
    content: @Composable RowScope.() -> Unit,
) {
    val colors = ButtonDefaults.buttonColors(
        backgroundColor = backgroundColor,
        contentColor = contentColor,
        disabledBackgroundColor = backgroundColor,
        disabledContentColor = contentColor,
    )
    Surface(
        onClick = onClick,
        modifier = modifier
            .height(dimensions.height)
            .alpha(if (enabled) ENABLED_BUTTON_ALPHA else DISABLED_BUTTON_ALPHA),
        enabled = enabled,
        shape = shape,
        color = colors.backgroundColor(enabled).value,
        contentColor = contentColor.copy(alpha = ENABLED_BUTTON_ALPHA),
        border = null,
        elevation = 0.dp,
        interactionSource = interactionSource,
    ) {
        CompositionLocalProvider(LocalContentAlpha provides contentColor.alpha) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .defaultMinSize(dimensions.minWidth, dimensions.height)
                    .padding(dimensions.paddings.start, 0.dp, dimensions.paddings.end, 0.dp),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    modifier = Modifier.invisible(loading),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    content = content,
                )
                if (loading && enabled) {
                    BaseSpinner(
                        tint = contentColor,
                        modifier = Modifier.size(dimensions.spinnerSize),
                        strokeWidth = SpinnerStrokeWidth,
                    )
                }
            }
        }
    }
}

/**
 * Иконка кнопки. Умеет подставлять отступы в начале и в конце.
 *
 */
@Composable
internal fun ButtonIcon(
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
    style: TextStyle,
    color: Color,
    modifier: Modifier = Modifier,
    valueMargin: Dp = 0.dp,
    spacing: Button.Spacing = Button.Spacing.Packed,
    value: String? = null,
) {
    if (value != null) {
        Row(
            horizontalArrangement = when (spacing) {
                Button.Spacing.Packed -> Arrangement.Center
                Button.Spacing.SpaceBetween -> Arrangement.SpaceBetween
            },
            modifier = when (spacing) {
                Button.Spacing.Packed -> modifier
                Button.Spacing.SpaceBetween -> modifier.weight(1f)
            },
        ) {
            Text(
                text = label,
                style = style,
                color = color,
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )

            Spacer(modifier = Modifier.width(valueMargin))

            Text(
                text = value,
                style = style,
                color = color.copy(alpha = VALUE_ALPHA),
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )
        }
    } else {
        Text(
            text = label,
            modifier = modifier,
            style = style,
            color = color,
            softWrap = false,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

private fun Modifier.invisible(flag: Boolean): Modifier {
    return alpha(if (flag) 0f else 1f)
}

private val SpinnerStrokeWidth = 2.dp
private const val ENABLED_BUTTON_ALPHA = 1f
private const val DISABLED_BUTTON_ALPHA = 0.4f
private const val VALUE_ALPHA = 0.56f
