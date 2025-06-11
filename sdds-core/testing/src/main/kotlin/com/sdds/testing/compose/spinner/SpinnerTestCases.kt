package com.sdds.testing.compose.spinner

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.SpinnerStyle

/**
 * Тест-кейсы для Spinner
 */

/**
 * PLASMA-2068
 */
@Composable
fun SpinnerTest(style: SpinnerStyle) {
    Spinner(
        style = style,
    )
}
