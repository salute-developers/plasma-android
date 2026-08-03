package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SuperscriptText24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SuperscriptText24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 17.536 8.42 V 9.49 H 21.5 V 8.42 h -1.193 V 2.5 H 19.51 l -1.973 1.428 v 1.188 l 1.632 -1.188 V 8.42 h -1.632 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 11.365 17.5 L 7.991 7.338 H 6.327 L 3.0 17.5 h 1.488 l 0.773 -2.41 h 3.761 l 0.785 2.41 h 1.558 Z m -2.882 -4.08 H 5.788 l 1.348 -4.165 l 1.347 4.166 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.092 10.634 v 2.12 c 0.398 -0.77 1.019 -1.293 2.097 -1.293 c 0.785 0.0 1.183 0.32 1.183 1.35 v 0.32 h -1.324 c -1.44 0.0 -2.413 0.464 -2.413 2.119 c 0.0 1.423 0.703 2.25 1.886 2.25 c 0.937 0.0 1.652 -0.58 1.933 -1.423 v 1.307 h 1.289 v -4.79 c 0.0 -1.888 -0.844 -2.614 -2.554 -2.614 c -1.008 0.0 -1.71 0.29 -2.097 0.654 Z m 3.28 4.195 c -0.059 0.493 -0.492 1.147 -1.418 1.147 c -0.609 0.0 -0.937 -0.349 -0.937 -0.9 c 0.0 -0.654 0.387 -0.842 1.195 -0.842 h 1.16 v 0.595 Z")
        )
    }.build()
}
