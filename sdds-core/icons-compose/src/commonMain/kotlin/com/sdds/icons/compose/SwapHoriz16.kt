package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SwapHoriz16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SwapHoriz16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.847 1.892 C 10.649 1.7 10.333 1.703 10.14 1.901 c -0.193 0.197 -0.19 0.514 0.008 0.707 l 1.62 1.582 H 3.0 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 8.769 l -1.62 1.583 c -0.198 0.192 -0.202 0.51 -0.01 0.707 c 0.194 0.197 0.51 0.201 0.708 0.008 l 2.499 -2.44 c 0.096 -0.094 0.15 -0.223 0.15 -0.358 c 0.0 -0.135 -0.054 -0.263 -0.15 -0.358 l -2.5 -2.44 Z M 5.15 8.516 C 5.35 8.323 5.665 8.327 5.858 8.525 c 0.193 0.197 0.19 0.514 -0.008 0.707 l -1.62 1.582 h 8.768 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 4.229 l 1.62 1.583 c 0.198 0.192 0.202 0.51 0.01 0.707 c -0.194 0.197 -0.51 0.201 -0.708 0.008 l -2.499 -2.44 c -0.096 -0.094 -0.15 -0.223 -0.15 -0.358 c 0.0 -0.134 0.054 -0.264 0.15 -0.358 l 2.5 -2.44 Z")
        )
    }.build()
}
