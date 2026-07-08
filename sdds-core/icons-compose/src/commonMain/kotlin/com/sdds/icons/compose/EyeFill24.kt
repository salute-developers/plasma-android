package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.EyeFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "EyeFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.993 10.338 C 4.06 6.986 7.768 4.75 11.999 4.75 c 4.23 0.0 7.938 2.236 10.006 5.588 l 0.015 0.025 c 0.2 0.324 0.361 0.584 0.463 1.034 c 0.042 0.188 0.055 0.416 0.055 0.603 s -0.013 0.415 -0.055 0.603 c -0.102 0.45 -0.262 0.71 -0.463 1.035 l -0.015 0.024 C 19.937 17.014 16.23 19.25 12.0 19.25 c -4.23 0.0 -7.938 -2.236 -10.006 -5.588 l -0.016 -0.025 c -0.2 -0.324 -0.36 -0.584 -0.462 -1.034 C 1.473 12.415 1.46 12.187 1.46 12.0 s 0.013 -0.415 0.055 -0.603 c 0.101 -0.45 0.262 -0.71 0.462 -1.035 l 0.016 -0.024 Z M 6.249 12.0 c 0.0 -3.176 2.574 -5.75 5.75 -5.75 c 3.175 0.0 5.75 2.574 5.75 5.75 s -2.574 5.75 -5.75 5.75 s -5.75 -2.574 -5.75 -5.75 Z m 5.75 4.0 c 2.21 0.0 4.0 -1.79 4.0 -4.0 s -1.79 -4.0 -4.0 -4.0 s -4.0 1.79 -4.0 4.0 s 1.79 4.0 4.0 4.0 Z")
        )
    }.build()
}
