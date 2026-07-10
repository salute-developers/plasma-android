package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.AppsOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "AppsOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.5 11.0 C 8.985 11.0 11.0 8.985 11.0 6.5 S 8.985 2.0 6.5 2.0 S 2.0 4.015 2.0 6.5 S 4.015 11.0 6.5 11.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.5 13.0 C 4.015 13.0 2.0 15.015 2.0 17.5 S 4.015 22.0 6.5 22.0 s 4.5 -2.015 4.5 -4.5 S 8.985 13.0 6.5 13.0 Z m -3.0 4.5 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 s 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 13.0 6.5 C 13.0 4.015 15.015 2.0 17.5 2.0 S 22.0 4.015 22.0 6.5 S 19.985 11.0 17.5 11.0 S 13.0 8.985 13.0 6.5 Z m 4.5 -3.0 c -1.657 0.0 -3.0 1.343 -3.0 3.0 s 1.343 3.0 3.0 3.0 s 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 17.5 13.0 c -2.485 0.0 -4.5 2.015 -4.5 4.5 s 2.015 4.5 4.5 4.5 s 4.5 -2.015 4.5 -4.5 s -2.015 -4.5 -4.5 -4.5 Z m -3.0 4.5 c 0.0 -1.657 1.343 -3.0 3.0 -3.0 s 3.0 1.343 3.0 3.0 s -1.343 3.0 -3.0 3.0 s -3.0 -1.343 -3.0 -3.0 Z")
        )
    }.build()
}
