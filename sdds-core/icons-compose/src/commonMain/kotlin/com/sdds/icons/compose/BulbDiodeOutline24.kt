package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BulbDiodeOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BulbDiodeOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 2.0 c -4.418 0.0 -8.0 3.582 -8.0 8.0 c 0.0 2.314 0.984 4.4 2.554 5.86 c 0.487 0.453 1.118 0.64 1.71 0.64 h 7.472 c 0.592 0.0 1.223 -0.187 1.71 -0.64 C 19.016 14.4 20.0 12.314 20.0 10.0 c 0.0 -4.418 -3.582 -8.0 -8.0 -8.0 Z m -6.5 8.0 c 0.0 -3.59 2.91 -6.5 6.5 -6.5 s 6.5 2.91 6.5 6.5 c 0.0 1.88 -0.798 3.574 -2.075 4.761 C 16.266 14.91 16.026 15.0 15.736 15.0 H 8.264 c -0.29 0.0 -0.53 -0.091 -0.689 -0.239 C 6.298 13.574 5.5 11.881 5.5 10.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 7.75 18.5 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 7.0 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 h -7.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.75 21.25 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 h 5.0 c 0.414 0.0 0.75 0.336 0.75 0.75 S 14.914 22.0 14.5 22.0 h -5.0 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 Z")
        )
    }.build()
}
