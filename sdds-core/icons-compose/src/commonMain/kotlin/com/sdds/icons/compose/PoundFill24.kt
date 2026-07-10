package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PoundFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PoundFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 12.0 c 0.0 5.523 -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 S 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 Z M 7.5 7.25 c 0.414 0.0 0.75 0.336 0.75 0.75 v 7.25 h 2.85 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 7.6 c -0.47 0.0 -0.85 -0.38 -0.85 -0.85 V 8.0 c 0.0 -0.414 0.336 -0.75 0.75 -0.75 Z m 5.4 0.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 v 7.9 c 0.0 0.47 0.38 0.85 0.85 0.85 h 3.5 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -2.85 v -2.66 h 2.55 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -2.55 V 8.75 h 2.55 c 0.414 0.0 0.75 -0.336 0.75 -0.75 s -0.336 -0.75 -0.75 -0.75 h -3.3 Z")
        )
    }.build()
}
