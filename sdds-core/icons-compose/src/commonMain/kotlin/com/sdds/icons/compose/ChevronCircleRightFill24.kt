package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.ChevronCircleRightFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "ChevronCircleRightFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 12.0 c 0.0 -5.523 -4.477 -10.0 -10.0 -10.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 s 10.0 -4.477 10.0 -10.0 Z M 9.47 16.47 c -0.293 0.293 -0.293 0.767 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 5.0 -5.0 c 0.293 -0.293 0.293 -0.767 0.0 -1.06 l -5.0 -5.0 c -0.293 -0.293 -0.767 -0.293 -1.06 0.0 c -0.293 0.293 -0.293 0.767 0.0 1.06 L 13.94 12.0 l -4.47 4.47 Z")
        )
    }.build()
}
