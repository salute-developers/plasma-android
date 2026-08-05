package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DishwasherNormalFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DishwasherNormalFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.75 6.0 c 0.0 -1.795 1.455 -3.25 3.25 -3.25 S 15.25 4.205 15.25 6.0 h 5.0 C 20.664 6.0 21.0 6.336 21.0 6.75 S 20.664 7.5 20.25 7.5 H 19.0 v 6.781 c 0.0 0.674 0.0 1.224 -0.037 1.672 L 18.96 16.0 H 11.5 c -1.105 0.0 -2.0 0.895 -2.0 2.0 v 1.0 c -0.575 0.0 -1.055 -0.004 -1.453 -0.037 c -0.463 -0.037 -0.882 -0.118 -1.272 -0.317 c -0.612 -0.312 -1.11 -0.809 -1.42 -1.42 c -0.2 -0.391 -0.28 -0.81 -0.318 -1.273 C 5.0 15.506 5.0 14.955 5.0 14.281 V 7.5 H 3.75 C 3.336 7.5 3.0 7.164 3.0 6.75 S 3.336 6.0 3.75 6.0 h 5.0 Z m 1.5 0.0 c 0.0 -0.966 0.784 -1.75 1.75 -1.75 S 13.75 5.034 13.75 6.0 h -3.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.75 17.5 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 11.336 19.0 11.75 19.0 h 2.378 c 0.309 0.874 1.142 1.5 2.122 1.5 h 0.5 c 0.98 0.0 1.813 -0.626 2.122 -1.5 h 2.378 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -9.5 Z")
        )
    }.build()
}
