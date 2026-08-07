package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.Slider
import com.sdds.compose.uikit.SliderAlignment
import com.sdds.compose.uikit.SliderStyle
import com.sdds.icons.compose.SaluteOutline36
import com.sdds.icons.compose.SddsIcons
import kotlin.math.roundToInt

/**
 * PLASMA-T2411
 */
@Composable
fun SliderThumbLimitLabelNormalStartKmp(style: SliderStyle) {
    SliderCommonCase(style = style)
}

/**
 * PLASMA-T2412
 */
@Composable
fun SliderReversedEndLabelEnabledKmp(style: SliderStyle) {
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
 * PLASMA-T2417
 */
@Composable
fun SliderLabelEndKmp(style: SliderStyle) {
    SliderCommonCase(
        style = style,
        valueRange = 0f..100f,
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
                imageVector = SddsIcons.SaluteOutline36,
                contentDescription = null,
            )
        },
        onValueChange = {},
        valueFormatTransformer = { progress -> progress.roundToInt().toString() },
        thumbEnabled = thumbEnabled,
        limitLabelEnabled = limitLabelEnabled,
        labelEnabled = labelEnabled,
        slideDirection = slideDirection,
        alignment = alignment,
        valueRange = valueRange,
    )
}
