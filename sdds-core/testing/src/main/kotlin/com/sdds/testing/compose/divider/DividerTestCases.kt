package com.sdds.testing.compose.divider

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.DividerStyle

/**
 * Тест-кейсы для [Divider]
 */

@Composable
fun DividerDefault(style: DividerStyle) {
    Divider(style = style)
}
