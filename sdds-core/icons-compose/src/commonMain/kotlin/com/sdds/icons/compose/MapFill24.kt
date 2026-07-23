package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.MapFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "MapFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 4.75 c 0.0 -0.23 -0.105 -0.447 -0.286 -0.589 c -0.18 -0.142 -0.416 -0.194 -0.639 -0.14 l -5.678 1.362 c -0.234 0.056 -0.28 0.066 -0.321 0.07 c -0.048 0.004 -0.096 0.004 -0.144 -0.001 c -0.042 -0.004 -0.088 -0.014 -0.32 -0.072 L 9.715 4.156 C 9.54 4.112 9.383 4.072 9.22 4.056 C 9.076 4.04 8.931 4.04 8.787 4.054 C 8.624 4.069 8.467 4.106 8.29 4.149 L 2.575 5.521 C 2.238 5.6 2.0 5.903 2.0 6.25 v 13.0 c 0.0 0.23 0.105 0.447 0.286 0.589 c 0.18 0.142 0.416 0.194 0.639 0.14 l 5.678 -1.363 c 0.234 -0.055 0.28 -0.065 0.321 -0.069 c 0.048 -0.004 0.096 -0.004 0.144 0.001 c 0.042 0.004 0.088 0.014 0.32 0.072 l 4.896 1.224 c 0.177 0.044 0.334 0.084 0.497 0.1 c 0.143 0.015 0.288 0.015 0.432 0.002 c 0.163 -0.015 0.32 -0.053 0.498 -0.095 l 5.714 -1.372 C 21.762 18.4 22.0 18.097 22.0 17.75 v -13.0 Z M 9.75 6.25 C 9.75 5.836 9.414 5.5 9.0 5.5 S 8.25 5.836 8.25 6.25 v 10.0 C 8.25 16.664 8.586 17.0 9.0 17.0 s 0.75 -0.336 0.75 -0.75 v -10.0 Z m 6.0 1.5 C 15.75 7.336 15.414 7.0 15.0 7.0 s -0.75 0.336 -0.75 0.75 v 10.0 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -10.0 Z")
        )
    }.build()
}
