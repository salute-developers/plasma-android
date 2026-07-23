package com.sdds.icons.compose

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

public val SddsIcons.FlasherOutline24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "FlasherOutline24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 12.75 3.749 c 0.0 -0.414 -0.335 -0.75 -0.75 -0.75 c -0.413 0.0 -0.75 0.336 -0.75 0.75 v 3.497 c 0.0 0.414 0.337 0.75 0.75 0.75 c 0.415 0.0 0.75 -0.336 0.75 -0.75 V 3.749 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 19.78 6.656 c 0.293 -0.293 0.293 -0.768 0.0 -1.061 c -0.293 -0.293 -0.768 -0.293 -1.06 0.0 l -1.768 1.768 c -0.293 0.293 -0.293 0.768 0.0 1.06 c 0.293 0.293 0.767 0.293 1.06 0.0 l 1.768 -1.767 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathData = addPathNodes("M 4.222 5.607 c 0.293 -0.293 0.767 -0.293 1.06 0.0 L 7.05 7.375 c 0.293 0.293 0.293 0.767 0.0 1.06 c -0.293 0.293 -0.768 0.293 -1.06 0.0 L 4.221 6.668 c -0.293 -0.293 -0.293 -0.768 0.0 -1.061 Z")
        )
        addPath(
            fill = SolidColor(Color.White.copy(alpha = 0.9607843f)),
            pathFillType = PathFillType.EvenOdd,
            pathData = addPathNodes("M 16.87 13.085 l 0.338 6.406 h 1.043 c 0.414 0.0 0.75 0.336 0.75 0.75 s -0.336 0.75 -0.75 0.75 H 5.75 c -0.414 0.0 -0.75 -0.336 -0.75 -0.75 s 0.336 -0.75 0.75 -0.75 h 1.034 l 0.337 -6.406 c 0.091 -1.726 1.517 -3.08 3.246 -3.08 h 3.256 c 1.729 0.0 3.155 1.354 3.246 3.08 Z m -8.25 0.079 c 0.05 -0.93 0.817 -1.658 1.748 -1.658 h 3.256 c 0.931 0.0 1.7 0.728 1.748 1.658 l 0.334 6.327 h -7.42 l 0.334 -6.327 Z")
        )
    }.build()
}
