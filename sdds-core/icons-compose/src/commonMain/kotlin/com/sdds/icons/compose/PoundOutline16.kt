package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.PoundOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "PoundOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 4.9 4.7 c 0.276 0.0 0.5 0.224 0.5 0.5 v 5.1 h 2.02 c 0.276 0.0 0.5 0.224 0.5 0.5 s -0.224 0.5 -0.5 0.5 H 4.97 c -0.315 0.0 -0.57 -0.255 -0.57 -0.57 V 5.2 c 0.0 -0.276 0.224 -0.5 0.5 -0.5 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathData = addPathNodes("M 8.68 4.7 c -0.276 0.0 -0.5 0.224 -0.5 0.5 v 5.53 c 0.0 0.315 0.255 0.57 0.57 0.57 h 2.45 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 9.18 V 8.388 h 1.81 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 9.18 V 5.7 h 1.81 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 8.68 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 1.0 7.998 C 1.0 4.133 4.133 1.0 7.998 1.0 s 6.998 3.133 6.998 6.998 s -3.133 6.998 -6.998 6.998 S 1.0 11.863 1.0 7.998 Z M 7.998 2.0 C 4.685 2.0 2.0 4.686 2.0 7.998 c 0.0 3.313 2.685 5.998 5.998 5.998 s 5.998 -2.685 5.998 -5.998 C 13.996 4.686 11.311 2.0 7.998 2.0 Z")
        )
    }.build()
}
