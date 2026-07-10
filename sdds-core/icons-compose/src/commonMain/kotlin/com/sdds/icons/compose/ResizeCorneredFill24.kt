package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ResizeCorneredFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ResizeCorneredFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 20.5 2.65 c 0.746 0.0 1.35 0.604 1.35 1.35 c 0.0 9.858 -7.992 17.85 -17.85 17.85 c -0.746 0.0 -1.35 -0.604 -1.35 -1.35 c 0.0 -0.746 0.604 -1.35 1.35 -1.35 c 8.367 0.0 15.15 -6.783 15.15 -15.15 c 0.0 -0.746 0.604 -1.35 1.35 -1.35 Z")
        )
    }.build()
}
