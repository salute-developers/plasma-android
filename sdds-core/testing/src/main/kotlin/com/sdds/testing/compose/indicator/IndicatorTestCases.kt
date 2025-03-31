package com.sdds.testing.compose.indicator

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Indicator
import com.sdds.compose.uikit.IndicatorStyle

/**
 * Тест-кейсы для [Indicator]
 */

@Composable
fun IndicatorCommon(style: IndicatorStyle) {
    Indicator(
        style = style,
    )
}
