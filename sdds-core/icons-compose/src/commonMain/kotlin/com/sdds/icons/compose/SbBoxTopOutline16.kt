package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.SbBoxTopOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "SbBoxTopOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 12.375 10.6 c 0.276 0.0 0.5 0.223 0.5 0.5 c 0.0 0.276 -0.224 0.5 -0.5 0.5 h -8.4 c -0.276 0.0 -0.5 -0.224 -0.5 -0.5 s 0.224 -0.5 0.5 -0.5 h 8.4 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.175 6.55 c 0.483 0.0 0.875 0.392 0.875 0.875 S 8.658 8.3 8.175 8.3 S 7.3 7.908 7.3 7.425 S 7.692 6.55 8.175 6.55 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 14.65 5.0 c 0.663 0.0 1.2 0.538 1.2 1.2 v 2.45 c 0.0 0.663 -0.537 1.2 -1.2 1.2 H 1.7 c -0.662 0.0 -1.2 -0.537 -1.2 -1.2 V 6.2 C 0.5 5.537 1.037 5.0 1.7 5.0 h 12.95 Z M 1.7 6.0 C 1.59 6.0 1.5 6.09 1.5 6.2 v 2.45 c 0.0 0.11 0.09 0.2 0.2 0.2 h 0.9 V 6.0 H 1.7 Z m 12.05 2.85 h 0.9 c 0.11 0.0 0.2 -0.09 0.2 -0.2 V 6.2 c 0.0 -0.11 -0.09 -0.2 -0.2 -0.2 h -0.9 v 2.85 Z m -10.15 0.0 h 9.15 V 6.0 H 3.6 v 2.85 Z")
        )
    }.build()
}
