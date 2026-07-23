package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BatteryHorizEmptyFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BatteryHorizEmptyFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 10.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 h -1.108 c -0.052 -0.288 -0.128 -0.532 -0.24 -0.753 c -0.308 -0.602 -0.797 -1.091 -1.4 -1.398 C 17.569 6.5 16.673 6.5 14.88 6.5 H 7.12 c -1.792 0.0 -2.688 0.0 -3.373 0.349 C 3.145 7.156 2.656 7.645 2.35 8.247 C 2.0 8.932 2.0 9.827 2.0 11.62 v 0.76 c 0.0 1.792 0.0 2.688 0.349 3.373 c 0.307 0.602 0.796 1.091 1.398 1.398 C 4.432 17.5 5.327 17.5 7.12 17.5 h 7.76 c 1.792 0.0 2.688 0.0 3.373 -0.349 c 0.602 -0.307 1.091 -0.796 1.398 -1.398 c 0.113 -0.221 0.19 -0.465 0.24 -0.753 H 21.0 c 0.552 0.0 1.0 -0.448 1.0 -1.0 v -4.0 Z")
        )
    }.build()
}
