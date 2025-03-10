package com.sdds.testing.compose.counter

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle

/**
 * Тест кейс для Counter
 */
@Composable
fun CounterCommon(style: CounterStyle) {
    Counter(
        style = style,
        count = "123",
    )
}

/**
 * PLASMA-T1726
 */
@Composable
fun CounterSizeSPositiveLongNumber(style: CounterStyle) {
    Counter(
        style = style,
        count = "999999999999999",
    )
}

/**
 * PLASMA-T1809
 */
@Composable
fun CounterSizeLWhite(style: CounterStyle) {
    Counter(
        style = style,
        count = "1",
    )
}
