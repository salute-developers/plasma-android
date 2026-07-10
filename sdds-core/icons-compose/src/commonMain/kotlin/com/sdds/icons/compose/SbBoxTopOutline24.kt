package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbBoxTopOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbBoxTopOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 13.25 11.5 c 0.0 0.69 -0.56 1.25 -1.25 1.25 s -1.25 -0.56 -1.25 -1.25 s 0.56 -1.25 1.25 -1.25 s 1.25 0.56 1.25 1.25 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 9.75 C 1.0 8.784 1.784 8.0 2.75 8.0 h 18.5 C 22.216 8.0 23.0 8.784 23.0 9.75 v 3.5 c 0.0 0.966 -0.784 1.75 -1.75 1.75 H 2.75 C 1.784 15.0 1.0 14.216 1.0 13.25 v -3.5 Z M 2.75 9.5 C 2.612 9.5 2.5 9.612 2.5 9.75 v 3.5 c 0.0 0.138 0.112 0.25 0.25 0.25 H 4.0 v -4.0 H 2.75 Z m 18.5 4.0 H 20.0 v -4.0 h 1.25 c 0.138 0.0 0.25 0.112 0.25 0.25 v 3.5 c 0.0 0.138 -0.112 0.25 -0.25 0.25 Z m -2.75 -4.0 h -13.0 v 4.0 h 13.0 v -4.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 6.0 16.0 c -0.414 0.0 -0.75 0.336 -0.75 0.75 S 5.586 17.5 6.0 17.5 h 12.0 c 0.414 0.0 0.75 -0.336 0.75 -0.75 S 18.414 16.0 18.0 16.0 H 6.0 Z")
        )
    }.build()
}
