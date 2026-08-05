package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.DocumentAddFill16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "DocumentAddFill16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 12.0 8.25 c 2.071 0.0 3.75 1.679 3.75 3.75 c 0.0 2.071 -1.679 3.75 -3.75 3.75 c -2.071 0.0 -3.75 -1.679 -3.75 -3.75 c 0.0 -2.071 1.679 -3.75 3.75 -3.75 Z m 0.001 1.355 c -0.193 0.0 -0.35 0.157 -0.35 0.35 v 1.695 H 9.954 c -0.193 0.0 -0.35 0.158 -0.35 0.351 c 0.0 0.193 0.157 0.35 0.35 0.35 h 1.695 v 1.695 c 0.0 0.193 0.158 0.35 0.351 0.35 c 0.193 -0.001 0.35 -0.157 0.35 -0.35 V 12.35 h 1.695 c 0.193 0.0 0.35 -0.157 0.35 -0.35 c 0.0 -0.193 -0.157 -0.35 -0.35 -0.35 H 12.35 V 9.954 c 0.0 -0.193 -0.157 -0.349 -0.35 -0.35 Z")
        )
        addPath(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 9.25 0.6 c 0.362 0.0 0.687 0.154 0.915 0.4 H 10.7 c 0.98 0.0 1.47 0.0 1.845 0.19 c 0.329 0.168 0.597 0.436 0.765 0.765 C 13.5 2.33 13.5 2.82 13.5 3.8 v 3.957 C 13.03 7.59 12.526 7.5 12.0 7.5 c -2.485 0.0 -4.5 2.015 -4.5 4.5 c 0.0 1.153 0.434 2.204 1.146 3.0 H 5.3 c -0.98 0.0 -1.47 0.0 -1.845 -0.19 c -0.329 -0.168 -0.597 -0.436 -0.765 -0.765 C 2.5 13.67 2.5 13.18 2.5 12.2 V 3.8 c 0.0 -0.98 0.0 -1.47 0.19 -1.845 c 0.168 -0.329 0.436 -0.597 0.765 -0.765 C 3.83 1.0 4.32 1.0 5.3 1.0 h 0.535 C 6.063 0.754 6.388 0.6 6.75 0.6 h 2.5 Z m -4.0 5.5 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 H 8.0 c 0.276 0.0 0.5 -0.224 0.5 -0.5 S 8.276 6.1 8.0 6.1 H 5.25 Z m 0.0 -2.275 c -0.276 0.0 -0.5 0.224 -0.5 0.5 s 0.224 0.5 0.5 0.5 h 5.5 c 0.276 0.0 0.5 -0.224 0.5 -0.5 s -0.224 -0.5 -0.5 -0.5 h -5.5 Z M 6.75 1.5 C 6.612 1.5 6.5 1.612 6.5 1.75 S 6.612 2.0 6.75 2.0 h 2.5 C 9.388 2.0 9.5 1.888 9.5 1.75 S 9.388 1.5 9.25 1.5 h -2.5 Z")
        )
    }.build()
}
