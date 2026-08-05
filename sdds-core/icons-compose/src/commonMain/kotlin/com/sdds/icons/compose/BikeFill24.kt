package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BikeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BikeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 14.75 6.5 c 0.966 0.0 1.75 -0.784 1.75 -1.75 S 15.716 3.0 14.75 3.0 S 13.0 3.784 13.0 4.75 s 0.784 1.75 1.75 1.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 17.25 10.75 c -1.967 0.0 -3.425 -1.025 -4.432 -2.052 l -2.162 2.162 l 1.483 1.271 c 0.388 0.333 0.611 0.818 0.611 1.329 V 17.0 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -3.54 c 0.0 -0.073 -0.032 -0.142 -0.087 -0.19 l -2.331 -1.998 c -0.774 -0.663 -0.82 -1.845 -0.099 -2.566 l 1.902 -1.902 c 0.778 -0.778 2.01 -0.628 2.656 0.169 l 0.128 0.155 c 0.906 1.078 2.15 2.122 3.831 2.122 C 17.664 9.25 18.0 9.586 18.0 10.0 s -0.336 0.75 -0.75 0.75 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.0 20.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 s -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 Z m 0.0 -3.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 s 0.448 1.0 1.0 1.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 16.0 c 0.0 2.21 -1.79 4.0 -4.0 4.0 s -4.0 -1.79 -4.0 -4.0 s 1.79 -4.0 4.0 -4.0 s 4.0 1.79 4.0 4.0 Z m -3.0 0.0 c 0.0 0.552 -0.448 1.0 -1.0 1.0 s -1.0 -0.448 -1.0 -1.0 s 0.448 -1.0 1.0 -1.0 s 1.0 0.448 1.0 1.0 Z")
        )
    }.build()
}
