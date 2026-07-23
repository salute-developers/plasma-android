package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RowHeightMaxFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RowHeightMaxFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 2.5 2.225 C 2.5 1.935 2.735 1.7 3.025 1.7 h 9.95 c 0.29 0.0 0.525 0.235 0.525 0.525 c 0.0 0.29 -0.235 0.525 -0.525 0.525 h -9.95 C 2.735 2.75 2.5 2.515 2.5 2.225 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 1.7 5.518 c 0.0 -0.967 0.783 -1.75 1.75 -1.75 h 9.1 c 0.966 0.0 1.75 0.783 1.75 1.75 v 5.0 c 0.0 0.966 -0.784 1.75 -1.75 1.75 h -9.1 c -0.967 0.0 -1.75 -0.784 -1.75 -1.75 v -5.0 Z")
        )
        addPath(
            fill = SolidColor(Color(0xFFF5F5F5)),
            pathData = addPathNodes("M 3.0 13.297 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 10.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 3.0 Z")
        )
    }.build()
}
