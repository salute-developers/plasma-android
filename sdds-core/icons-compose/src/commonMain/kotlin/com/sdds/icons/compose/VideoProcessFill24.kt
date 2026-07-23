package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.VideoProcessFill24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "VideoProcessFill24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 22.0 c 5.523 0.0 10.0 -4.477 10.0 -10.0 S 17.523 2.0 12.0 2.0 S 2.0 6.477 2.0 12.0 s 4.477 10.0 10.0 10.0 Z M 8.5 7.0 C 7.672 7.0 7.0 7.672 7.0 8.5 v 7.0 C 7.0 16.328 7.672 17.0 8.5 17.0 h 7.0 c 0.828 0.0 1.5 -0.672 1.5 -1.5 v -7.0 C 17.0 7.672 16.328 7.0 15.5 7.0 h -7.0 Z")
        )
    }.build()
}
