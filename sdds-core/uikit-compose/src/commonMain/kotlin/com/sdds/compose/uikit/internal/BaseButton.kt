package com.sdds.compose.uikit.internal

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.offset
import androidx.compose.ui.util.fastRoundToInt
import androidx.compose.ui.zIndex
import com.sdds.compose.uikit.ButtonSpacing
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.ImageSource
import com.sdds.compose.uikit.LocalButtonForceShape
import com.sdds.compose.uikit.LocalIconDefaultSize
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.ProvideTextBehaviour
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextBehaviour
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.common.surface
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.button.ButtonMotionStyle
import com.sdds.compose.uikit.motion.components.button.rememberButtonMotion
import com.sdds.compose.uikit.motion.components.common.CommonButtonMotionStyle
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState

/**
 * Базовая кнопка
 */
@Composable
@Suppress("LongMethod")
internal fun BaseButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    onClickLabel: String? = null,
    style: ButtonStyle,
    enabled: Boolean = true,
    loading: Boolean = false,
    indication: Indication? = LocalIndication.current,
    motion: Motion<ButtonMotionStyle> = rememberButtonMotion(),
    needPaddingCompensation: Boolean = false,
    spacing: ButtonSpacing = ButtonSpacing.Packed,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    textContent: @Composable () -> Unit = {},
) {
    val interactionSource = motion.context.interactionSource
    val isFocused = interactionSource.collectIsFocusedAsState()
    val shape = LocalButtonForceShape.current ?: style.shapes.getValue(interactionSource)
    val bgBrush = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)

    val minWidth = style.dimensions.minWidthValues.getValue(interactionSource)
    val height = style.dimensions.heightValues.getValue(interactionSource)
    val startPadding by style.dimensions.paddingStartValues.getValueAsState(interactionSource)
    val endPadding by style.dimensions.paddingEndValues.getValueAsState(interactionSource)
    val startResolved = resolvePadding((needPaddingCompensation && startContent != null), startPadding)
    val endResolved = resolvePadding((needPaddingCompensation && endContent != null), endPadding)
    Box(
        modifier = modifier
            .focusSelector(LocalFocusSelectorSettings.current, shape) { isFocused.value }
            .defaultMinSize(minWidth, height)
            .height(height)
            .surface(
                shape = shape,
                onClick = onClick,
                onClickLabel = onClickLabel,
                backgroundColor = { bgBrush.value },
                indication = indication,
                enabled = enabled,
                alpha = { if (it) ENABLED_BUTTON_ALPHA else style.disableAlpha },
                role = Role.Button,
                interactionSource = interactionSource,
            )
            .zIndex(if (isFocused.value) 1f else 0f)
            .padding(startResolved, 0.dp, endResolved, 0.dp),
        contentAlignment = Alignment.Center,
        propagateMinConstraints = true,
    ) {
        Layout(
            modifier = Modifier
                .alpha(if (loading) style.loadingAlpha else ENABLED_BUTTON_ALPHA),
            content = {
                startContent?.let {
                    Box(Modifier.layoutId(START_CONTENT_ID)) {
                        it.invoke()
                    }
                }
                endContent?.let {
                    Box(Modifier.layoutId(END_CONTENT_ID)) {
                        it.invoke()
                    }
                }
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
            val tint by style.colors.spinnerColor.colorForInteractionAsState(motion.context, motion.style.spinnerColor)
            val size = style.dimensions.spinnerSizeValues.getValue(interactionSource)
            val stroke by style.dimensions.spinnerStrokeWidthValues.getValueAsState(interactionSource)
            BaseSpinner(
                modifier = Modifier.requiredSize(size),
                tint = tint,
                strokeWidth = stroke,
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
    style: ButtonStyle,
    marginStart: StatefulValue<Dp>? = null,
    marginEnd: StatefulValue<Dp>? = null,
    contentDescription: String? = null,
    motion: Motion<ButtonMotionStyle>,
) {
    val interactionSource = motion.context.interactionSource
    val startMargin = marginStart?.getValue(interactionSource) ?: 0.dp
    val endMargin = marginEnd?.getValue(interactionSource) ?: 0.dp
    val size = style.dimensions.iconSizeValues.getValue(interactionSource)
    val brush = style.colors.iconBrush.getBrushAsState(motion.context, motion.style.iconColor)
    Icon(
        painter = icon,
        contentDescription = contentDescription,
        modifier = Modifier
            .padding(
                start = startMargin,
                end = endMargin,
            )
            .requiredSize(size),
        brush = { brush.value },
    )
}

/**
 * Иконка кнопки. Умеет подставлять отступы в начале и в конце.
 *
 */
@Composable
internal fun ButtonIcon(
    iconSource: ImageSource,
    style: ButtonStyle,
    marginStart: StatefulValue<Dp>? = null,
    marginEnd: StatefulValue<Dp>? = null,
    contentDescription: String? = null,
    motion: Motion<ButtonMotionStyle>,
) {
    val interactionSource = motion.context.interactionSource
    val startMargin = marginStart?.getValue(interactionSource) ?: 0.dp
    val endMargin = marginEnd?.getValue(interactionSource) ?: 0.dp
    val size = style.dimensions.iconSizeValues.getValue(interactionSource)
    val brush = style.colors.iconBrush.getBrushAsState(motion.context, motion.style.iconColor)
    Icon(
        source = iconSource,
        contentDescription = contentDescription,
        modifier = Modifier
            .padding(
                start = startMargin,
                end = endMargin,
            )
            .requiredSize(size),
        brush = { brush.value },
    )
}

/**
 * Иконка кнопки с произвольным контентом. Умеет подставлять отступы в начале и в конце.
 *
 */
@Composable
internal fun ButtonIcon(
    iconSize: StatefulValue<Dp>,
    marginStart: StatefulValue<Dp>? = null,
    marginEnd: StatefulValue<Dp>? = null,
    iconColor: StatefulValue<Brush>,
    motion: Motion<ButtonMotionStyle>,
    icon: @Composable () -> Unit,
) {
    val interactionSource = motion.context.interactionSource
    val startMargin = marginStart?.getValue(interactionSource) ?: 0.dp
    val endMargin = marginEnd?.getValue(interactionSource) ?: 0.dp
    val size by iconSize.getValueAsState(interactionSource)
    val brush = iconColor.getBrushAsState(motion.context, motion.style.iconColor)
    Box(
        Modifier.padding(
            start = startMargin,
            end = endMargin,
        ),
    ) {
        val actualIconSize = if (size == 0.dp) Dp.Unspecified else size
        CompositionLocalProvider(
            LocalTintBrushProducer provides { brush.value },
            LocalIconDefaultSize provides DpSize(actualIconSize, actualIconSize),
        ) {
            icon()
        }
    }
}

/**
 * Composable для отображения текстов в кнопке
 */
@Composable
internal fun ButtonText(
    label: String,
    labelTextStyle: StatefulValue<TextStyle>,
    labelColor: StatefulValue<Brush>,
    valueTextStyle: StatefulValue<TextStyle>,
    valueColor: StatefulValue<Brush>,
    modifier: Modifier = Modifier,
    valueMargin: StatefulValue<Dp>,
    value: String?,
    motion: Motion<CommonButtonMotionStyle>,
) {
    ButtonText(
        modifier = modifier,
        labelContent = { Text(label) },
        labelTextStyle = labelTextStyle,
        labelColor = labelColor,
        valueContent = if (!value.isNullOrEmpty()) {
            { Text(value) }
        } else {
            null
        },
        valueTextStyle = valueTextStyle,
        valueColor = valueColor,
        valueMargin = valueMargin,
        motion = motion,
    )
}

/**
 * Composable для отображение текстов в кнопке
 */
@Composable
internal fun ButtonText(
    labelContent: @Composable () -> Unit,
    labelTextStyle: StatefulValue<TextStyle>,
    labelColor: StatefulValue<Brush>,
    modifier: Modifier = Modifier,
    valueContent: (@Composable () -> Unit)?,
    valueTextStyle: StatefulValue<TextStyle>,
    valueColor: StatefulValue<Brush>,
    valueMargin: StatefulValue<Dp>,
    motion: Motion<CommonButtonMotionStyle>,
) {
    ProvideTextBehaviour(TextBehaviour(overflow = TextOverflow.Ellipsis, maxLines = 1, softWrap = false)) {
        Layout(
            modifier = modifier,
            content = {
                Box(Modifier.layoutId(LABEL_TEXT_ID)) {
                    val labelStateBrush = labelColor.getBrushAsState(motion.context, motion.style.labelColor)
                    val labelStyle by labelTextStyle.getTextStyleAsState(motion.context, motion.style.labelStyle)
                    ProvideTextStyle(labelStyle, brush = { labelStateBrush.value }) {
                        labelContent()
                    }
                }
                if (valueContent != null) {
                    Box(
                        Modifier
                            .padding(start = valueMargin.getValue(motion.context.interactionSource))
                            .layoutId(VALUE_TEXT_ID),
                    ) {
                        val valueStateBrush = valueColor.getBrushAsState(motion.context, motion.style.valueColor)
                        val valueStyle by valueTextStyle.getTextStyleAsState(motion.context, motion.style.valueStyle)
                        ProvideTextStyle(valueStyle, brush = { valueStateBrush.value }) {
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

private fun resolvePadding(
    needCompensation: Boolean,
    padding: Dp,
) = if (needCompensation && padding > IconPaddingOffset) {
    padding - IconPaddingOffset
} else {
    padding
}

private const val ENABLED_BUTTON_ALPHA = 1f
private const val LABEL_TEXT_ID = "label_text"
private const val VALUE_TEXT_ID = "value_text"
private const val START_CONTENT_ID = "start_content"
private const val END_CONTENT_ID = "end_content"
private const val TEXT_CONTENT_ID = "text_content"

private val IconPaddingOffset = 2.dp
