package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RealOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RealOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.0 8.25 C 7.0 7.836 7.336 7.5 7.75 7.5 h 1.882 c 1.584 0.0 2.868 1.284 2.868 2.868 c 0.0 1.147 -0.674 2.137 -1.647 2.595 l 1.56 2.935 c 0.194 0.366 0.055 0.82 -0.311 1.014 c -0.366 0.195 -0.82 0.056 -1.014 -0.31 l -1.789 -3.367 H 8.5 v 3.015 C 8.5 16.664 8.164 17.0 7.75 17.0 S 7.0 16.664 7.0 16.25 v -8.0 Z m 1.5 3.485 h 1.132 c 0.756 0.0 1.368 -0.612 1.368 -1.367 C 11.0 9.612 10.388 9.0 9.632 9.0 H 8.5 v 2.735 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.0 7.25 c 0.0 -0.414 -0.336 -0.75 -0.75 -0.75 S 14.5 6.836 14.5 7.25 v 0.728 C 13.626 8.287 13.0 9.12 13.0 10.1 v 0.15 c 0.0 1.243 1.007 2.25 2.25 2.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 0.15 c 0.0 0.414 -0.336 0.75 -0.75 0.75 h -1.167 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 H 14.5 v 0.6 c 0.0 0.414 0.336 0.75 0.75 0.75 S 16.0 16.664 16.0 16.25 v -0.728 c 0.874 -0.309 1.5 -1.142 1.5 -2.122 v -0.15 c 0.0 -1.243 -1.007 -2.25 -2.25 -2.25 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 V 10.1 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 1.167 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 H 16.0 v -0.6 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z m 10.0 -8.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 s 3.806 8.5 8.5 8.5 s 8.5 -3.806 8.5 -8.5 s -3.806 -8.5 -8.5 -8.5 Z")
        )
    }.build()
}
