package com.sdds.compose.uikit.internal

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.util.fastRoundToInt
import androidx.compose.ui.zIndex
import com.sdds.compose.uikit.ButtonColors
import com.sdds.compose.uikit.ButtonDimensions
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ProvideTextBehaviour
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextBehaviour
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.internal.common.surface

/**
 * Базовая кнопка
 */
@Composable
@Suppress("LongMethod")
internal fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    onClickLabel: String? = null,
    shape: Shape,
    colors: ButtonColors,
    loadingAlpha: Float,
    dimensions: ButtonDimensions,
    disabledAlpha: Float,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    spacing: ButtonSpacing = ButtonSpacing.Packed,
    startContent: @Composable () -> Unit = {},
    endContent: @Composable () -> Unit = {},
    textContent: @Composable () -> Unit = {},
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
                onClickLabel = onClickLabel,
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
        propagateMinConstraints = true,
    ) {
        Layout(
            modifier = Modifier
                .alpha(if (loading) loadingAlpha else ENABLED_BUTTON_ALPHA),
            content = {
                Box(Modifier.layoutId(START_CONTENT_ID)) { startContent() }
                Box(Modifier.layoutId(END_CONTENT_ID)) { endContent() }
                Box(
                    modifier = Modifier.layoutId(TEXT_CONTENT_ID),
                    propagateMinConstraints = true,
                ) { textContent() }
            },
        ) { measurables, constraints ->
            val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)

            val startPlaceable = measurables.find { it.layoutId == START_CONTENT_ID }
                ?.measure(looseConstraints)
            val endPlaceable = measurables.find { it.layoutId == END_CONTENT_ID }
                ?.measure(looseConstraints.offset(-startPlaceable.widthOrZero()))
            val textConstraints = when (spacing) {
                ButtonSpacing.Packed -> {
                    looseConstraints
                        .offset(-startPlaceable.widthOrZero() - endPlaceable.widthOrZero())
                }

                ButtonSpacing.SpaceBetween -> {
                    constraints
                        .copy(minHeight = 0)
                        .offset(-startPlaceable.widthOrZero() - endPlaceable.widthOrZero())
                }
            }
            val textPlaceable = measurables.find { it.layoutId == TEXT_CONTENT_ID }
                ?.measure(textConstraints)

            val desiredWidth =
                startPlaceable.widthOrZero() + endPlaceable.widthOrZero() + textPlaceable.widthOrZero()
            val width = constraints.constrainWidth(desiredWidth)
            val height = constraints.constrainHeight(
                maxOf(
                    startPlaceable.heightOrZero(),
                    endPlaceable.heightOrZero(),
                    textPlaceable.heightOrZero(),
                ),
            )
            layout(width, height) {
                when (spacing) {
                    ButtonSpacing.Packed -> {
                        val startX = ((width - desiredWidth) / 2f).fastRoundToInt()
                        startPlaceable?.placeRelative(
                            startX,
                            ((height - startPlaceable.heightOrZero()) / 2f).fastRoundToInt(),
                        )
                        textPlaceable?.placeRelative(
                            startX + startPlaceable.widthOrZero(),
                            ((height - textPlaceable.heightOrZero()) / 2f).fastRoundToInt(),
                        )
                        endPlaceable?.placeRelative(
                            startX + desiredWidth - endPlaceable.widthOrZero(),
                            ((height - endPlaceable.heightOrZero()) / 2f).fastRoundToInt(),
                        )
                    }

                    ButtonSpacing.SpaceBetween -> {
                        startPlaceable?.placeRelative(
                            0,
                            ((height - startPlaceable.heightOrZero()) / 2f).fastRoundToInt(),
                        )
                        textPlaceable?.placeRelative(
                            startPlaceable.widthOrZero(),
                            ((height - textPlaceable.heightOrZero()) / 2f).fastRoundToInt(),
                        )
                        endPlaceable?.placeRelative(
                            width - endPlaceable.widthOrZero(),
                            ((height - endPlaceable.heightOrZero()) / 2f).fastRoundToInt(),
                        )
                    }
                }
            }
        }
        if (loading) {
            BaseSpinner(
                modifier = Modifier.requiredSize(dimensions.spinnerSize),
                tint = spinnerColor,
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
@Deprecated("Use ButtonIcon with iconRes parameter")
internal fun ButtonIcon(
    icon: Painter,
    size: Dp,
    marginStart: Dp = 0.dp,
    marginEnd: Dp = 0.dp,
    iconColor: Color,
    contentDescription: String? = null,
) {
    Icon(
        painter = icon,
        contentDescription = contentDescription,
        modifier = Modifier
            .padding(
                start = if (marginStart.value > 0) marginStart else 0.dp,
                end = if (marginEnd.value > 0) marginEnd else 0.dp,
            )
            .requiredSize(size),
        tint = iconColor,
    )
}

/**
 * Иконка кнопки. Умеет подставлять отступы в начале и в конце.
 *
 */
@Composable
internal fun ButtonIcon(
    @DrawableRes
    iconRes: Int,
    size: Dp,
    marginStart: Dp = 0.dp,
    marginEnd: Dp = 0.dp,
    iconColor: Color,
    contentDescription: String? = null,
) {
    Icon(
        painter = painterResource(iconRes),
        contentDescription = contentDescription,
        modifier = Modifier
            .padding(
                start = if (marginStart.value > 0) marginStart else 0.dp,
                end = if (marginEnd.value > 0) marginEnd else 0.dp,
            )
            .requiredSize(size),
        tint = iconColor,
    )
}

/**
 * Composable для отображения текстов в кнопке
 */
@Composable
internal fun ButtonText(
    label: String,
    labelTextStyle: TextStyle,
    labelColor: Color,
    valueTextStyle: TextStyle,
    valueColor: Color,
    modifier: Modifier = Modifier,
    valueMargin: Dp,
    value: String?,
) {
    ButtonText(
        modifier = modifier,
        labelContent = { Text(label) },
        labelTextStyle = labelTextStyle,
        labelColor = { labelColor },
        valueContent = if (!value.isNullOrEmpty()) {
            {
                Text(value)
            }
        } else {
            null
        },
        valueTextStyle = valueTextStyle,
        valueColor = { valueColor },
        valueMargin = valueMargin,
    )
}

/**
 * Composable для отображение текстов в кнопке
 */
@Composable
internal fun ButtonText(
    labelContent: @Composable () -> Unit,
    labelTextStyle: TextStyle,
    labelColor: () -> Color,
    modifier: Modifier = Modifier,
    valueContent: (@Composable () -> Unit)?,
    valueTextStyle: TextStyle,
    valueColor: () -> Color,
    valueMargin: Dp = Dp.Unspecified,
) {
    ProvideTextBehaviour(TextBehaviour(overflow = TextOverflow.Ellipsis, maxLines = 1, softWrap = false)) {
        Layout(
            modifier = modifier,
            content = {
                Box(Modifier.layoutId(LABEL_TEXT_ID)) {
                    ProvideTextStyle(labelTextStyle, color = labelColor) {
                        labelContent()
                    }
                }
                if (valueContent != null) {
                    Box(
                        Modifier
                            .padding(start = valueMargin)
                            .layoutId(VALUE_TEXT_ID),
                    ) {
                        ProvideTextStyle(valueTextStyle, color = valueColor) {
                            valueContent()
                        }
                    }
                }
            },
        ) { measurables, constraints ->
            val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
            val labelPlaceable = measurables.find { it.layoutId == LABEL_TEXT_ID }
                ?.measure(looseConstraints)
            val valuePlaceable = measurables.find { it.layoutId == VALUE_TEXT_ID }
                ?.measure(looseConstraints.offset(-labelPlaceable.widthOrZero()))

            val textWidth = labelPlaceable.widthOrZero() + valuePlaceable.widthOrZero()
            val width = constraints.constrainWidth(textWidth)
            val height = constraints.constrainHeight(
                maxOf(labelPlaceable.heightOrZero(), valuePlaceable.heightOrZero()),
            )
            layout(width, height) {
                labelPlaceable?.placeRelative(0, height - labelPlaceable.heightOrZero())
                valuePlaceable?.placeRelative(
                    width - valuePlaceable.widthOrZero(),
                    height - valuePlaceable.heightOrZero(),
                )
            }
        }
    }
}

private const val ENABLED_BUTTON_ALPHA = 1f
private const val LABEL_TEXT_ID = "label_text"
private const val VALUE_TEXT_ID = "value_text"
private const val START_CONTENT_ID = "start_content"
private const val END_CONTENT_ID = "end_content"
private const val TEXT_CONTENT_ID = "text_content"
