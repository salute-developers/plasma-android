package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.RialOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "RialOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 3.5 c -4.694 0.0 -8.5 3.806 -8.5 8.5 s 3.806 8.5 8.5 8.5 s 8.5 -3.806 8.5 -8.5 s -3.806 -8.5 -8.5 -8.5 Z M 2.0 12.0 C 2.0 6.477 6.477 2.0 12.0 2.0 s 10.0 4.477 10.0 10.0 s -4.477 10.0 -10.0 10.0 S 2.0 17.523 2.0 12.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 10.5 7.75 C 10.5 7.336 10.836 7.0 11.25 7.0 h 2.25 c 1.657 0.0 3.0 1.343 3.0 3.0 c 0.0 1.248 -0.762 2.318 -1.847 2.77 l 1.75 3.112 c 0.204 0.361 0.076 0.819 -0.285 1.022 c -0.361 0.203 -0.819 0.075 -1.022 -0.286 L 13.061 13.0 H 12.0 v 3.25 c 0.0 0.414 -0.336 0.75 -0.75 0.75 s -0.75 -0.336 -0.75 -0.75 v -8.5 Z m 2.985 3.75 H 12.0 h 1.485 Z m 0.026 0.0 C 14.334 11.494 15.0 10.825 15.0 10.0 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 12.0 v 3.0")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 8.25 7.0 C 8.664 7.0 9.0 7.336 9.0 7.75 v 8.5 C 9.0 16.664 8.664 17.0 8.25 17.0 S 7.5 16.664 7.5 16.25 v -8.5 C 7.5 7.336 7.836 7.0 8.25 7.0 Z")
        )
    }.build()
}
