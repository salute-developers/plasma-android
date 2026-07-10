package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleUpOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleUpOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 16.47 14.53 c 0.293 0.293 0.767 0.293 1.06 0.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -5.0 -5.0 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 l -5.0 5.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 L 12.0 10.06 l 4.47 4.47 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z m 8.5 -10.0 c 0.0 4.694 -3.806 8.5 -8.5 8.5 S 3.5 16.694 3.5 12.0 S 7.306 3.5 12.0 3.5 s 8.5 3.806 8.5 8.5 Z")
        )
    }.build()
}
