package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.BookOutline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "BookOutline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 3.918 11.887 H 3.5 V 3.1 C 3.5 2.492 3.993 2.0 4.6 2.0 h 7.398 c 0.276 0.0 0.5 0.224 0.5 0.5 v 8.887 c 0.0 0.276 -0.224 0.5 -0.5 0.5 H 4.765 l -0.666 -0.008 H 4.078 c -0.054 0.0 -0.107 0.003 -0.16 0.008 Z m 1.198 1.0 h 6.882 c 0.828 0.0 1.5 -0.672 1.5 -1.5 V 2.5 c 0.0 -0.828 -0.672 -1.5 -1.5 -1.5 H 4.6 C 3.44 1.0 2.5 1.94 2.5 3.1 v 10.334 l 0.022 -0.015 v 0.02 v 0.021 C 2.53 14.309 3.214 14.993 4.061 15.0 h 0.021 H 12.8 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 H 4.082 H 4.068 c -0.3 -0.002 -0.543 -0.245 -0.546 -0.546 V 13.44 v -0.014 c 0.002 -0.271 0.2 -0.495 0.459 -0.538 h 0.778 l 0.294 0.003 c 0.022 0.0 0.043 0.0 0.063 -0.003 Z")
        )
    }.build()
}
