package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentPasteFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentPasteFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.25 0.6 c 0.362 0.0 0.687 0.154 0.915 0.4 H 10.7 c 0.98 0.0 1.47 0.0 1.845 0.19 c 0.329 0.168 0.597 0.436 0.765 0.765 C 13.5 2.33 13.5 2.82 13.5 3.8 v 8.4 c 0.0 0.98 0.0 1.47 -0.19 1.845 c -0.168 0.329 -0.436 0.597 -0.765 0.765 C 12.17 15.0 11.68 15.0 10.7 15.0 H 5.3 c -0.98 0.0 -1.47 0.0 -1.845 -0.19 c -0.329 -0.168 -0.597 -0.436 -0.765 -0.765 C 2.5 13.67 2.5 13.18 2.5 12.2 V 3.8 c 0.0 -0.98 0.0 -1.47 0.19 -1.845 c 0.168 -0.329 0.436 -0.597 0.765 -0.765 C 3.83 1.0 4.32 1.0 5.3 1.0 h 0.535 C 6.063 0.754 6.388 0.6 6.75 0.6 h 2.5 Z m -4.0 5.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 8.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 8.276 6.1 8.0 6.1 H 5.25 Z m 0.0 -2.275 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.5 Z M 6.75 1.5 C 6.612 1.5 6.5 1.612 6.5 1.75 S 6.612 2.0 6.75 2.0 h 2.5 C 9.388 2.0 9.5 1.888 9.5 1.75 S 9.388 1.5 9.25 1.5 h -2.5 Z")
        )
    }.build()
}
