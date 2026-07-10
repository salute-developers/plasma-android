package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoorLClosedFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoorLClosedFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.245 3.229 C 5.0 3.709 5.0 4.339 5.0 5.6 v 12.8 c 0.0 1.26 0.0 1.89 0.245 2.372 c 0.216 0.423 0.56 0.767 0.984 0.983 C 6.709 22.0 7.339 22.0 8.6 22.0 h 6.8 c 1.26 0.0 1.89 0.0 2.371 -0.245 c 0.424 -0.216 0.768 -0.56 0.984 -0.983 C 19.0 20.29 19.0 19.66 19.0 18.4 V 5.6 c 0.0 -1.26 0.0 -1.89 -0.245 -2.371 c -0.216 -0.424 -0.56 -0.768 -0.983 -0.984 C 17.29 2.0 16.66 2.0 15.4 2.0 H 8.6 C 7.34 2.0 6.71 2.0 6.229 2.245 C 5.805 2.461 5.46 2.805 5.245 3.23 Z M 14.5 14.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 S 15.328 11.0 14.5 11.0 S 13.0 11.672 13.0 12.5 s 0.672 1.5 1.5 1.5 Z")
        )
    }.build()
}
