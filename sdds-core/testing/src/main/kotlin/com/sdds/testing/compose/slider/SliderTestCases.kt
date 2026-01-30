package com.sdds.testing.compose.slider

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.Slider
import com.sdds.compose.uikit.SliderAlignment
import com.sdds.compose.uikit.SliderStyle
import com.sdds.icons.R
import kotlin.math.roundToInt

/**
 * Тест-кейсы для компонента [Slider]
 */

/**
 * PLASMA-T2411, T2415
 */
@Composable
fun SliderThumbLimitLabelNormalStart(style: SliderStyle) {
    SliderCommonCase(
        style = style,
    )
}

/**
 * PLASMA-T2412
 */
@Composable
fun SliderReversedEndLabelEnabled(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        thumbEnabled = false,
        limitLabelEnabled = false,
        labelEnabled = true,
        slideDirection = SlideDirection.Reversed,
        alignment = SliderAlignment.End,
    )
}

/**
 * PLASMA-T2413
 */
@Composable
fun SliderThumbEnabledLimitLabel(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        labelEnabled = false,
    )
}

/**
 * PLASMA-T2414
 */
@Composable
fun SliderThumbLimitLabelThumbNormalStart(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        value = 50f,
    )
}

/**
 * PLASMA-T2416
 */
@Composable
fun SliderReversedEndMinMaxLabel(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        thumbEnabled = false,
        slideDirection = SlideDirection.Reversed,
        alignment = SliderAlignment.End,
        valueRange = 1f..99f,
    )
}

/**
 * PLASMA-T2417
 */
@Composable
fun SliderLabelEnd(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        valueRange = 0f..100f,
    )
}

/**
 * PLASMA-T2418
 */
@Composable
fun SliderLimitLabelDisabled(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        limitLabelEnabled = false,
    )
}

/**
 * PLASMA-T2419
 */
@Composable
fun SliderDisabledThumbLimitLabelReversedEndNoLabel(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        title = "",
        thumbEnabled = false,
        limitLabelEnabled = false,
        labelEnabled = false,
        slideDirection = SlideDirection.Reversed,
    )
}

/**
 * PLASMA-T2420
 */
@Composable
fun SliderLabelDisabled(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        labelEnabled = false,
        valueRange = 0f..100f,
    )
}

/**
 * PLASMA-T2421
 */
@Composable
fun SliderReversedEndThumbLimitLabelLabel(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        slideDirection = SlideDirection.Reversed,
    )
}

/**
 * PLASMA-T2422
 */
@Composable
fun SliderMinZeroMaxSixty(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        thumbEnabled = false,
        valueRange = 0f..60f,
    )
}

/**
 * PLASMA-T2423
 */
@Composable
fun SliderLimitLabelDisabledReversed(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        limitLabelEnabled = false,
        slideDirection = SlideDirection.Reversed,
    )
}

/**
 * PLASMA-T2424, T2425
 */
@Composable
fun SliderLongLabel(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        title = "LabelLabelLabelLabelLabel",
    )
}

@Composable
private fun SliderCommonCase(
    style: SliderStyle,
    value: Float = 0f,
    title: String = "Label",
    thumbEnabled: Boolean = true,
    limitLabelEnabled: Boolean = true,
    labelEnabled: Boolean = true,
    slideDirection: SlideDirection = style.slideDirection,
    alignment: SliderAlignment = style.alignment,
    valueRange: ClosedFloatingPointRange<Float> = 0f..100f,
) {
    Slider(
        style = style,
        value = value,
        title = title,
        labelContent = {
            Icon(
                painter = painterResource(R.drawable.ic_salute_outline_36),
                contentDescription = null,
            )
        },
        onValueChange = {},
        valueFormatTransformer = { progress ->
            progress.roundToInt().toString()
        },
        thumbEnabled = thumbEnabled,
        limitLabelEnabled = limitLabelEnabled,
        labelEnabled = labelEnabled,
        slideDirection = slideDirection,
        alignment = alignment,
        valueRange = valueRange,
    )
}
