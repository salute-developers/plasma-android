package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.Splitter
import com.sdds.compose.uikit.SplitterOrientation
import com.sdds.compose.uikit.SplitterStyle

/**
 * Тест-кейсы для [Splitter]
 */

/**
 * PLASMA-T2680, 2681
 */
@Composable
fun SplitterHorizontalHasHandle(
    style: SplitterStyle,
) {
    Splitter(
        modifier = Modifier
            .testTag("Splitter"),
        style = style,
        hasHandle = true,
        orientation = SplitterOrientation.Horizontal,
    )
}

/**
 * PLASMA-T2682
 */
@Composable
fun SplitterVertical(
    style: SplitterStyle,
) {
    Splitter(
        style = style,
        hasHandle = false,
        orientation = SplitterOrientation.Vertical,
    )
}
