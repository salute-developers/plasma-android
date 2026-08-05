package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RandOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RandOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.0 7.25 C 9.586 7.25 9.25 7.586 9.25 8.0 v 8.5 c 0.0 0.414 0.336 0.75 0.75 0.75 s 0.75 -0.336 0.75 -0.75 v -3.25 h 1.061 l 2.035 3.618 c 0.203 0.36 0.66 0.489 1.022 0.286 c 0.36 -0.203 0.489 -0.66 0.286 -1.022 l -1.75 -3.112 c 1.084 -0.452 1.846 -1.522 1.846 -2.77 c 0.0 -1.657 -1.343 -3.0 -3.0 -3.0 H 10.0 Z m 3.75 3.0 c 0.0 0.825 -0.666 1.494 -1.489 1.5 H 10.75 v -3.0 h 1.5 c 0.828 0.0 1.5 0.672 1.5 1.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z m 10.0 -8.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 s 3.806 8.5 8.5 8.5 s 8.5 -3.806 8.5 -8.5 s -3.806 -8.5 -8.5 -8.5 Z")
        )
    }.build()
}
