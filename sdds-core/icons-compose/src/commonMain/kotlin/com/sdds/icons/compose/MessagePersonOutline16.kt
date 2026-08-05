package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MessagePersonOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MessagePersonOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 10.214 6.73 c 0.0 1.175 -0.956 2.127 -2.136 2.127 c -1.18 0.0 -2.136 -0.952 -2.136 -2.127 c 0.0 -1.175 0.956 -2.127 2.136 -2.127 c 1.18 0.0 2.136 0.952 2.136 2.127 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 11.38 10.398 c -0.752 1.001 -1.951 1.649 -3.303 1.649 c -1.35 0.0 -2.55 -0.648 -3.301 -1.65 c 0.992 -0.5 2.113 -0.78 3.301 -0.78 c 1.188 0.0 2.31 0.28 3.302 0.78 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.079 1.975 c -3.308 0.0 -5.992 2.67 -5.992 5.97 c 0.0 0.714 0.126 1.4 0.358 2.037 c 0.131 0.362 0.167 0.713 0.081 1.02 L 2.015 12.82 c -0.2 0.71 0.454 1.366 1.165 1.167 l 1.836 -0.512 c 0.304 -0.085 0.653 -0.05 1.012 0.081 c 0.64 0.232 1.331 0.359 2.05 0.359 c 3.308 0.0 5.993 -2.671 5.993 -5.97 c 0.0 -3.3 -2.685 -5.97 -5.992 -5.97 Z m -4.992 5.97 c 0.0 -2.743 2.233 -4.97 4.992 -4.97 s 4.992 2.227 4.992 4.97 s -2.233 4.97 -4.992 4.97 c -0.602 0.0 -1.177 -0.106 -1.71 -0.299 c -0.488 -0.177 -1.058 -0.261 -1.621 -0.104 l -1.745 0.486 l 0.486 -1.726 c 0.16 -0.568 0.074 -1.142 -0.105 -1.632 c -0.192 -0.529 -0.297 -1.1 -0.297 -1.695 Z")
        )
    }.build()
}
