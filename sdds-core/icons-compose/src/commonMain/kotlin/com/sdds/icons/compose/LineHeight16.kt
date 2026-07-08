package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LineHeight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LineHeight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.25 13.85 c 0.276 0.0 0.5 0.224 0.5 0.5 c 0.0 0.277 -0.224 0.5 -0.5 0.5 H 2.75 c -0.276 0.0 -0.5 -0.223 -0.5 -0.5 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 10.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.2 12.9 h -1.39 l -0.863 -2.465 H 5.97 L 5.119 12.9 h -1.32 l 3.429 -9.8 h 1.497 l 3.475 9.8 Z M 6.437 9.064 h 3.03 l -1.52 -4.382 l -1.51 4.382 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.25 1.25 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 2.75 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 10.5 Z")
        )
    }.build()
}
