package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PcMouseOutline36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PcMouseOutline36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 19.0 10.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 v 5.0 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 v -5.0 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 7.5 13.5 C 7.5 7.701 12.201 3.0 18.0 3.0 s 10.5 4.701 10.5 10.5 v 9.0 C 28.5 28.299 23.799 33.0 18.0 33.0 S 7.5 28.299 7.5 22.5 v -9.0 Z m 19.0 0.0 v 9.0 c 0.0 4.694 -3.806 8.5 -8.5 8.5 s -8.5 -3.806 -8.5 -8.5 v -9.0 C 9.5 8.806 13.306 5.0 18.0 5.0 s 8.5 3.806 8.5 8.5 Z")
        )
    }.build()
}
