package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbboxTopFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbboxTopFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.5 15.7 c 0.0 -1.47 0.0 -2.205 0.286 -2.767 c 0.252 -0.494 0.653 -0.895 1.147 -1.147 C 3.495 11.5 4.23 11.5 5.7 11.5 h 24.6 c 1.47 0.0 2.205 0.0 2.767 0.286 c 0.494 0.252 0.895 0.653 1.147 1.147 C 34.5 13.495 34.5 14.23 34.5 15.7 v 2.1 c 0.0 1.47 0.0 2.205 -0.286 2.767 c -0.252 0.494 -0.653 0.895 -1.147 1.147 C 32.505 22.0 31.77 22.0 30.3 22.0 H 5.7 c -1.47 0.0 -2.205 0.0 -2.767 -0.286 c -0.494 -0.252 -0.895 -0.653 -1.147 -1.147 C 1.5 20.005 1.5 19.27 1.5 17.8 v -2.1 Z m 19.125 1.05 c 0.0 1.45 -1.175 2.625 -2.625 2.625 s -2.625 -1.175 -2.625 -2.625 S 16.55 14.125 18.0 14.125 s 2.625 1.175 2.625 2.625 Z m -13.875 -3.0 H 4.5 v 6.0 h 2.25 v -6.0 Z m 24.75 0.0 v 6.0 h -2.25 v -6.0 h 2.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.0 23.625 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 h 18.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 H 9.0 Z")
        )
    }.build()
}
