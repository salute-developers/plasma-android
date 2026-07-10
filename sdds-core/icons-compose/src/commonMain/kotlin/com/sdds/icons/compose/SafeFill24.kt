package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SafeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SafeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 9.5 11.0 c 0.0 -1.38 1.12 -2.5 2.5 -2.5 s 2.5 1.12 2.5 2.5 s -1.12 2.5 -2.5 2.5 s -2.5 -1.12 -2.5 -2.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.3 3.502 C 3.0 4.09 3.0 4.86 3.0 6.4 v 9.2 c 0.0 1.54 0.0 2.31 0.3 2.899 c 0.263 0.517 0.684 0.938 1.202 1.201 c 0.15 0.077 0.313 0.134 0.498 0.177 v 1.373 C 5.0 21.664 5.336 22.0 5.75 22.0 s 0.75 -0.336 0.75 -0.75 v -1.253 C 6.768 20.0 7.066 20.0 7.4 20.0 h 9.2 c 0.334 0.0 0.632 0.0 0.9 -0.003 v 1.253 c 0.0 0.414 0.336 0.75 0.75 0.75 S 19.0 21.664 19.0 21.25 v -1.373 c 0.185 -0.043 0.348 -0.1 0.498 -0.177 c 0.518 -0.263 0.939 -0.684 1.202 -1.201 C 21.0 17.91 21.0 17.14 21.0 15.6 V 6.4 c 0.0 -1.54 0.0 -2.31 -0.3 -2.898 C 20.437 2.984 20.016 2.563 19.5 2.3 C 18.91 2.0 18.14 2.0 16.6 2.0 H 7.4 C 5.86 2.0 5.09 2.0 4.502 2.3 C 3.984 2.563 3.563 2.984 3.3 3.502 Z M 12.0 7.0 c -2.21 0.0 -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 s 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 Z")
        )
    }.build()
}
