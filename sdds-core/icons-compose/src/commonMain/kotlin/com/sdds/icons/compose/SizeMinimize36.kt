package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SizeMinimize36: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SizeMinimize36",
        defaultWidth = 36.dp,
        defaultHeight = 36.dp,
        viewportWidth = 36f,
        viewportHeight = 36f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 22.0 4.5 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 s -1.0 0.448 -1.0 1.0 V 15.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 10.5 c 0.552 0.0 1.0 -0.448 1.0 -1.0 s -0.448 -1.0 -1.0 -1.0 h -8.086 l 8.793 -8.793 c 0.39 -0.39 0.39 -1.024 0.0 -1.414 c -0.39 -0.39 -1.024 -0.39 -1.414 0.0 L 22.0 12.586 V 4.5 Z M 3.5 21.0 c 0.0 0.552 0.448 1.0 1.0 1.0 h 8.086 l -8.793 8.793 c -0.39 0.39 -0.39 1.024 0.0 1.414 c 0.39 0.39 1.024 0.39 1.414 0.0 L 14.0 23.414 V 31.5 c 0.0 0.552 0.448 1.0 1.0 1.0 s 1.0 -0.448 1.0 -1.0 V 21.0 c 0.0 -0.552 -0.448 -1.0 -1.0 -1.0 H 4.5 c -0.552 0.0 -1.0 0.448 -1.0 1.0 Z")
        )
    }.build()
}
