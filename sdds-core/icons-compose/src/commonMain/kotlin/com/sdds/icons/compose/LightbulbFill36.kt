package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.LightbulbFill36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "LightbulbFill36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 6.5 14.25 C 6.5 8.037 11.537 3.0 17.75 3.0 S 29.0 8.037 29.0 14.25 c 0.0 3.382 -1.494 6.417 -3.854 8.478 c -0.432 0.376 -0.713 0.8 -0.817 1.23 l -0.336 1.388 c -0.448 1.85 -2.105 3.154 -4.01 3.154 h -4.467 c -1.904 0.0 -3.56 -1.303 -4.009 -3.154 l -0.336 -1.389 c -0.104 -0.43 -0.385 -0.853 -0.817 -1.23 c -2.36 -2.06 -3.854 -5.095 -3.854 -8.477 Z m 6.704 0.704 c 0.44 -0.439 1.152 -0.439 1.591 0.0 l 2.955 2.955 l 2.954 -2.954 c 0.44 -0.44 1.152 -0.44 1.591 0.0 c 0.44 0.439 0.44 1.151 0.0 1.59 l -3.42 3.421 v 3.284 c 0.0 0.621 -0.504 1.125 -1.125 1.125 s -1.125 -0.504 -1.125 -1.125 v -3.284 l -3.42 -3.42 c -0.44 -0.44 -0.44 -1.152 0.0 -1.591 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 14.0 30.75 c -0.621 0.0 -1.125 0.504 -1.125 1.125 S 13.379 33.0 14.0 33.0 h 7.5 c 0.621 0.0 1.125 -0.504 1.125 -1.125 S 22.121 30.75 21.5 30.75 H 14.0 Z")
        )
    }.build()
}
