package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PaletteFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PaletteFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.804 4.087 c 9.0 -1.0 15.811 6.82 15.061 12.82 c 0.0 0.75 -0.75 4.125 -3.0 5.25 c -3.0 1.5 -5.812 0.0 -7.5 2.25 c -1.687 2.25 1.716 5.106 -0.75 6.75 c -4.5 3.0 -15.749 -1.57 -16.561 -11.32 c -0.688 -8.25 5.294 -14.921 12.75 -15.75 Z M 14.93 23.962 c -1.243 0.0 -2.25 1.008 -2.25 2.25 c 0.0 1.243 1.007 2.25 2.25 2.25 c 1.242 0.0 2.25 -1.007 2.25 -2.25 c 0.0 -1.242 -1.008 -2.25 -2.25 -2.25 Z m -4.875 -5.625 c -1.243 0.0 -2.25 1.008 -2.25 2.25 c 0.0 1.243 1.007 2.25 2.25 2.25 c 1.242 0.0 2.25 -1.007 2.25 -2.25 c 0.0 -1.242 -1.008 -2.25 -2.25 -2.25 Z m 15.75 -6.0 c -1.243 0.0 -2.25 1.008 -2.25 2.25 c 0.0 1.243 1.007 2.25 2.25 2.25 c 1.242 0.0 2.25 -1.007 2.25 -2.25 c 0.0 -1.242 -1.008 -2.25 -2.25 -2.25 Z m -14.25 -1.5 c -1.243 0.0 -2.25 1.008 -2.25 2.25 c 0.0 1.243 1.007 2.25 2.25 2.25 c 1.242 0.0 2.25 -1.007 2.25 -2.25 c 0.0 -1.242 -1.008 -2.25 -2.25 -2.25 Z m 7.5 -3.0 c -1.243 0.0 -2.25 1.008 -2.25 2.25 c 0.0 1.243 1.007 2.25 2.25 2.25 c 1.242 0.0 2.25 -1.007 2.25 -2.25 c 0.0 -1.242 -1.008 -2.25 -2.25 -2.25 Z")
        )
    }.build()
}
