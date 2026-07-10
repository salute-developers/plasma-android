package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SunFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SunFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.0 3.1 c 0.58 0.0 1.05 -0.47 1.05 -1.05 C 9.05 1.47 8.58 1.0 8.0 1.0 C 7.42 1.0 6.95 1.47 6.95 2.05 C 6.95 2.63 7.42 3.1 8.0 3.1 Z M 8.0 15.0 c 0.58 0.0 1.05 -0.47 1.05 -1.05 c 0.0 -0.58 -0.47 -1.05 -1.05 -1.05 c -0.58 0.0 -1.05 0.47 -1.05 1.05 C 6.95 14.53 7.42 15.0 8.0 15.0 Z m 3.5 -7.0 c 0.0 1.933 -1.567 3.5 -3.5 3.5 S 4.5 9.933 4.5 8.0 S 6.067 4.5 8.0 4.5 s 3.5 1.567 3.5 3.5 Z m 1.448 -3.465 c -0.41 0.41 -1.074 0.41 -1.485 0.0 c -0.41 -0.41 -0.41 -1.075 0.0 -1.485 c 0.41 -0.41 1.075 -0.41 1.485 0.0 c 0.41 0.41 0.41 1.075 0.0 1.485 Z m -8.415 8.414 c -0.41 0.41 -1.074 0.41 -1.485 0.0 c -0.41 -0.41 -0.41 -1.075 0.0 -1.485 c 0.41 -0.41 1.075 -0.41 1.485 0.0 c 0.41 0.41 0.41 1.075 0.0 1.485 Z m 0.002 -8.415 c 0.41 -0.41 0.41 -1.074 0.0 -1.484 c -0.41 -0.41 -1.075 -0.41 -1.485 0.0 c -0.41 0.41 -0.41 1.074 0.0 1.484 c 0.41 0.41 1.075 0.41 1.485 0.0 Z m 8.415 8.415 c 0.41 -0.41 0.41 -1.075 0.0 -1.485 c -0.41 -0.41 -1.075 -0.41 -1.485 0.0 c -0.41 0.41 -0.41 1.075 0.0 1.485 c 0.41 0.41 1.075 0.41 1.485 0.0 Z M 2.05 6.95 C 2.63 6.95 3.1 7.42 3.1 8.0 c 0.0 0.58 -0.47 1.05 -1.05 1.05 C 1.47 9.05 1.0 8.58 1.0 8.0 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 Z m 11.9 0.0 C 14.53 6.95 15.0 7.42 15.0 8.0 c 0.0 0.58 -0.47 1.05 -1.05 1.05 c -0.58 0.0 -1.05 -0.47 -1.05 -1.05 c 0.0 -0.58 0.47 -1.05 1.05 -1.05 Z")
        )
    }.build()
}
