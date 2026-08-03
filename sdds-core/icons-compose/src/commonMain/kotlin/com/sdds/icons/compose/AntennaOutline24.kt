package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AntennaOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AntennaOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 8.5 C 2.0 7.12 3.12 6.0 4.5 6.0 S 7.0 7.12 7.0 8.5 S 5.88 11.0 4.5 11.0 S 2.0 9.88 2.0 8.5 Z m 2.5 -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.5 8.5 C 9.5 7.12 10.62 6.0 12.0 6.0 s 2.5 1.12 2.5 2.5 S 13.38 11.0 12.0 11.0 S 9.5 9.88 9.5 8.5 Z m 2.5 -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 19.5 6.0 C 18.12 6.0 17.0 7.12 17.0 8.5 s 1.12 2.5 2.5 2.5 S 22.0 9.88 22.0 8.5 S 20.88 6.0 19.5 6.0 Z m -1.0 2.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 5.75 15.5 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 s 2.5 1.12 2.5 2.5 S 9.63 18.0 8.25 18.0 s -2.5 -1.12 -2.5 -2.5 Z m 2.5 -1.0 c -0.552 0.0 -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 15.75 13.0 c -1.38 0.0 -2.5 1.12 -2.5 2.5 s 1.12 2.5 2.5 2.5 s 2.5 -1.12 2.5 -2.5 s -1.12 -2.5 -2.5 -2.5 Z m -1.0 2.5 c 0.0 -0.552 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 s -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 Z")
        )
    }.build()
}
