package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SmileFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SmileFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m -4.875 -16.5 c 1.036 0.0 1.875 -0.84 1.875 -1.875 c 0.0 -1.036 -0.84 -1.875 -1.875 -1.875 c -1.036 0.0 -1.875 0.84 -1.875 1.875 c 0.0 1.036 0.84 1.875 1.875 1.875 Z m 11.625 -1.875 c 0.0 1.036 -0.84 1.875 -1.875 1.875 C 21.84 16.5 21.0 15.66 21.0 14.625 c 0.0 -1.036 0.84 -1.875 1.875 -1.875 c 1.035 0.0 1.875 0.84 1.875 1.875 Z M 12.37 21.25 c -0.275 -0.478 -0.887 -0.642 -1.365 -0.366 c -0.479 0.276 -0.642 0.888 -0.366 1.366 c 0.746 1.292 1.819 2.365 3.111 3.111 C 15.042 26.107 16.508 26.5 18.0 26.5 s 2.958 -0.393 4.25 -1.139 c 1.292 -0.746 2.365 -1.819 3.111 -3.111 c 0.276 -0.478 0.113 -1.09 -0.366 -1.366 c -0.478 -0.276 -1.09 -0.112 -1.366 0.366 c -0.57 0.988 -1.39 1.809 -2.379 2.38 c -0.988 0.57 -2.109 0.87 -3.25 0.87 s -2.262 -0.3 -3.25 -0.87 c -0.988 -0.571 -1.809 -1.392 -2.38 -2.38 Z")
        )
    }.build()
}
