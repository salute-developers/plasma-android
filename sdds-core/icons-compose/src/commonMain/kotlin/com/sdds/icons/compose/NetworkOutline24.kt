package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.NetworkOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "NetworkOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.05 5.05 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 c -0.293 -0.294 -0.768 -0.294 -1.06 0.0 C 4.396 5.582 3.5 7.744 3.5 10.0 c 0.0 2.254 0.896 4.416 2.49 6.01 c 0.292 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.768 0.0 -1.06 C 5.737 13.636 5.0 11.855 5.0 10.0 c 0.0 -1.857 0.737 -3.637 2.05 -4.95 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 6.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 c 0.0 1.952 1.4 3.578 3.25 3.93 v 6.32 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -6.32 C 14.6 13.577 16.0 11.951 16.0 10.0 c 0.0 -2.21 -1.79 -4.0 -4.0 -4.0 Z m -2.5 4.0 c 0.0 -1.381 1.12 -2.5 2.5 -2.5 s 2.5 1.119 2.5 2.5 c 0.0 1.38 -1.12 2.5 -2.5 2.5 S 9.5 11.38 9.5 10.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.95 3.99 c 0.293 -0.294 0.768 -0.294 1.06 0.0 C 19.605 5.582 20.5 7.744 20.5 10.0 c 0.0 2.254 -0.895 4.416 -2.49 6.01 c -0.293 0.293 -0.767 0.293 -1.06 0.0 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 C 18.263 13.636 19.0 11.855 19.0 10.0 c 0.0 -1.857 -0.738 -3.637 -2.05 -4.95 c -0.293 -0.293 -0.293 -0.768 0.0 -1.06 Z")
        )
    }.build()
}
