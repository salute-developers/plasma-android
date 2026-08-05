package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RialFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RialFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 Z M 10.5 7.75 C 10.5 7.336 10.836 7.0 11.25 7.0 h 2.263 c 1.65 0.0 2.987 1.337 2.987 2.987 c 0.0 1.244 -0.76 2.31 -1.842 2.76 l 1.745 3.084 c 0.204 0.36 0.077 0.818 -0.284 1.022 c -0.36 0.204 -0.818 0.077 -1.022 -0.284 l -2.034 -3.595 H 12.0 V 16.2 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 V 7.75 Z m 1.5 3.723 h 1.485 h 0.028 c 0.821 0.0 1.487 -0.665 1.487 -1.486 S 14.334 8.5 13.513 8.5 H 12.0 v 2.973 Z M 9.0 7.75 C 9.0 7.336 8.664 7.0 8.25 7.0 S 7.5 7.336 7.5 7.75 v 8.45 c 0.0 0.414 0.336 0.75 0.75 0.75 S 9.0 16.614 9.0 16.2 V 7.75 Z")
        )
    }.build()
}
