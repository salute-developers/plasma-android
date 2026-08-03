package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RedCrossFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RedCrossFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.036 4.433 C 12.75 4.995 12.75 5.73 12.75 7.2 v 5.55 H 7.2 c -1.47 0.0 -2.205 0.0 -2.767 0.286 c -0.494 0.252 -0.895 0.653 -1.147 1.147 C 3.0 14.745 3.0 15.48 3.0 16.95 v 2.1 c 0.0 1.47 0.0 2.205 0.286 2.767 c 0.252 0.494 0.653 0.895 1.147 1.147 C 4.995 23.25 5.73 23.25 7.2 23.25 h 5.55 v 5.55 c 0.0 1.47 0.0 2.205 0.286 2.767 c 0.252 0.494 0.653 0.895 1.147 1.147 C 14.745 33.0 15.48 33.0 16.95 33.0 h 2.1 c 1.47 0.0 2.205 0.0 2.767 -0.286 c 0.494 -0.252 0.895 -0.653 1.147 -1.147 c 0.286 -0.562 0.286 -1.297 0.286 -2.767 v -5.55 h 5.55 c 1.47 0.0 2.205 0.0 2.767 -0.286 c 0.494 -0.252 0.895 -0.653 1.147 -1.147 C 33.0 21.255 33.0 20.52 33.0 19.05 v -2.1 c 0.0 -1.47 0.0 -2.205 -0.286 -2.767 c -0.252 -0.494 -0.653 -0.895 -1.147 -1.147 c -0.562 -0.286 -1.297 -0.286 -2.767 -0.286 h -5.55 V 7.2 c 0.0 -1.47 0.0 -2.205 -0.286 -2.767 c -0.252 -0.494 -0.653 -0.895 -1.147 -1.147 C 21.255 3.0 20.52 3.0 19.05 3.0 h -2.1 c -1.47 0.0 -2.205 0.0 -2.767 0.286 c -0.494 0.252 -0.895 0.653 -1.147 1.147 Z")
        )
    }.build()
}
