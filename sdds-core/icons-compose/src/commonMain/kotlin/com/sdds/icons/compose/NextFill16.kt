package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NextFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NextFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.001 13.001 c 0.0 0.276 -0.224 0.5 -0.5 0.5 s -0.5 -0.224 -0.5 -0.5 V 3.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 s 0.5 0.224 0.5 0.5 V 13.0 Z m -3.567 -5.728 c 0.679 0.408 0.679 1.392 0.0 1.8 L 3.59 13.189 C 2.89 13.61 2.0 13.106 2.0 12.29 L 1.997 4.056 c 0.0 -0.816 0.891 -1.32 1.591 -0.9 l 6.845 4.117 Z")
        )
    }.build()
}
