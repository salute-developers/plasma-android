package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ArrowBarDown16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ArrowBarDown16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.958 1.875 c 0.276 0.0 0.5 0.224 0.5 0.5 v 8.03 l 2.81 -2.856 c 0.194 -0.197 0.51 -0.2 0.708 -0.006 c 0.196 0.194 0.2 0.51 0.005 0.707 l -3.666 3.726 c -0.097 0.098 -0.23 0.152 -0.369 0.15 c -0.138 -0.004 -0.268 -0.064 -0.36 -0.167 L 4.252 8.233 C 4.068 8.027 4.086 7.71 4.292 7.527 C 4.497 7.343 4.814 7.36 4.998 7.566 l 2.46 2.75 V 2.375 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z M 2.5 14.0 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 h 10.0 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 3.0 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 Z")
        )
    }.build()
}
