package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RubleFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RubleFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.0 11.5 h -1.5 v -3.0 H 13.0 c 0.828 0.0 1.5 0.672 1.5 1.5 s -0.672 1.5 -1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 10.75 7.0 C 10.336 7.0 10.0 7.336 10.0 7.75 v 3.75 H 9.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 8.836 13.0 9.25 13.0 H 10.0 v 1.0 H 9.25 c -0.414 0.0 -0.75 0.336 -0.75 0.75 s 0.336 0.75 0.75 0.75 H 10.0 V 17.0 h 1.5 v -1.5 h 1.75 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 13.664 14.0 13.25 14.0 H 11.5 v -1.0 H 13.0 c 1.657 0.0 3.0 -1.343 3.0 -3.0 s -1.343 -3.0 -3.0 -3.0 h -2.25 Z")
        )
    }.build()
}
