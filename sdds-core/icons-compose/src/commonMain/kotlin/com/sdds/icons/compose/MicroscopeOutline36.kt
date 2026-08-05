package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MicroscopeOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MicroscopeOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.5 3.5 c 1.795 0.0 3.25 1.455 3.25 3.25 v 3.504 c 4.047 0.097 8.213 2.536 10.379 6.519 c 2.221 4.084 1.755 9.287 -1.67 13.727 H 31.5 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 h -27.0 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 21.326 c 3.982 -4.18 4.52 -9.14 2.545 -12.773 c -1.822 -3.35 -5.318 -5.374 -8.621 -5.472 v 6.495 c 0.0 1.795 -1.455 3.25 -3.25 3.25 h -3.75 c -1.795 0.0 -3.25 -1.455 -3.25 -3.25 v -12.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 h 3.75 Z m -3.75 2.0 c -0.69 0.0 -1.25 0.56 -1.25 1.25 v 12.0 c 0.0 0.69 0.56 1.25 1.25 1.25 h 3.75 c 0.69 0.0 1.25 -0.56 1.25 -1.25 v -12.0 c 0.0 -0.69 -0.56 -1.25 -1.25 -1.25 h -3.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 18.458 24.875 c 0.552 0.0 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 H 10.79 c -0.552 0.0 -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 h 7.668 Z")
        )
    }.build()
}
