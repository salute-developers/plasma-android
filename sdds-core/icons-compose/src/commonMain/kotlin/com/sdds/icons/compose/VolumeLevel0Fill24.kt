package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VolumeLevel0Fill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VolumeLevel0Fill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 3.0 13.19 v -2.38 C 3.0 9.81 3.81 9.0 4.81 9.0 C 5.57 9.0 6.293 8.683 6.808 8.126 l 2.417 -2.619 c 0.864 -0.936 1.296 -1.404 1.67 -1.444 c 0.324 -0.034 0.644 0.091 0.859 0.336 C 12.0 4.682 12.0 5.32 12.0 6.592 v 10.816 c 0.0 1.273 0.0 1.91 -0.247 2.193 c -0.215 0.245 -0.535 0.37 -0.86 0.336 c -0.373 -0.04 -0.805 -0.508 -1.669 -1.444 l -2.417 -2.62 C 6.292 15.318 5.569 15.0 4.81 15.0 C 3.81 15.0 3.0 14.19 3.0 13.19 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.47 8.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 18.0 10.94 l 2.47 -2.47 c 0.293 -0.293 0.767 -0.293 1.06 0.0 c 0.293 0.293 0.293 0.767 0.0 1.06 L 19.06 12.0 l 2.47 2.47 c 0.293 0.292 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.767 0.293 -1.06 0.0 L 18.0 13.06 l -2.47 2.47 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 L 16.94 12.0 l -2.47 -2.47 c -0.293 -0.293 -0.293 -0.767 0.0 -1.06 Z")
        )
    }.build()
}
