package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DoneCircleFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DoneCircleFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 18.0 33.0 c 8.284 0.0 15.0 -6.716 15.0 -15.0 c 0.0 -8.284 -6.716 -15.0 -15.0 -15.0 C 9.716 3.0 3.0 9.716 3.0 18.0 c 0.0 8.284 6.716 15.0 15.0 15.0 Z m 8.543 -18.422 c 0.595 -0.575 0.611 -1.525 0.035 -2.12 c -0.575 -0.596 -1.525 -0.612 -2.12 -0.037 l -9.82 9.493 l -3.095 -2.992 c -0.596 -0.576 -1.546 -0.56 -2.121 0.035 c -0.576 0.596 -0.56 1.546 0.035 2.121 l 4.138 4.0 c 0.582 0.563 1.504 0.563 2.085 0.0 l 10.863 -10.5 Z")
        )
    }.build()
}
