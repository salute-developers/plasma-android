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
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    shape: CornerBasedShape,
    contentColor: Color,
    backgroundColor: Color,
    spinnerColor: Color,
    spinnerMode: Button.SpinnerMode,
    dimensions: Button.Dimensions,
    enabledAlpha: Float,
    disabledAlpha: Float,
    enabled: Boolean = true,
    loading: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
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
            .alpha(if (enabled) enabledAlpha else disabledAlpha),
        enabled = enabled,
        shape = shape,
        color = colors.backgroundColor(enabled).value,
        contentColor = contentColor,
        border = null,
        elevation = 0.dp,
        interactionSource = interactionSource,
    ) {
        Box(
            modifier = Modifier
                .wrapContentSize()
                .defaultMinSize(dimensions.minWidth, dimensions.height)
                .padding(dimensions.paddings.start, 0.dp, dimensions.paddings.end, 0.dp),
            contentAlignment = Alignment.Center,
        ) {
            Row(
                modifier = Modifier.alpha(if (loading) spinnerMode.contentAlpha else enabledAlpha),
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
    labelTextStyle: TextStyle,
    valueTextStyle: TextStyle,
    labelColor: Color,
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
            modifier = when (spacing) {
                Button.Spacing.Packed -> modifier
                Button.Spacing.SpaceBetween -> modifier.weight(1f)
            },
        ) {
            Text(
                text = label,
                style = labelTextStyle,
                color = labelColor,
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )

            Spacer(modifier = Modifier.width(valueMargin))

            Text(
                text = value,
                style = valueTextStyle,
                color = valueColor,
                softWrap = false,
                overflow = TextOverflow.Ellipsis,
            )
        }
    } else {
        Text(
            text = label,
            modifier = modifier,
            style = labelTextStyle,
            color = labelColor,
            softWrap = false,
            overflow = TextOverflow.Ellipsis,
        )
    }
}
